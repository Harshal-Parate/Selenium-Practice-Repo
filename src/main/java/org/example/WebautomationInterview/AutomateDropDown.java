package org.example.WebautomationInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomateDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");

        WebElement dropDown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).getText().equals("Appliances")) {
                options.get(i).click();
            }
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
