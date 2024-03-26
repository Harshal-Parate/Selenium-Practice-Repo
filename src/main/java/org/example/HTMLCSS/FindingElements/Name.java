package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Name {

    @Test
    public void locate() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        // By Name
        WebElement Name = driver.findElement(By.name("username"));

        Name.sendKeys("Harshal");


        Thread.sleep(3000);

        driver.quit();




    }
}
