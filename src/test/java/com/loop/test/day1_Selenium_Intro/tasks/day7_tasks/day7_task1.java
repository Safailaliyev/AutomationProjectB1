package com.loop.test.day1_Selenium_Intro.tasks.day7_tasks;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class day7_task1 extends TestBase {
  //  0. complete the method - returnAnyField - that it can handle "phone number", "role", "advisor" fields


    @Test
    public  void validateTestTable() throws InterruptedException {
        //    1. login as an advisor
        DocuportUtils.loginDocuport(driver, DocuportConstant.ADVISOR);

        //    2. go to users
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();

        //    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
       String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ALEX_DE_SOUZA_EMAIL, DocuportConstant.ALL_FULL_NAME);
        String expected = DocuportConstant.ALEX_DE_SOUZA_FULL_NAME;
        System.out.println("actual = " + actual);
        assertEquals(actual, expected);
        Thread.sleep(4000);

        //    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ALEX_DE_SOUZA_EMAIL, DocuportConstant.ALL_USERNAME);
        String expected1 = DocuportConstant.ALEX_DE_SOUZA_USER_NAME;
        System.out.println("actual = " + actual1);
        assertEquals(actual1, expected1);

        //    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
        String actual2 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ALEX_DE_SOUZA_EMAIL, DocuportConstant.ALL_PHONE_NUMBER);
        String expected2 = DocuportConstant.ALEX_DE_SOUZA_PHONE_NUMBER;
        System.out.println("actual = " + actual2);
        assertEquals(actual2, expected2);

        // 6. validate that role for alex.de.souza@gmail.com is client
        String actual3 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ALEX_DE_SOUZA_EMAIL, DocuportConstant.ALL_ROLE);
        String expected3 = DocuportConstant.ALEX_DE_SOUZA_ROLE;
        System.out.println("actual = " + actual3);
        assertEquals(actual3, expected3);
        //    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
        String actual4 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ALEX_DE_SOUZA_EMAIL, DocuportConstant.ALL_ADVISORS);
        String expected4 = DocuportConstant.ALEX_DE_SOUZA_ADVISOR;
        System.out.println("actual = " + actual4);
        assertEquals(actual4, expected4);
    }

    @Test
    public void supervisorValidate(){

        DocuportUtils.loginDocuport(driver, DocuportConstant.ADVISOR);

        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();

        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.SUPERVISOR_EMAIL, DocuportConstant.ALL_FULL_NAME);
        String expected = DocuportConstant.SUPERVISOR_FULL_NAME;
        System.out.println("actual = " + actual);
        assertEquals(actual, expected);


        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.SUPERVISOR_EMAIL, DocuportConstant.ALL_USERNAME);
        String expected1 = DocuportConstant.SUPERVISOR_USER_NAME;
        System.out.println("actual1 = " + actual1);
        assertEquals(actual1, expected1);


        String actual2 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.SUPERVISOR_EMAIL, DocuportConstant.ALL_PHONE_NUMBER);
        String expected2 = DocuportConstant.SUPERVISOR_PHONE_NUMBER;
        System.out.println("actual2 = " + actual2);
        assertEquals(actual2, expected2);


        String actual3 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.SUPERVISOR_EMAIL, DocuportConstant.ALL_ROLE);
        String expected3 = DocuportConstant.SUPERVISOR_ROLE;
        System.out.println("actual3 = " + actual3);
        assertEquals(actual3, expected3);

        String actual4 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.SUPERVISOR_EMAIL, DocuportConstant.ALL_ADVISORS);
        String expected4 = DocuportConstant.SUPERVISOR_ADVISOR;
        System.out.println("actual4 = " + actual4);
        assertEquals(actual4, expected4);
    }


    @Test
    public void validateAdvisor() {
//    -   b1g1_advisor@gmail.com

        DocuportUtils.loginDocuport(driver, DocuportConstant.ADVISOR);

        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();

        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ADVISOR_EMAIL, DocuportConstant.ALL_FULL_NAME);
        String expected = DocuportConstant.ADVISOR_FULL_NAME;
        System.out.println("actual = " + actual);
        assertEquals(actual, expected);


        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ADVISOR_EMAIL, DocuportConstant.ALL_USERNAME);
        String expected1 = DocuportConstant.ADVISOR_USER_NAME;
        System.out.println("actual1 = " + actual1);
        assertEquals(actual1, expected1);


        String actual2 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ADVISOR_EMAIL, DocuportConstant.ALL_PHONE_NUMBER);
        String expected2 = DocuportConstant.ADVISOR_PHONE_NUMBER;
        System.out.println("actual2 = " + actual2);
        assertEquals(actual2, expected2);


        String actual3 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ADVISOR_EMAIL, DocuportConstant.ALL_ROLE);
        String expected3 = DocuportConstant.ADVISOR_ROLE;
        System.out.println("actual3 = " + actual3);
        assertEquals(actual3, expected3);

        String actual4 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstant.ADVISOR_EMAIL, DocuportConstant.ALL_ADVISORS);
        String expected4 = DocuportConstant.ADVISOR_ADVISOR;
        System.out.println("actual4 = " + actual4);
        assertEquals(actual4, expected4);
    }

}
