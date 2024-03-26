package org.example.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HowToNavigateToAnyUrl {

    @Test
    public void navi() {

        WebDriver driver = new EdgeDriver();
        driver.get("");

        // or by using the Navigation Interface
        driver.navigate().to("");


    }
}
