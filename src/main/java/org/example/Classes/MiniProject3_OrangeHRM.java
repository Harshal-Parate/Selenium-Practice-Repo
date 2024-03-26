package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.List;

public class MiniProject3_OrangeHRM {

    WebDriver driver;

    @BeforeMethod
    public void settingUpDriver() {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void Tests() throws InterruptedException {

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        login.click();

        Thread.sleep(5000);

        List<WebElement> listOfOptions = driver.findElements(By.xpath("//span[contains(@class, 'oxd-main-menu-item')]"));

        for (int i = 0; i < listOfOptions.size(); i++) {
            if (listOfOptions.get(i).getText().equals("Recruitment")) {
                listOfOptions.get(i).click();
                break;
            }
        }
        Thread.sleep(5000);

        List<WebElement> cardsTotal = driver.findElements(By.xpath("//div[@class='oxd-table-card']"));

        String initialPart = "(//div[@class='oxd-table-card'])[";
        String finalPart = "]/descendant::div[@class='oxd-table-cell oxd-padding-cell']";
     // String buttonDelete = "(//div[@class='oxd-table-card'])[1]/descendant::div[@class='oxd-table-cell oxd-padding-cell'][7]/child::div/button[2]";

        for (int i = 0; i < cardsTotal.size(); i++) {
            List<WebElement> innerElement = driver.findElements(By.xpath(initialPart + (i + 1) + finalPart));
            for (int j = 0; j < innerElement.size(); j++) {
                WebElement innerElementCards = driver.findElement(By.xpath(initialPart + (i + 1) + finalPart + "[" + (j + 1) + "]"));
                    if (innerElementCards.getText().equals("Shortlisted")) {
                        WebElement deleteButton = driver.findElement(By.xpath(initialPart + (i + 1) + finalPart + "[7]/child::div/button[2]"));
                        deleteButton.click();

                        Thread.sleep(1000);

                        WebElement NoCancleButton = driver.findElement(By.xpath("//button[contains(@class, 'text orangehrm-button-margin')]"));
                        NoCancleButton.click();
                }
            }
        }
    }

    @AfterMethod
    public void closingTheSession() {
        driver.quit();
    }


}
