package org.example.BasicsOfSelenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PositionOfBrowser {

    @Test
    public void position() {

        WebDriver driver = new EdgeDriver();


        // Instance of Point class which accepts the pixels
        Point point = new Point(100,200);

        // setPosition method of window interface accepts point class object to move driver to desired pixel
        driver.manage().window().setPosition(point);

    }
}
