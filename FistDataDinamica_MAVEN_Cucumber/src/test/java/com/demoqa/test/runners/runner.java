package com.demoqa.test.runners;

import com.demoqa.automation.utils.BeforeSuite;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class runner extends Runner{
    private static final Logger logger = LogManager.getLogger(runner.class.getName());
    private Class<CucumberWithSerenity> classValue;
    private CucumberWithSerenity cucumberWithSerenity;

    public runner(Class<CucumberWithSerenity> classValue) throws IOException, InitializationError {
        this.classValue = classValue;
        cucumberWithSerenity = new CucumberWithSerenity(classValue);
    }

    @Override
    public Description getDescription() {
        return cucumberWithSerenity.getDescription();
    }

    private void runAnnotatedMethods(Class<?> annotation) throws InvocationTargetException, IllegalAccessException {

        if (!annotation.isAnnotation()){return;}

        Method[] methods= this.classValue.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation item : annotations) {
                if (item.annotationType().equals(annotation)) {
                    method.invoke(null);
                    break;
                }
            }
        }
    }

    @Override
    public void run(RunNotifier notifier) {
        try {
            runAnnotatedMethods(BeforeSuite.class);
            cucumberWithSerenity = new CucumberWithSerenity(classValue);
        } catch (InvocationTargetException| IllegalAccessException| InitializationError | IOException e) {
            logger.info(e);
        }
        cucumberWithSerenity.run(notifier);
    }
}


