package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtils {

    static String nameOfBrowser = PropertyReader.getProperty("app");

    static WebDriver driver;

    public static void initDriver() {

        if (nameOfBrowser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (nameOfBrowser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }else {
            driver=new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void quitDriver() {

        driver.quit();
    }

    public static WebDriver getDriver() {

        return driver;
    }




}
