package com.loop.test.day1_Selenium_Intro.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogOut {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testedweb.com");
        driver.manage().window().maximize();


        WebElement login = driver.findElement(By.xpath("//a[@href='/log-in']"));
        login.click();

        WebElement signUp = driver.findElement(By.linkText(""));
        signUp.click();

    }
}
