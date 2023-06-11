package com.loop.test.day10_jsexecutor_pom;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_drag_drop_pom {
    /*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Verify expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Verify "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. Verify “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. Verify “Try again!” text appears on big circle
     */

    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());
    }
    @Test
    public void drag_small_here_test(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        String expected = "Drag the small circle here.";
       loopPracticeDragDropPage = new LoopPracticeDragDropPage();
       String actual = loopPracticeDragDropPage.bigCircle.getText();
        Assert.assertEquals(actual, expected, "Actual does not match the expected");
    }

    @Test
    public void drop_here(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        actions = new Actions(Driver.getDriver());
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(100,100)
                .pause(2000)
                .perform();
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Drop here.");

    }

    @Test
    public void verifyNowDrop() {

//     1. Open a chrome browser
//    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html

        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
//            3. Click and hold small circle
        actions = new Actions(Driver.getDriver());
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        //    4. Move it on top of the big circle
        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
                .clickAndHold().moveToElement(loopPracticeDragDropPage.bigCircle).pause(5000).perform();
        //    5. Verify “Now drop…” text appears on big circle
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Now drop...");
    }

    @Test
    public void verifyTryAgain(){
//        1. Open a chrome browser
//        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");

//        3. Click and hold small circle
        actions = new Actions(Driver.getDriver());
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();

//        4. Dropped anywhere outside of big circle

        actions.moveToElement(loopPracticeDragDropPage.smallCircle).clickAndHold().moveByOffset(15,18).pause(1000).release().perform();

//        5. Verify “Try again!” text appears on big circle
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Try again!");

    }
    @AfterClass
    public  void tearDown() {
        Driver.closeDriver();
    }
}
