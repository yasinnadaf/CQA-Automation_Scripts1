package com.bridgelabz.selenium.test;

import com.bridgelabz.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot extends BaseClass {
    @Test
    public void takeScreenshot() throws IOException {
        driver.get("https://www.foundit.in/seeker/registration");

        TakesScreenshot screenShot = (TakesScreenshot) driver;
        File srcDestination = screenShot.getScreenshotAs(OutputType.FILE);
//        File finalDestination = new File("C:\\CQAProject\\screenshot\\test.png");
        File finalDestination = new File("C:\\CQAProject\\screenshot\\test"+System.currentTimeMillis()+".png");

        FileUtils.copyFile(srcDestination, finalDestination);

    }
}
