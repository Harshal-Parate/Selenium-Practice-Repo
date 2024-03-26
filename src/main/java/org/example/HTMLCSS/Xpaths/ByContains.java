package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ByContains {

    @Test
    public void xpath() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        /*

        //tageName[contains(@attribute,'attributeValue')]

        Attribute here can be any value under the tag

         */

        WebElement ByAttribute = driver.findElement(By.xpath("//input[contains(@data-qa,'cewoq')]"));

        ByAttribute.sendKeys("Harshal");

        Thread.sleep(2000);
        driver.quit();

    }
}
