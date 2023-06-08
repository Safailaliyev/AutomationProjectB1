package com.loop.test.day1_Selenium_Intro.tasks.day9_tasks;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class day9_task2 {

    @Test
    public void upload(){
        //    1. Go to https://loopcamp.vercel.app/upload.html
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));

        //2. Find some small file from your computer, and get the path of it.
        WebElement upload = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'File Upload')]"));
        upload.click();

        //3. Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/safailaliyev/Desktop/some-file.txt");
        WebElement clickUpload = Driver.getDriver().findElement(By.id("file-submit"));
        clickUpload.click();

        //4. Assert:
//            -File uploaded text is displayed on the page

        WebElement noSuccessMessage = Driver.getDriver().findElement(By.xpath("//div[@jstcache='17']"));
        String expected = "HTTP ERROR 405";
        assertEquals(noSuccessMessage.getText(), expected);





    }
}
