package org.example.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        WebElement smallModal = driver.findElement(By.id("showSmallModal"));

        /*
        Java Script executor
         */

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", smallModal);

        smallModal.click();
    }
}
