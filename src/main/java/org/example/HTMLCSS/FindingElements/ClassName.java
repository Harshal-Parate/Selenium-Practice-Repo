package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ClassName {

    @Test
    public void locate() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        // By ClassName
        WebElement ID = driver.findElement(By.className("input-label Mb(5px) login-email-input"));


        System.out.println(ID.getText());

        driver.quit();




    }
}
