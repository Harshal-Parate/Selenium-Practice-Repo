package org.example.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {

    @Test
    public void rukho() {

        WebDriver driver = new EdgeDriver();

        driver.navigate().to("");
        WebElement element = driver.findElement(By.xpath("demo"));
        /*
        synchronization in selenium ---> faster execution and application is slower adn due to this element or page is
        not available
         */

        /*

        Implicit Wait --> Global wait

        If this wait is applied to driver at the start then it'll wait for all the elements
        for the given duration of time

        This will be removed only when the driver instance will be killed.

        */
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        //-----------------

        /*
               Explicit Wait--->
               along with the time we need to specify the conditions also
               sab elements ek liye aalag aalag conditions lagana hoga according to the scenario
               element specific
         */
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofMillis(2000));
        WebElement elemental = webDriverWait.until(ExpectedConditions.visibilityOf(element));
        elemental.click();

        // OR using helper function created below the test method
        WebElement element1 = explicitWait(element,driver);
        element1.click();

        //-------------------


        /*
        Fluent Wait

        Similar to web driver wait but with exception handling and polling time options
        poling time --> it will check at every given amount of time
        error handling
         */

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofMillis(1000))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        wait.until(driver1 -> driver1.findElement(By.xpath(""))); //--> this will return the web element

        // check the function after the test method
        WebElement element2 = fluentWait(driver, 10, 1, "demo");
        element2.click();



//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
//        wait1.until(ExpectedConditions.visibilityOf(element));
//
//        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//                .pollingEvery(Duration.ofSeconds(1))
//                .withTimeout(Duration.ofSeconds(10))
//                .ignoring(NoSuchElementException.class);
//        wait2.until(driver1 -> driver1.findElement(By.xpath("")));




        driver.quit();

    }

    public static WebElement explicitWait(WebElement element, WebDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
        return webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement fluentWait(WebDriver driver, int waitTime, int pollingTime, String xpathExpression) {
        Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(Exception.class);
        return waits.until(driver1 -> driver1.findElement(By.xpath(xpathExpression)));
    }
}
