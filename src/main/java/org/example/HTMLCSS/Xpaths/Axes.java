package org.example.HTMLCSS.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Axes {

    @Test
    public void axes() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");



        /*
        * SYNTAX *

        parentXpath /  descendant :: followingXpath

        * ancestor --> niche se upar jaa sakte
        * ancestor-or-self  ---> niche se upar adn khud bhi select ho jate
        * child  --> proper baccha select hota
        * descendant  --> niche ka koi bhi select kar sakte
        * descendant-or-self  --> khud bhi aur niche ke bacche bhi
        * following --> tag ke hisab se aage wala highlight hoga
        * following-sibling  --> tag ke hisab se aage wala highlight hoga but uska bhai he hoga
        * preceding  --> upar wala
        * preceding-sibling --> upar wala but uska bhai hoga

        //div[contains(@data-qa,'pawowuxafo')]/descendant::div[contains(@data-qa,'cixi')]

         */

        WebElement axes = driver.findElement(By.xpath(""));



    }

}
