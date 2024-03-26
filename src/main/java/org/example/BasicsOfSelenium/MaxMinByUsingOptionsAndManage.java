package org.example.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MaxMinByUsingOptionsAndManage {

    @Test
    public void maxMin() {

        WebDriver driver = new EdgeDriver();

        // driver.manage() returns the option interface
        Options options = driver.manage();

        // options.window() returns the window interface
        Window window = options.window();

        window.maximize();
        window.maximize();
        window.fullscreen();


        //chained up the above operations
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();



    }
}
