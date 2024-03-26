package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ID {

    @Test
    public void locate() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        // By ID
        WebElement ID = driver.findElement(By.id("js-sign-in-heading"));


        System.out.println(ID.getText());

        driver.quit();




    }
}
