package com.loop.test.day4_xpath_findElement;

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_xpath_gettext_staleElement {
    /*
    1. Open Chrome browser
    2. Go to docuport
    3. Click on forgot password
    4. validate URL contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate cancel button is displayed
    8. validate send button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */

    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        // 2. Go to docuport
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");


        //3. Click on forgot password
        WebElement forgetPassword = driver.findElement(By.xpath("//a[.='Forgot password?']"));
        forgetPassword.click();

        //4. validate URL contains: reset-password

        String actualUrlForResetPassword = driver.getCurrentUrl();

        if(actualUrlForResetPassword.contains(DocuportConstant.RESET_PASSWORD_URL)){
            System.out.println("Actual url: "+ actualUrlForResetPassword + " contains expected url: " + DocuportConstant.RESET_PASSWORD_URL);
        }else{
            System.out.println("Actual url: "+ actualUrlForResetPassword + " does not contains expected url: " + DocuportConstant.RESET_PASSWORD_URL);
        }

        //5. validate - Enter the email address associated with your account
        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage = validateMessage.getText();

        if (actualValidateMessage.contains(DocuportConstant.RESET_PASSWORD_MESSAGE)){
            System.out.println("Actual validate message: \""+actualValidateMessage+"\" contains expected message \""+DocuportConstant.RESET_PASSWORD_MESSAGE + "Test Pass");
        }else {
            System.out.println("Actual validate message: \""+actualValidateMessage+"\" doesnt contains expected message \""+DocuportConstant.RESET_PASSWORD_MESSAGE + "Test Fail");

        }

        //6. enter forgotpasswordg1@gmail.com to email box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='email']"));
        emailInputBox.sendKeys(DocuportConstant.EMAIL_FOR_RESET_PASSWORD);


        //7. validate cancel button is displayed
        WebElement cancelButton = driver.findElement(By.xpath("//span[.=' Cancel ']"));
        WebElement sendButton = driver.findElement(By.xpath("//span[.=' Send ']"));

        if (cancelButton.isDisplayed()){
            System.out.println("Cancel button is displayed" + " Test Pass");
        } else {
            System.err.println("Cancel button is NOT displayed"+ " Test Fail");
        }

        // 8. validate send button is displayed


        if (sendButton.isDisplayed()){
            System.out.println("Send button is displayed" + " Test Pass");
        } else {
            System.err.println("Send button is NOT displayed" + " Test Fail");
        }

        //9. click send button

        sendButton.click();

        Thread.sleep(3000);

        //10. validate - We've sent you an email with a link to reset your password. Please check your email

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));
        Thread.sleep(3000);

        try{
            System.out.println(successMessage.getText() + " we successfully got the message");
        } catch (StaleElementReferenceException e){
            System.out.println("Element is not accessible anymore");
            e.printStackTrace();
        }


















driver.quit();
    }
}
