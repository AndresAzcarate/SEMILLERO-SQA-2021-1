package com.avianca.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

    public class Javascript {
        public static void clickJS(WebDriver driver, By by) throws InterruptedException {
            Times.waitFor(3000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(by));
        }
    }

