package com.loop.test.day5_testNG_dropdawn;

import org.testng.Assert;
import org.testng.annotations.*;

public class T00_testNG_intro_continue {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @Test (priority = 2)
    public void test1(){
        System.out.println("TestNG test is running");
        String actual = "Loop";
        String excepted = "Loop";

        Assert.assertEquals(actual, excepted, "Test is not passing");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("TestNG test 2 is running");
    }
}
