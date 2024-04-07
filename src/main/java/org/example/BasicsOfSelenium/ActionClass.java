package org.example.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        Actions actions = new Actions(driver);
        actions.click();
        actions.clickAndHold();

        WebElement a = driver.findElement(By.id("A"));
        WebElement b = driver.findElement(By.id("B"));

        actions.clickAndHold(a);

        actions.dragAndDrop(a, b);

        actions.moveToElement(a);

        actions.sendKeys(Keys.PAGE_DOWN);

        actions.build().perform();


        //upload a file --> input box with type of it as "file"


    }
}
