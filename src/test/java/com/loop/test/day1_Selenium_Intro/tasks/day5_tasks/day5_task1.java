package com.loop.test.day1_Selenium_Intro.tasks.day5_tasks;

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class day5_task1 {
    WebDriver driver;
    String excepted;

    //1. go to http://the-internet.herokuapp.com/dropdown
    @BeforeMethod
    public void test1() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void selectOption() throws InterruptedException {


//2. validate "Please select an option" is selected by default
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        excepted = "Please select an option";
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), excepted);
        Thread.sleep(2000);

//3. Choose option 1 and validate that it is selected
        dropdown.selectByIndex(1);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1");
        dropdown.selectByValue("1");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1");
        dropdown.selectByVisibleText("Option 1");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1");

//4. Choose option 2 and validate that it is selected
        dropdown.selectByIndex(2);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2");
        dropdown.selectByValue("2");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2");
        dropdown.selectByVisibleText("Option 2");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2");

//5. Validate dropdown name is "Dropdown List"
        WebElement dropdownList = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(dropdownList.getText(), "Dropdown List" );

    }
}
