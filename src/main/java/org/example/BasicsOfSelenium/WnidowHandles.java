package org.example.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class WnidowHandles {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/popup.php");

        WebElement click  = driver.findElement(By.cssSelector("a[href='../articles_popup.php']"));
        click.click();

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext()) {
            String handle = iterator.next();
            driver.switchTo().window(handle);
            String Title = driver.getCurrentUrl();
            System.out.println(Title);
            if(Title.equals("https://demo.guru99.com/articles_popup.php")) {
                Thread.sleep(2000);
                WebElement email  = driver.findElement(By.cssSelector("input[type='text']"));
                email.sendKeys("Harshal");
            }
        }

    }
}
