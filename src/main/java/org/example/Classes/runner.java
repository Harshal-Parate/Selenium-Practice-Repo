package org.example.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class runner {

    public static void main(String[] args) {


//        String cards = "//div[@class='oxd-table-card']";
//        String elementsInCards = "/descendant::div[@class='oxd-table-cell oxd-padding-cell']";
//
//        List<WebElement> cardsTotal = driver.findElements(By.xpath(cards));
//
//        for(int i=0; i<cardsTotal.size(); i++) {
//            List<WebElement> innerElement =
//                    driver.findElements(By.xpath("("+cards+")["+i+"]"+elementsInCards));
//            System.out.println("-- major"+innerElement.get(i));
//
//            for(int j=1; j<=innerElement.size(); j++) {
//                List<WebElement> innerElementCards =
//                        driver.findElements(By.xpath("("+cards+")["+i+"]"+elementsInCards+"["+j+"]"));
//                System.out.println("-- minor"+innerElementCards.get(j));
//
//            }
//        }

        String cards = "//div[@class='oxd-table-card']";
        String elementsInCards = "/descendant::div[@class='oxd-table-cell oxd-padding-cell']";

        for(int i=1; i<5; i++) {
            for(int j=1; j<5; j++) {

                System.out.println(
                        "(" + cards + ")[" + i + "]" + elementsInCards + "[" + j + "]"
                );
            }
        }



    }
}
