package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoOnRadioButtons {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        //to find how many of then /findelements has side method but findelement dont have
        //driver.findElement(By.xpath("//input[@value='Butter']")).clear();
        driver.findElement(By.xpath("//input[@value='Milk']")).click();
        driver.close();
       // driver.findElement(By.xpath("//input[@value='Cheese']")).click();
     //   System.out.println( driver.findElements(By.xpath("//input[@name='group1']")).size());
    }
}