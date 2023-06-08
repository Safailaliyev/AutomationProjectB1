package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testedweb_signin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testedweb.com/");
        driver.manage().window().maximize();

       WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
       login.click();
       Thread.sleep(4000);


        WebElement signup = driver.findElement(By.xpath("//a[@href='/sign-up']"));
        signup.click();

//        String expectedUrl = "https://testedweb.com/log-in";
//        String actualUrl = driver.getCurrentUrl();
//
//       WebElement signup = driver.findElement(By.linkText("Sign up"));
//       signup.click();
//
//        expectedUrl = "https://testedweb.com/signup";
//        actualUrl = driver.getCurrentUrl();

    }
}
