package com.loop.test.day1_Selenium_Intro.tasks.day9_tasks;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class day9_task1 {

    @Test
    public void hoverDisplayed() throws InterruptedException {

        //    b. “view profile” is displayed
        WebElement viewProfile = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/1.html')]"));
        String actual1 = viewProfile.getText();
        String expected1 = "View profile";
        assertEquals(actual1, expected1, "no match detected");

        //2. Hover over to second image
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        Actions actions1 = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions1.moveToElement(user2).perform();

        // 3. Assert:
        //    a. “name: user2” is displayed
        WebElement nameUser2 = Driver.getDriver().findElement(By.xpath("//h5[contains(text(),'user2')]"));
        String actual2 = nameUser2.getText();
        String expected2 = "name: user2";
        assertEquals(actual2, expected2,"does not match ");

        //    b. “view profile” is displayed
        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/2.html')]"));
        String actual3 = viewProfile2.getText();
        String expected3 = "View profile";
        assertEquals(actual3, expected3,"does not match ");


        //2. Hover over to second image
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
        Actions actions2 = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions2.moveToElement(user3).perform();

        // 3. Assert:
        //    a. “name: user3” is displayed
        WebElement nameUser3 = Driver.getDriver().findElement(By.xpath("//h5[contains(text(),'user3')]"));
        String actual4 = nameUser3.getText();
        String expected4 = "name: user3";
        assertEquals(actual4, expected4,"does not match ");

        //    b. “view profile” is displayed
        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/3.html')]"));
        String actual5 = viewProfile3.getText();
        String expected5 = "View profile";
        assertEquals(actual5, expected5,"does not match ");

    }
}
