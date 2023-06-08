package com.loop.test.day1_Selenium_Intro.tasks.day3_tasks;

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_task1 {
    /*
    1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
        userName.sendKeys(DocuportConstant.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuportConstant.PASSWORD_All);

        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();

        Thread.sleep(3000);
        WebElement groupName = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3'"));
        groupName.click();
        Thread.sleep(3000);
        WebElement homeIcon = driver.findElement(By.cssSelector("[class='v-icon notranslate mdi mdi-home theme--light']"));


        if (homeIcon.isDisplayed()){
            System.out.println("Login was successful");
        } else {
            System.out.println("Login failed");
        }

        WebElement logout = driver.findElement(By.xpath("//*[@id='list-item-107']/div"));
        logout.click();

        WebElement loginIcon = driver.findElement(By.cssSelector("span[class='v-btn__content']"));

        if (loginIcon.isDisplayed()){
            System.out.println("Logout was successful");
        } else {
            System.out.println("Logout failed");
        }







    }
}
