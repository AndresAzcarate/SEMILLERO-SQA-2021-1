package com.advantageonlineshopping.automation.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

public class RegisterNewUserStepDefinitions {
    public WebDriver driver;

    @Given("^that test$")
    public void thatTest() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^That a web user wants to register in advantage shopping online$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnline() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.advantageonlineshopping.com/#/");
        // IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("^He fills all the requested fields$")
    public void heFillsAllTheRequestedFields() {
        driver.findElement(By.id("menuUser")).click();

        // EXPLICIT WAIT - Wait until the element 'CREATE NEW ACCOUNT' can be clicked.
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='CREATE NEW ACCOUNT']"))).click();

        // EXPLICIT WAIT - Wai until the element "usernameRegisterPage" can be clicked.
        wait.until(ExpectedConditions.elementToBeClickable(By.name("usernameRegisterPage"))).sendKeys("AndresAzcarate3");

        // Fill out the form.
        driver.findElement(By.name("emailRegisterPage")).sendKeys("asar170917@gmail.com");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("Azcarate123");
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Azcarate123");
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Andres");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Azcarate");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3203877341");
        driver.findElement(By.name("countryListboxRegisterPage")).click();
        driver.findElement(By.xpath("//*[text()=\"Colombia\"]")).click();
        driver.findElement(By.name("cityRegisterPage")).sendKeys("Madrid");
        driver.findElement(By.name("addressRegisterPage")).sendKeys("Av. Siempre Viva 123");
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("CMARCA");
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("250030");
        driver.findElement(By.name("i_agree")).click();
        driver.findElement(By.id("register_btnundefined")).click();
    }

    @Then("^He should see him username in the homepage$")
    public void heShouldSeeHimUsernameInTheHomepage() {
        // Checking if the profile is the one created.
        assertEquals(driver.findElement(By.xpath("//*[text()='AndresAzcarate3' and @class='hi-user containMiniTitle ng-binding']")).getText(), "AndresAzcarate3");
    }
}
