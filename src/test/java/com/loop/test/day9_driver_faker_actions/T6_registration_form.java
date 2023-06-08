package com.loop.test.day9_driver_faker_actions;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class T6_registration_form {
    @Test
    public void registration_form_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement registerForm = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        registerForm.click();
        Faker faker = new Faker();
        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());

        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys(faker.name().lastName());

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.bothify("???###"));

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.numerify("###-###-####"));

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        gender.click();

        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        dateOfBirth.sendKeys(sdf.format(faker.date().birthday()));

        WebElement department = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        department.click();

        Select dropDawn = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        dropDawn.selectByIndex(5);

        WebElement selectJobType = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        selectJobType.click();

        Select dropDawn1 = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        dropDawn1.selectByIndex(5);

        WebElement selectProgramming = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        selectProgramming.click();

        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Sign up')]"));
        signUp.click();











    }
}
