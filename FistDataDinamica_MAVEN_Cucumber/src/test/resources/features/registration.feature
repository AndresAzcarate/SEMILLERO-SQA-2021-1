Feature: Elements Web Tables
  As a user of the demoqa website
  I search elements for web tables
  To create a new record and delete any records that are in the table

  Scenario Outline: Registration
    Given a web user wants to access demoqa
      | First Name | Last Name | Email | Age | Salary | Department |
      |<First Name>|<Last Name>|<Email>|<Age>|<Salary>|<Department>|
    When you have completed the necessary fields
      | First Name | Last Name | Email | Age | Salary | Department |
      |<First Name>|<Last Name>|<Email>|<Age>|<Salary>|<Department>|
    Then should then see the new record that has been created
      | First Name | Last Name | Email | Age | Salary | Department |
      |<First Name>|<Last Name>|<Email>|<Age>|<Salary>|<Department>|
    Examples:
    | First Name | Last Name | Email | Age | Salary | Department |
    ##@externaldata@src/main/resources/data/colpatriaData.xlsx@data@
   |pepito   |pruebas   |pepitopruebas@gmail.com   |23   |100000   |pruebas|

