package com.loop.test.day1_Selenium_Intro.tasks.day4_tasks;

/*

1. go to docuport app
2. validate that Home, Received docs, My uploads, Invitations are displayed
3. press three lines
4. Home, Received docs, My uploads, Invitations will disappear
5. Validate the buttons are not displayed
 */

import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class day4_task1 {
    public static void main(String[] args) throws InterruptedException {

        //1. go to docuport app
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstant.DOCUPORT_URL);

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g3_client@gmail.com");


        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys("Group3");

        WebElement login = driver.findElement(By.className("v-btn__content"));
        login.click();

        List<WebElement> buttons = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));
        System.out.println("leftItems= " + buttons.size());

        for (WebElement button : buttons) {

            if (button.isDisplayed()) {
                System.out.println("Validation was successful");
            } else {
                System.out.println("Validation Failed");
            }
        }

        WebElement threeLines = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();
        Thread.sleep(1000);

        System.out.println("=======================");

        for (WebElement button : buttons) {

            if (button.isDisplayed()) {
                System.out.println("Buttons is  displayed");
            } else {
                System.out.println("Buttons is Not displayed");
            }
        }

driver.quit();

    }
}
