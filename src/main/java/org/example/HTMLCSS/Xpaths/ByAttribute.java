package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ByAttribute {

    @Test
    public void xpath() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        /*

        //tageName[@attribute='attributeValue']

         */

        WebElement ByAttribute = driver.findElement(By.xpath("//input[@id='login-username']"));

        ByAttribute.sendKeys("Harshal");

        Thread.sleep(2000);
        driver.quit();

    }
}
