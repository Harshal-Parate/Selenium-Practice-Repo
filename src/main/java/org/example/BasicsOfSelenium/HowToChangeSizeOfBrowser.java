package org.example.BasicsOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HowToChangeSizeOfBrowser {

    @Test
    public void size() {

        WebDriver driver = new EdgeDriver();


        // creating the object of dimension class with required dimensions in arguments
        Dimension dimension = new Dimension(400,200);

        //setSize method of window interface takes the object of dimension class in it
        driver.manage().window().setSize(dimension);


    }
}
