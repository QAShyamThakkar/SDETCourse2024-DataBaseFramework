package com.automation.stepdefinition;

import com.automation.utils.DataBaseClass;
import com.automation.utils.DataBaseUtils;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp(){
        PropertyReader.initProperty();
        DriverUtils.initDriver();
        DataBaseUtils.initializeDataBase();
        driver = DriverUtils.getDriver();
    }

    @After
    public void cleanUp(){
        DriverUtils.quitDriver();
        DataBaseUtils.closeDataBase();

    }

}
