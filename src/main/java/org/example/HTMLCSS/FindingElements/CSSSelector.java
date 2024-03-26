package org.example.HTMLCSS.FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CSSSelector {

    @Test
    public void locate() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        // By CSS Selector
        /*

        tagName[attribute='attributeValue']

         */


        WebElement ID = driver.findElement(By.cssSelector("h5[id='js-sign-in-heading']"));


        System.out.println(ID.getText());

        driver.quit();




    }
}
