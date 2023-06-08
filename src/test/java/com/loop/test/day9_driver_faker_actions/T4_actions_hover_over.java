package com.loop.test.day9_driver_faker_actions;


import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_actions_hover_over {


    @Test
    public void google_actions_hover(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']//preceding-sibling::input"));
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googleSearch).perform();

        actions.moveToElement(feelingLucky).perform();


    }
}
