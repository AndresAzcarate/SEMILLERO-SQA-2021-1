package com.avianca.automation.models;
import com.avianca.automation.utils.Excel;
import java.lang.Math;

import java.io.IOException;

public class DataInjection {

    private String origin, destination, date, name, lastname, email, phone, filePath, sheetName;
    private int fil;
    private int colEmail;
    private int colName;
    private int colLastName;
    private int colOrigin;
    private int colDestination;
    private int colDate;
    private int colPhone;
    private String phoneInt;

    public int getColOrigin() {
        colOrigin=0;
        return colOrigin;
    }
    public int getColDestination() {
        colDestination=1;
        return colDestination;
    }
    public int getColName() {
        colName=2;
        return colName;
    }
    public int getColLastName() {
        colLastName=3;
        return colLastName;
    }
    public int getColEmail() {
        colEmail=4;
        return colEmail;
    }
    public int getColPhone() {
        colPhone=5;
        return colPhone;
    }
    public int getColDate() {
        colDate=6;
        return colDate;
    }
    /*
    public int getFil(){
        fil = 2;
        return (int)(Math.random()*2);
    }
    */
    public int getFil(){
        fil = 2;
        return fil;
    }
    public String getFilePath() {
        filePath = "Resources/Test.xlsx";
        return filePath;
    }
    public String getSheetName() {
        sheetName = "Data";
        return sheetName;
    }
    public String getOrigin() throws IOException {
        origin = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColOrigin());
        return origin;
    }
    public String getDestination() throws IOException {
        destination = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColDestination());
        return destination;
    }
    public String getDate() throws IOException {
        date = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColDate());
        return date;
    }
    public String getName() throws IOException {
        name = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColName());
        return name;
    }
    public String getLastName() throws IOException {
        lastname = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColLastName());
        return lastname;
    }
    public String getEmail() throws IOException {
        email = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColEmail());
        return email;
    }
    public String getPhone () throws IOException {
        phoneInt = Excel.getCellValue(getFilePath(), getSheetName(),getFil(), getColPhone());
        phone = String.valueOf(phoneInt);
        return phone;
    }
}

