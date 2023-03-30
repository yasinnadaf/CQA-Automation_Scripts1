package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;
    @BeforeTest
    public void setUp(){

        WebDriverManager.chromedriver().setup();

//        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
//        option.addArguments("start-maximize");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
