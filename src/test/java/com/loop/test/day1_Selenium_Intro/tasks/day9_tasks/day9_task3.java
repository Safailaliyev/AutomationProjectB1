package com.loop.test.day1_Selenium_Intro.tasks.day9_tasks;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class day9_task3 {
//    1. Open a chrome browser
//2. Go to: https://loopcamp.vercel.app/
//            3. Scroll down to “Powered by LOOPCAMP”
//            4. Scroll using Actions class “moveTo(element)” method


    @Test
    public void usingMoveTo() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement poweredByLoop = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'LOOPCAMP')]"));
        Actions actions1 = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions1.moveToElement(poweredByLoop).perform();

        //WebElement loop = Driver.getDriver().findElement(By.xpath("//li[@class='nav-item']"));
        Actions action = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        action.sendKeys(Keys.PAGE_UP).perform();





























//        1. Continue from where the Task 4 is left in the same test.
//        2. Scroll back up to Loop Academy link/picture using PageUP button
//
//        extra task - no need jira user story
//============
//        1. login docuport as a advisor
//        2. go to my loads
//        3. try to upload a file
//        (do not spend more than 20 mins, if you can not, can not)

    }
}
