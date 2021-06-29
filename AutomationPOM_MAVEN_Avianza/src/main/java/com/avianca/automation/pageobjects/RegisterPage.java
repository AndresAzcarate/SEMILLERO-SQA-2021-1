package com.avianca.automation.pageobjects;

import com.avianca.automation.models.DataInjection;
import com.avianca.automation.utils.Excel;
import com.avianca.automation.utils.Javascript;
import com.avianca.automation.utils.Times;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.avianca.com/co/es/")

public class RegisterPage extends PageObject {
    DataInjection dataInjection = new DataInjection();
    public By reserveClick = By.id("reservatuvuelo");
    public By oneWayClick = By.xpath("//a[contains(text(), 'Solo ida')]");
    public By selectOriginInput = By.xpath("//div[@class='form-group new-animate  new-focus']//input[@aria-required  and not(@aria-invalid)]");
    public By selectDestinationInput = By.xpath("(//div[@class='form-group new-animate ' or @class='form-group new-animate  new-focus']//input[@type='text'])[last()]");
    public By calendarClick = By.xpath("//div/input[@class='form-control solo-ida x-mvvm' or @class='form-control solo-ida x-mvvm valid']");
    public By selectDay = By.xpath("(//div[@data-day='"+dataInjection.getDate()+"'])[last()]");
    public By goButton = By.xpath("(//button[@class='btn primary btn-codepromo pull-btn rojo'])[last()]");
    public By selectFlightClick = By.xpath("(//button[@class='select-cabin-button'])[3]");
    public By selectPriceClick = By.xpath("(//button[@class='ff-price-container'])[2]");
    public By confirmPriceClick = By.id("continue-btn-footer");
    public By nameInput = By.xpath("(//input[@autocomplete='given-name'])[1]");
    public By lastNameInput = By.xpath("(//input[@autocomplete='family-name'])[1]");
    public By confirmTicketClick = By.xpath("//button[@class='btn-primary passenger-btn ng-star-inserted']");
    public By emailInput = By.xpath("//input[@autocomplete='email']");
    public By phoneInput = By.xpath("//input[@autocomplete='tel-national']");
    public By termsCheckBox = By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]");
    public By saveClick = By.xpath("//button[@aria-label='Guardar y continuar']");
    public By buyClick = By.xpath("//button[@class='btn-primary continue-btn' and @id='continue-btn-footer-static']");
    public By detailValidation = By.xpath("(//button[@class='link-item'])[1]");
    public By nameValidation = By.xpath("(//div[@class='name ng-star-inserted'])[last()]");
    public By emailValidation = By.xpath("//div[contains (text(), '@')]");
    public By phoneValidation = By.xpath("//div[contains (text(), '+57 3')] ");

    public RegisterPage() throws IOException {
    }

    public void clickReserve() throws InterruptedException {
        getDriver().findElement(reserveClick).click();
    }

    public void clickOneWay() throws InterruptedException {
        getDriver().findElement(oneWayClick).click();
        WebDriverWait ewait = new WebDriverWait(getDriver(), 20);
        ewait.until(ExpectedConditions.elementToBeClickable(oneWayClick));
    }
    public void sendSelectOrigin() throws InterruptedException, IOException {
        getDriver().findElement(selectOriginInput).click();
        getDriver().findElement(selectOriginInput).sendKeys(dataInjection.getOrigin());
        getDriver().findElement(selectOriginInput).sendKeys(Keys.ARROW_DOWN);
        getDriver().findElement(selectOriginInput).sendKeys(Keys.ENTER);
    }
    public void sendSelectDestination() throws InterruptedException, IOException {
        getDriver().findElement(selectDestinationInput).sendKeys(dataInjection.getDestination());
        getDriver().findElement(selectDestinationInput).sendKeys(Keys.ARROW_DOWN);
        getDriver().findElement(selectDestinationInput).sendKeys(Keys.ENTER);
    }
    public void clickSelectDate() throws InterruptedException {
        getDriver().findElement(calendarClick).click();
        WebDriverWait ewait = new WebDriverWait(getDriver(), 10);
        ewait.until(ExpectedConditions.elementToBeClickable(calendarClick));
        Javascript.clickJS(getDriver(),selectDay);
        Times.waitFor(1000);
    }
    public void clickButtonGo() throws InterruptedException {
        getDriver().findElement(goButton).click();
        Times.waitFor(2000);
    }
    public void clickTicket () throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        getDriver().findElement(selectFlightClick).click();
        Times.waitFor(2000);
        getDriver().findElement(selectPriceClick).click();
        Times.waitFor(2000);
        getDriver().findElement(confirmPriceClick).click();
        Times.waitFor(2000);
    }
    public void sendDataTicket() throws InterruptedException, IOException {
        getDriver().manage().timeouts().pageLoadTimeout( 10,TimeUnit.SECONDS);
        getDriver().findElement(nameInput).sendKeys(dataInjection.getName());
        Times.waitFor(2000);
        getDriver().findElement(lastNameInput).sendKeys(dataInjection.getLastName());
        Times.waitFor(2000);
        Javascript.clickJS(getDriver(),confirmTicketClick);
        Times.waitFor(2000);
        getDriver().findElement(emailInput).sendKeys(dataInjection.getEmail());
        Times.waitFor(2000);
        getDriver().findElement(phoneInput).sendKeys(dataInjection.getPhone());
        Times.waitFor(2000);
        Javascript.clickJS(getDriver(),termsCheckBox);
        Times.waitFor(2000);
        Javascript.clickJS(getDriver(),saveClick);
        Times.waitFor(3000);
        Javascript.clickJS(getDriver(),buyClick);
        getDriver().manage().timeouts().pageLoadTimeout( 20,TimeUnit.SECONDS);
        getDriver().findElement(detailValidation).click();
        getDriver().manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
    }
    public void dataValidations() throws InterruptedException, IOException {
        assertEquals(getDriver().findElement(nameValidation).getText(), dataInjection.getName()+ " " + dataInjection.getLastName());
        Times.waitFor(2000);
        assertEquals(getDriver().findElement(emailValidation).getText(), dataInjection.getEmail());
        Times.waitFor(2000);
    }
}
