package com.loop.test.day1_Selenium_Intro.tasks.day4_tasks;
/*
1. go to docuport
2. sign as adviser
3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
4. iterate and print out href values

optional step:
5. Validate that expected matching to actual

Home, Received docs, My uploads, Clients, Invitations, Users, Leads, Bookkeeping, 1099 form, Reconciliation

 */

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day4_task2 {
    @Test
    public  void testDocuport() throws InterruptedException {
        //1. go to docuport
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstant.DOCUPORT_URL);


        //2. sign as adviser
        WebElement usernameAdvisor = driver.findElement(By.id("input-14"));
        usernameAdvisor.sendKeys(DocuportConstant.USERNAME_ADVISOR);

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstant.PASSWORD_All);


        WebElement login = driver.findElement(By.className("v-btn__content"));
        login.click();
        Thread.sleep(2000);

        //3.store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
        List<WebElement> leftItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));
        System.out.println("leftItems= " + leftItems.size());

        for (WebElement each : leftItems) {
            if (!each.getText().equals("")) {
                System.out.println("leftItems= " + each.getText());
                System.out.println("============");
                System.out.println("leftItems= " + each.getAttribute("href"));
            }
        }

//5. Validate that expected matching to actual
            Thread.sleep(1000);
            System.out.println("TestNG is running");
            String [] actual = new String[leftItems.size()];
            String [] expected = {"Home", "Received docs", "My uploads", "Clients", "Invitations", "Users", "Leads", "Bookkeeping", "1099 Form", "Reconciliations"};

        for (int i = 0; i < leftItems.size(); i++) {
            actual[i] = leftItems.get(i).getText();

        }

            Assert.assertEquals(actual, expected);

            driver.quit();


    }

}
