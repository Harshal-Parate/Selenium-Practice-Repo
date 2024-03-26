package org.example.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {

    @Test
    public void rukho() {

        WebDriver driver = new EdgeDriver();

        driver.navigate().to("");
        /*
        synchronization in selenium ---> faster execution and application is slower adn due to this element or page is
        not available
         */

        /*

        Implicit Wait --> Global wait

        If this wait is applied to driver at the start then it'll wait for all the elements
        for the given duration of time

        */
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));












        driver.quit();

    }
}
