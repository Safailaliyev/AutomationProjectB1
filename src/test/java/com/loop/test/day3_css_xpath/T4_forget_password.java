package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forget_password {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/");
        driver.manage().window().maximize();

        // forget password link
        WebElement forgetpasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetpasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println(forgetPasswordHeading.getText());



    }
}
