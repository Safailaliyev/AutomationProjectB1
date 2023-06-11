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

    }
}
