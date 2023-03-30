package com.bridgelabz.selenium.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HandlingWindow extends BaseClass {

    @Test
    public void getWindowHandle(){
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Address: "+ parentWindow);

        Set<String> allWindow = driver.getWindowHandles();
        Iterator<String> iterator = allWindow.iterator();

        while (iterator.hasNext()){
            String childWindow = iterator.next();
            if(!parentWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                driver.manage().window().fullscreen();

                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("Child window text: "+text);
            }
        }
        driver.switchTo().window(parentWindow);

        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String tabText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("text of new tab: "+ tabText);

    }
}
