package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutomationChallenge1 {

    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new EdgeDriver();
        driver.get("https://demo.applitools.com");
    }

    @Test
    public void test() {

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement signIn = driver.findElement(By.id("log-in"));

        username.sendKeys("Admin");
        password.sendKeys("Password@123");
        signIn.click();

        List<WebElement> price = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/descendant::span[contains(@class,'text')]"));

        List<String> positivePrice = new ArrayList<>();
        List<String> negativePrice = new ArrayList<>();

        for(int i=0; i<price.size(); i++) {
        String amount = price.get(i).getText();
            if(amount.charAt(0)=='+') {
                positivePrice.add(amount);
            }
            else {
                negativePrice.add(amount);
            }
        }
        System.out.println(Arrays.toString(positivePrice.toArray()));
        System.out.println(Arrays.toString(negativePrice.toArray()));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
