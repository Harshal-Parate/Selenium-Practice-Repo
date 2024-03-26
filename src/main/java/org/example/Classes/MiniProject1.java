package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MiniProject1 {


    WebDriver driver;

    @BeforeMethod
    public void settingUpBrowser() {
        driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void miniProject() {

        WebElement makeAnAppointment = driver.findElement(By.id("btn-make-appointment"));
        makeAnAppointment.click();

        WebElement username = driver.findElement(By.cssSelector("input[id='txt-username']"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        WebElement dropDown = driver.findElement(By.id("combo_facility"));

        Select select = new Select(dropDown);
        select.selectByVisibleText("Seoul CURA Healthcare Center");

        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();

        WebElement datePicker = driver.findElement(By.cssSelector("input[type='text']"));
        datePicker.sendKeys("16/09/1996");

        WebElement comment = driver.findElement(By.cssSelector("textarea[placeholder='Comment']"));
        comment.sendKeys("Hello Automation Done");

        WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
        bookAppointment.click();

        WebElement confirmation = driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']/child::h2"));

        String actualConfirmation = confirmation.getText();
        String expectedConfirmation = "Appointment Confirmation";

        Assert.assertEquals(actualConfirmation, expectedConfirmation);

    }

    @AfterMethod
    public void closingBrowser() {
        driver.quit();
    }
}
