package com.bridgelabz.selenium.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookTest extends BaseClass {
    @Test
        public void TestFacebook(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();

//        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.linkText("Forgotten password?")).click();
//        driver.navigate().back();
//        System.out.println("Title of the application: "+ driver.getTitle());
//        System.out.println("Current url of the application: "+ driver.getCurrentUrl());
//        System.out.println("Page source of the application: "+ driver.getPageSource());

//        driver.findElement(By.id("email")).sendKeys("Bridgelabz@");
//        Thread.sleep(1000);
//        driver.findElement(By.id("pass")).sendKeys("ayzz");
//        Thread.sleep(1000);

//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Bridgelabz");//Relative xPath
//        Thread.sleep(1000);
////        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//        Thread.sleep(1000);

//        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        userName.sendKeys("Bridgelabz");  // again again if we want to use then we can
//        userName.getText();

        WebElement loginBtn = driver.findElement(By.name("login"));
        System.out.println("Login text: "+ loginBtn);   //it will give text of login

        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("sdfsdssss"+divElements);
        for(int i = 0; i<divElements.size(); i++){
            String text = divElements.get(i).getText();
            System.out.println("text of WebElements: "+text);
        }

        driver.findElement(By.partialLinkText("Forgotten password?")).click();
        driver.navigate().back();     //click on forget pass n will back to login page and close


        driver.close();



    }
}
