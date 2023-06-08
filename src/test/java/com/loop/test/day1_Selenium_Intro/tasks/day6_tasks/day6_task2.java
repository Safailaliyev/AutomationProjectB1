package com.loop.test.day1_Selenium_Intro.tasks.day6_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class day6_task2 extends TestBase {
  @Test
    public void iframes() throws InterruptedException {
    // 1. go to https://demoqa.com/nestedframes
    driver.get("https://demoqa.com/nestedframes");
            //2. Validate "Child Iframe" text
    driver.switchTo().frame("frame1");
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
    WebElement childIframe = driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
    String actual = childIframe.getText();
    String expected = "Child Iframe";
    assertEquals(actual, expected,"actual does not match expected");

    //3. Validate "Parent frame" text
    driver.switchTo().parentFrame();
    WebElement parentIframe = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
    String actual1 = parentIframe.getText();
    String expected1 = "Parent frame";
    assertEquals(actual1, expected1, "actual does not match expected");

    //4. Validate the "Sample Nested Iframe page. There are nested iframes in this page.
    driver.switchTo().defaultContent();
    WebElement sampleIframe = driver.findElement(By.xpath("//div[@id='framesWrapper']"));
    String  actual2 = sampleIframe.getText();
    String expected2 = "Sample Nested Iframe page. There are nested iframes in this page. " +
            "Use browser inspecter or firebug to check out the HTML source. " +
            "In total you can switch between the parent frame and the nested child frame.";

  }
}
