package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class classExer {


    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com/b/PC-Desktops-All-In-One-Computers/179/bn_661752");

        Thread.sleep(4000);

        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys("Mac");


        WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
        search.click();


        Thread.sleep(4000);

        List<WebElement> price = driver.findElements(By.xpath("//div[@class='s-item__details clearfix']/descendant::span[@class='s-item__price']"));
        List<WebElement> elementList = driver.findElements(By.cssSelector("span[role='heading']"));


        for(int i=0; i<elementList.size(); i++) {
            System.out.println(elementList.get(i).getText()+"-->"+price.get(i).getText());
        }


        driver.quit();




    }


}
