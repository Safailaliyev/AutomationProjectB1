package com.loop.test.day1_Selenium_Intro.tasks.day5_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class day5_task2 {
    WebDriver driver;
    String excepted;

    //1. go to https://www.etsy.com/
    @BeforeMethod
    public void test1() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.quit();
    }

    @Test
    public void etsy() {
        //2. search for rings
        WebElement search = driver.findElement(By.name("search_query"));
        search.click();
        String searchFor = "rings";
        search.sendKeys(searchFor + Keys.ENTER);

//3. validate that Estimated Arrival shows any time
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Estimated Arrival')]"));
        excepted = "Estimated Arrival Any time";
        Assert.assertEquals(dropdown.getText(), excepted);
        //3. click Estimated Arrival dropdown
        dropdown.click();

//4. click Select custom date
        WebElement customDate = driver.findElement(By.xpath("//select[@name='delivery_days']"));
        customDate.click();
//5. choose may 30 from dropdown
        Select selectDate = new Select(driver.findElement(By.xpath("//select[@name='delivery_days']")));
        selectDate.selectByVisibleText("By May 30");
//6. validate Estimated Arrival shows may 30
        WebElement may30 = driver.findElement(By.xpath("//span[contains(text(),'Estimated Arrival')]"));
        Assert.assertEquals(may30.getText(), "Estimated Arrival By May 30");


    }
}
