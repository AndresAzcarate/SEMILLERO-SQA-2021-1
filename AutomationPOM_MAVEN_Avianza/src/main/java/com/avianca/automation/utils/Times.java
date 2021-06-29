package com.avianca.automation.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Times {
    public static void waitFor(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    public static void waitExplicit(WebDriver driver, By by){
        //Explict Wait
        WebDriverWait ewait = new WebDriverWait(driver, 10);
        ewait.until(ExpectedConditions.elementToBeSelected(by));
    }
}
