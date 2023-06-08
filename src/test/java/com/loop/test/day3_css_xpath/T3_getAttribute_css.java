package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_css {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/");
        driver.manage().window().maximize();

        //identify logo with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");


       // String actualPlaceHolder = docuport.getAttribute("placeholder");

        if(DocuportConstant.LOGO_DOCUPORT.equalsIgnoreCase(docuport)){
            System.out.println("Expected logo text: " + DocuportConstant.LOGO_DOCUPORT + ", matches actual logo text: " + docuport + ". Test PASSED");
        }else{
            System.out.println("Expected logo text: " + DocuportConstant.LOGO_DOCUPORT + ", DOES NOT match actual logo text: " + docuport+ ". Test FAIL");
        }

        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14']"));
        userName.sendKeys(DocuportConstant.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(DocuportConstant.PASSWORD_All);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        WebElement homeIcon = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));
        System.out.println(homeIcon.isDisplayed());

        if (homeIcon.isDisplayed()) {
            System.out.println("Login was successful");
        } else {
            System.out.println("Login Failed");
        }




    }
}
