package org.example.Classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class1 {

    @Test
    public void verifyTheLogin() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement username = driver.findElement(By.id("login-username"));
        WebElement password = driver.findElement(By.id("login-password"));

        username.sendKeys("qwertyharshal@gmail.com");
        password.sendKeys("Harshal@12345");


        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.quit();


    }
}
