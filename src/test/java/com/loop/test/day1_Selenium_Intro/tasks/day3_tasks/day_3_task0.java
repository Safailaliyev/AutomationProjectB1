package com.loop.test.day1_Selenium_Intro.tasks.day3_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day_3_task0 {
    /*
    1. go to http://the-internet.herokuapp.com/forgot_password
2. locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
3. use css
4. verify those elements are displayed
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement forgetPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));

        if (forgetPassword.isDisplayed()){
            System.out.println("Forget password heading is displayed");
        } else {
            System.out.println("Forget password heading is NOT displayed");
        }

        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        if (email.isDisplayed()){
            System.out.println("Email is displayed");
        } else {
            System.out.println("Email is NOT displayed");

        }

        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        if (email.isDisplayed()){
            System.out.println("Email input is displayed");
        } else {
            System.out.println("Email input is NOT displayed");
        }

        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        if (retrievePassword.isDisplayed()){
            System.out.println("Retrieve Password is displayed");
        } else {
            System.out.println("Retrieve Password is NOT displayed");
        }

        WebElement poweredSelenium = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        if (poweredSelenium.isDisplayed()){
            System.out.println("Powered selenium  is displayed");
        } else {
            System.out.println("Powered selenium is NOT displayed");
        }

    }
}
