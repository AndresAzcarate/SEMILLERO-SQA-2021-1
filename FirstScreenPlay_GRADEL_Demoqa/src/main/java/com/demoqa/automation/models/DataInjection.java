package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, email, lastName, mobileNumber,currentAddress,
            permanentAddress, extensionName, extensionEmail, extensionCurrentAddress, filepath, sheetName;

    public String getFirstName() {
        return firstName;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public DataInjection(){
        this.firstName = faker.name().name();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = faker.phoneNumber().subscriberNumber(10);
        this.currentAddress = faker.address().fullAddress();

        this.extensionName = "Name:";
        this.extensionEmail = "Email:";
        this.extensionCurrentAddress = "Current Address :";
        this.filepath = "resources/DataInjection.xlsx";
        this.sheetName = "DataInjection";
    }
}
