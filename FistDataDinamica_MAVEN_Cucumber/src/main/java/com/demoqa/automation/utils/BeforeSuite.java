package com.demoqa.automation.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Se reauitiliza método de asignación de datos de feature de artefacto de automatización de actualización de datos
 * dada la necesidad de asignar datos
 * del archivo de Excel al archivo .feature antes de comenzar a ejecutar
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeSuite {
}
