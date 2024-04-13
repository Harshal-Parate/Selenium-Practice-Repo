package org.example.WebautomationInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateInWebPages {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");

        WebElement dropDown = driver.findElement(By.id("twotabsearchtextbox"));
        dropDown.sendKeys("harshal");
        WebElement serach = driver.findElement(By.id("nav-search-submit-button"));
        serach.click();

        driver.navigate().back();


        Thread.sleep(2000);
        driver.quit();


    }
}
