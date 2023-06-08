package com.loop.test.day1_Selenium_Intro.tasks.day1_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_task3 {

    /*
    1. Open Docuport app
2. Send UserName
3. Send password
4. Click login
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.docuport.app/");
        driver.manage().window().maximize();


        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g3_supervisor@gmail.com") ;


        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys("Group3") ;

        WebElement login= driver.findElement(By.className("v-btn__content") );
        login.click() ;

    }
}
