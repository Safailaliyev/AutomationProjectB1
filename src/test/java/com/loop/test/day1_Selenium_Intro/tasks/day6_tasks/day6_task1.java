package com.loop.test.day1_Selenium_Intro.tasks.day6_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class day6_task1 extends TestBase {

    @Test
    public void alerts() throws InterruptedException {
            //1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");

        //2. click - click button to see alert
        WebElement clickMe1 = driver.findElement(By.xpath("//button[contains(text(),'Click me')][1]"));
        clickMe1.click();

            //3handle alert
        driver.switchTo().alert().accept();

        //4. click - On button click, alert will appear after 5 seconds
        WebElement clickMe2 = driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]"));
        clickMe2.click();
        Thread.sleep(6000);

        //5. handle alert
        Alert alert =driver.switchTo().alert();
        alert.accept();

        //6. click - On button click, confirm box will appear
        WebElement clickMe3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        clickMe3.click();

        //7. click ok and validate - You selected Ok
        driver.switchTo().alert().accept();
        WebElement youSelectedOkAlert = driver.findElement(By.xpath("//span[@class='text-success']"));
        String actual = youSelectedOkAlert.getText();
        String expected = "You selected Ok";
        assertEquals(actual, expected,"actual does not match expected");

        //8. after that do it again this time cancel and validate - You selected Cancel
        clickMe3.click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        WebElement cancelAlert = driver.findElement(By.xpath("//span[@class='text-success']"));
        String actual1 = cancelAlert.getText();
        String expected1= "You selected Cancel";
        assertEquals(actual1, expected1,"actual does not match expected");

        //9. click - On button click, prompt box will appear
        WebElement clickMe4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        clickMe4.click();
        Thread.sleep(3000);

        //    10.  enter "Loop Academy" and validate You entered Loop Academy
        String text = "Loop Academy";
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        WebElement textAlert = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String actual2 = textAlert.getText();
        String expected2 = "You entered " + text;
        assertEquals(actual2, expected2,"actual does not match expected");

    }



//6. click - On button click, confirm box will appear
//7. click ok and validate - You selected Ok
//8. after that do it again this time cancel and validate - You selected Cancel
//9. click - On button click, prompt box will appear
//10. enter "Loop Academy" and validate You entered Loop Academy

}
