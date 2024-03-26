package org.example.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MethodsOfNavigationInterface {

    @Test
    public void navi() {

        WebDriver driver = new EdgeDriver();

        driver.navigate().to("");

        driver.navigate().back(); //--> back on the web page
        driver.navigate().forward(); //--> back to forward page
        driver.navigate().refresh(); //--> refresh the page

        driver.quit();

    }
}
