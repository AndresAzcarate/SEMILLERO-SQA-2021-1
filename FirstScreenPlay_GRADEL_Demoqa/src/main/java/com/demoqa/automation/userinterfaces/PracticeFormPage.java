package com.demoqa.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormPage {
    public static String URL = "https://demoqa.com/automation-practice-form";

    public static final Target FIRST_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_SELECT = Target.the("").located(By.id("gender-radio-1"));
    public static final Target MOBILE_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH_BOX = Target.the("").located(By.id("dateOfBirthInput"));

    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));

    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));

    public static final Target BOX_VALIDATION = Target.the("").located(By.className("modal-content"));
}
