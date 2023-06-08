package com.loop.test.day1_Selenium_Intro.tasks.day1_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_task2 {
    /*
    1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
     */


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.name("search_query"));
        search.click();
        String searchFor = "wooden spoon";
        search.sendKeys(searchFor + Keys.ENTER);

        String expectedTittle = "Wooden Spoon | Etsy";
        String actualTittle = driver.getTitle();
        if (actualTittle.contains(expectedTittle)) {

            System.out.println("Actual tittle: " + actualTittle + " matched expected tittle: " + expectedTittle + " ---> TEST PASS");
        }else {

            System.out.println("Actual tittle: " + actualTittle + "   match expected tittle: " + expectedTittle + " ---> TEST FAIL");
        }

    }
}
