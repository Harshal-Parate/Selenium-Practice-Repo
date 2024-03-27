package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

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

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofSeconds(1))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        WebElement ByAttribute  = wait.until(driver1 -> driver1.findElement(By.xpath("//span[text()='Remember me']/following-sibling::span")));

        ByAttribute.click();


        driver.quit();

    }

}
