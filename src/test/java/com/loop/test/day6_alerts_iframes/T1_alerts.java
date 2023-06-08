package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


import static org.testng.Assert.*;

public class T1_alerts extends TestBase {
    /*
    Information alert practice
    1. Open browser
    2. Go to website: http://the-internet.herokuapp.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
     */

    @Test
    public void informationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickForJSAlert.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageForInformationAlert.getText();
        String expected = "You successfully clicked an alert";
        assertEquals(expected,actual, "expected does not match the actual");

    }

    @Test
    public void confirmationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirm.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept(); //will click ok and accept
        WebElement successMessageConfirmationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageConfirmationAlert.getText();
        String expected = "You clicked: Ok";
        assertEquals(actual, expected, "expected does not match the actual");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss(); //will click cancel = will dismiss
        actual = successMessageConfirmationAlert.getText();
        expected = "You clicked: Cancel";
        assertEquals(actual, expected, "expected does not match the actual");

    }
    @Test
    public void promptClick(){
//        Prompt alert practice
//        1. Click to “Click for JS Prompt” button
//        2. Send "Loop Academy"
//        3. Click Ok
//        4. Validate "You entered: Loop Academy" text is displayed
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickForPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys("Loop Academy");
//        driver.switchTo().alert().accept();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessagePromptAlert.getText();
        String expected = "You entered: " + text;
        assertEquals(actual,expected, "expected does not match the actual");
    }
}
