package com.loop.test.day1_Selenium_Intro.tasks.day3_tasks;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_task2 {

    /*
    1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to docuport application
        driver.navigate().to(DocuportConstant.DOCUPORT_URL);

        //validate placeholders for user name
        WebElement userNamePlaceHolder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUsernamePlaceHolder = userNamePlaceHolder.getText();

        if(actualUsernamePlaceHolder.equalsIgnoreCase(DocuportConstant.EXPECTED_PLACEHOLDER_USERNAME)){
            System.out.println("Expected username placeholder: " + DocuportConstant.EXPECTED_PLACEHOLDER_USERNAME + ", matches actual placeholder: " + actualUsernamePlaceHolder + ". Test PASSED");
        }else{
            System.out.println("Expected username placeholder: " + DocuportConstant.EXPECTED_PLACEHOLDER_USERNAME + ", DOES NOT match actual placeholder: " + actualUsernamePlaceHolder + ". Test FAILED");
        }


        ////validate placeholders for password
        WebElement passwordPlaceHolder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceHolder = passwordPlaceHolder.getText();

        if(actualPasswordPlaceHolder.equalsIgnoreCase(DocuportConstant.EXPECTED_PLACEHOLDER_PASSWORD)){
            System.out.println("Expected password placeholder: " + DocuportConstant.EXPECTED_PLACEHOLDER_PASSWORD + ", matches actual placeholder: " + actualPasswordPlaceHolder + ". Test PASSED");
        }else{
            System.out.println("Expected password placeholder: " + DocuportConstant.EXPECTED_PLACEHOLDER_PASSWORD + ", DOES NOT match actual placeholder: " + actualPasswordPlaceHolder + ". Test FAILED");
        }

        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginButton.click();


        WebElement userNameError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
        String actualUsernameErrorMessage = userNameError.getText();

        if(userNameError.isDisplayed()){
            System.out.print("Expected username error message : " + DocuportConstant.EXPECTED_MESSAGE_FOR_EMPTY_USERNAME + ", matches actual error message: " + actualUsernameErrorMessage + ". Test Pass");

        }else{
            System.out.println("Expected username error message : " + DocuportConstant.EXPECTED_MESSAGE_FOR_EMPTY_USERNAME + ", DOES NOT match actual error message: " + actualUsernameErrorMessage + ". Test FAILED");
        }

        WebElement passwordErrormessage = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));
        String actualPasswordErrorMessage = passwordErrormessage.getText();

        if(passwordErrormessage.isDisplayed()){
            System.out.println("Expected password error message : " + DocuportConstant.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual password error message: " + actualPasswordErrorMessage + ". Test PASSED");
        }else{
            System.out.println("Expected password error message : " + DocuportConstant.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT match actual password error message: " + actualPasswordErrorMessage + ". Test FAILED");
        }


    }
}
