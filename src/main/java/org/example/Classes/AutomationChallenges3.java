package org.example.Classes;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationChallenges3 {

    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
    }

    @Test
    public void test() {
        WebElement smallModal = driver.findElement(By.id("showSmallModal"));

        /*
        Java Script executor
         */

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", smallModal);

        smallModal.click();

        WebElement smallBody = driver.findElement(By.cssSelector("div[class='modal-body']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(smallBody));

        WebElement close = driver.findElement(By.id("closeSmallModal"));
        close.click();

        String actualSmall = "This is a small modal. It has very less content";
        Assert.assertEquals(actualSmall, smallBody.getText());

        Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement CloseMainSmall = wait3.until(driver1 -> driver1.findElement(By.xpath("//button[@type='button']/span[@aria-hidden='true']")));
        CloseMainSmall.click();

        WebElement largeModal = driver.findElement(By.id("showLargeModal"));
        largeModal.click();

        By largeBody = By.xpath("//div[@class='modal-body']/p");

        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement body = wait1.until(driver1 -> driver1.findElement(largeBody));

        String lB = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        Assert.assertEquals(lB, body.getText());

        WebElement closeLarge = driver.findElement(By.id("closeLargeModal"));
        closeLarge.click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
