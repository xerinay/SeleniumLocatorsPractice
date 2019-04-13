package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
       //will print true if the check box is selected by using isSlected method
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //write that is common locator  to all the checkboxes which all they type is same in this case
        //get the count for common checkbox locator
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


    }
}
