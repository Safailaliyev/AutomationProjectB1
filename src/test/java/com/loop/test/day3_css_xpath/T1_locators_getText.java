package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    /*
     * go to docuport
     * enter username
     * do NOT enter password
     * click on login button
     * verify error message
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstant.USERNAME_CLIENT) ;

        WebElement loginButton =  driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        if(actualErrorMessage.equals(DocuportConstant.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstant.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + ". Test PASSED");
        }else{
            System.out.println("Expected error message: " + DocuportConstant.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT match actual error message: " + actualErrorMessage + ". Test FAIL");
        }









    }
}
