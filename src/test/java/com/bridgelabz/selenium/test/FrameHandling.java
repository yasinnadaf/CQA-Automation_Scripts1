package com.bridgelabz.selenium.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameHandling extends BaseClass {

    @Test
    public void handlingFrame(){
        driver.get("https://www.guru99.com/selenium-tutorial.html");

        int size = driver.findElements(By.tagName("iframe")).size();

        for (int i = 0; i <= size; i++){
            System.out.println("switch: "+ driver.switchTo().frame(i));
        }
    }

}
