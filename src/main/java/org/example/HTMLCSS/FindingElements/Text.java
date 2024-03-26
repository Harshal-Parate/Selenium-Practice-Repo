package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Text {

    @Test
    public void locate() {



        // use to find anchor tag "<a>"


        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        // By Linked Text
        System.out.println(driver.findElement(By.linkText("Email address")).getText());

        // By Partial Linked Text
        System.out.println(driver.findElement(By.partialLinkText("Email address")).getText());


        driver.navigate().back();
        driver.quit();



    }
}
