package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {

    /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
     */

//    @AfterMethod
//    public void quit(){
//        driver.quit();
//    }

    @Test
    public void validate_card_for_alexandra(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedCardNumber = "321456789012";
        String actualCardNumber = driver.findElement(By.xpath("//td[contains(text(),'321456789012')]")).getText();
        assertEquals(actualCardNumber, expectedCardNumber);
    }

    @Test
    public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);
    }

    @Test
    public void test_amount(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "John Doe";
        String expectedAmount = "3";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAmount);
    }
    @Test
    public void test_date(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Stewart Dawidson";
        String expectedDate = "03/29/2021";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Date"), expectedDate);
    }

    @Test

    public void test_street(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Bart Fisher";
        String expectedStreet = "35, Rock st.";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Street"), expectedStreet);
    }
    @Test
    public void test_city(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Ned Stark";
        String expectedCity = "Newcastle";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "City"), expectedCity);
    }

    @Test
    public void test_state(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Bob Martin";
        String expectedState = "US";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "State"), expectedState);
    }
    @Test
    public void test_zip(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Samuel Jackson";
        String expectedZip = "53665";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Zip"), expectedZip);
    }
    @Test
    public void test_card(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Robert Baratheon";
        String expectedCard = "MasterCard";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "MasterCard"), expectedCard);
    }

    @Test
    public void test_exp(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "John Doe";
        String expectedExp = "01/23";
        assertEquals(PizzaOrderWebTablesUtils.returnAnyFieldValue(driver, name, "Exp"), expectedExp);
    }


    @Test
    public void automatePayment(){
        driver.get("https://app.docuport.app/company-formation/resident");
        WebElement formationStation = driver.findElement(By.xpath("(//input[contains(@type,'radio')])[5]//following-sibling::div"));
        formationStation.click();

        WebElement companyName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        companyName.sendKeys("Passworld");

        WebElement industry = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        industry.click();

        WebElement choosing = driver.findElement(By.xpath("//div[contains(text(),'Agents')]/.."));
        choosing.click();

        WebElement firstName= driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        firstName.sendKeys("Aliyev");

        WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        lastName.sendKeys("Safail");

        WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
        email.sendKeys("safail.aliyev@gmail.com");

        WebElement phoneNumber = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        phoneNumber.sendKeys("2020202020");

        WebElement nextButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        nextButton.click();

        WebElement firstName1= driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        firstName1.sendKeys("Aliyev");

        WebElement lastName1 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        lastName1.sendKeys("Safail");



    }

    }


//    finish pizza order webtable task which we started at class
//
//
//task2
//=============
//
//        automate till payment
//        https://app.docuport.app/company-formation/resident


