package org.example.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverInSelenuim4 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}