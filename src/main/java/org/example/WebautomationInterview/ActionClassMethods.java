package org.example.WebautomationInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActionClassMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");

        WebElement dropDown = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT);
        dropDown.sendKeys("harshal");
        actions.keyUp(Keys.SHIFT);
        actions.build().perform();

        Thread.sleep(2000);
        driver.quit();


    }
}
