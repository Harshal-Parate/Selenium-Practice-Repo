package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationChallenges2 {

    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/webtables");
    }

    @Test
    public void test() {

        WebElement editor = driver.findElement(By.xpath("(//div[@class='action-buttons'])[3]/child::span[1]"));
        editor.click();


        By age = By.id("age");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement aged = wait.until(driver1 -> driver1.findElement(age));

        aged.clear();
        aged.sendKeys("50");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement ageCheck = driver.findElement(By.xpath("(//div[@class='rt-tr -odd'])[2]/child::div[3]"));
        ageCheck.getText();

        Assert.assertEquals(ageCheck.getText(), "50");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
