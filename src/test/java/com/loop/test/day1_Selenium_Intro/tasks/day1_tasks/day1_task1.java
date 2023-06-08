package com.loop.test.day1_Selenium_Intro.tasks.day1_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_task1 {

    /*
    1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();
        String expectedTittle = "Gmail";
        String actualTittle = driver.getTitle();

        if(expectedTittle.contains(actualTittle)){
            System.out.println("Actual title " + actualTittle + " matches with expected title " +expectedTittle + " --->TEST PASS" );
        }else{
            System.out.println("Actual title " + actualTittle + " does not matches with expected title " +expectedTittle + " ---> TEST FAil" );
        }

        driver.navigate().back();
        String expectedTittle1 = "Google";
        String actualTittle1 = driver.getTitle();
        if(expectedTittle1.equals(actualTittle1)){
            System.out.println("Actual title " + actualTittle1 + " matches with expected title " +expectedTittle1 + " --->TEST PASS" );
        }else{
            System.out.println("Actual title " + actualTittle1 + " does not matches with expected title " +expectedTittle1 + " ---> TEST FAil" );
        }


    }
}
