package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ByRelativeAndAbsolute {


    @Test
    public void xpath() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        /*

        //html//tagName --> here the tagName of the web element

        direct jump

         */


       // driver.findElement(By.xpath("(//span[contains(@class,\"checkbox-radio-button ng-scope\")])[1]")).click();

        WebElement ByAttribute = driver.findElement(By.xpath("(//html//input)[3]"));

        ByAttribute.click();

        Thread.sleep(2000);
        driver.quit();

    }

}
