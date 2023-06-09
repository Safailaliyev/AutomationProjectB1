package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_JSExecutor_scroll {
 /*
    1. Go to https://www.etsy.com
    2. Scroll down
    3. Generate random email and enter into subscribe box
    4. Click on Subscribe
    5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */

    @Test

    public void etsy_scroll_test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
        WebElement emailBox1 = Driver.getDriver().findElement(By.xpath("//input[@id='email-list-signup-email-input']"));
        Actions actions1 = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        //#2 just use Key Press
       // actions1.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //#3 move horizontally or vertically
        //js.executeScript("window.scrollBy(0,5000)");

        js.executeScript("arguments[0].scrollIntoView(true)", emailBox1);
        js.executeScript("arguments[0].click", emailBox1);
        js.executeScript("arguments[0].scrollIntoView(true)", emailBox1);

    }
    @Test
            public void etsy_scroll_test2() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
        WebElement emailBox = Driver.getDriver().findElement(By.xpath("//input[@id='email-list-signup-email-input']"));
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions.scrollToElement(emailBox).perform();




    }

    }



