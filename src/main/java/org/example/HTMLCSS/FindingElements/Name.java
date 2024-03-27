package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Name {

    @Test
    public void locate() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofSeconds(1))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);
        WebElement name = wait.until(driver1 -> driver1.findElement(By.name("username")));

        // By Name
        //WebElement Name = driver.findElement(By.name("username"));

        name.sendKeys("Harshal");




        driver.quit();




    }
}
