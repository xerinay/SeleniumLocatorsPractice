package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        //findelement with locators and type something
        driver.findElement(By.id("email")).sendKeys("dfnf@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("hgwe123");
//when u see "a" in the inspect it means that it is linktext
//when there is no id,no class,nothing  , it called link text
driver.findElement(By.linkText("Forgot account?")).click();
//if the 2 locators has same value it will idetify the top left first



    }
}
