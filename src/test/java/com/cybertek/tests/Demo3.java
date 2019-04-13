package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        //classname attribute should not have space cuz selenium will not accept it
        //will pop up "Compound class names not permitted"
        //  driver.findElement(By.className("input r4 wide mb16 mt8 password")).click();//will not work cuz space is no allowed
        driver.findElement(By.id("username")).sendKeys("sternway");
        driver.findElement(By.name("pw")).sendKeys("we123");

    }
}