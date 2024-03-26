package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TagName {

    @Test
    public void locate() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        // By Tag Name
        List<WebElement> tagName = driver.findElements(By.tagName("h5"));

        for(int i=0; i<tagName.size(); i++) {
            System.out.println(tagName.get(i));
        }

        driver.quit();




    }
}
