package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ByText {

    @Test
    public void xpath() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        /*

        //tageName[text()="textValue"]

         */

        WebElement ByAttribute = driver.findElement(By.xpath("//button[text()='Sign in using SSO']"));

        ByAttribute.click();
        driver.navigate().back();

        Thread.sleep(2000);
        driver.quit();

    }
}
