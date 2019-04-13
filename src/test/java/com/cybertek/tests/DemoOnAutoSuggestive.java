package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnAutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        //have to delete the given city first
        driver.findElement(By.id("hp-widget__sfrom")).click();
         driver.findElement(By.id("hp-widget__sfrom")).sendKeys("MUM")
         ;Thread.sleep(2000);
        driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
//instead of using driver.findElement everytime when u locate the element just initialze that to a variba;e and make it easy foir ur self
        WebElement source=driver.findElement(By.id("hp-widget__sTo"));
        source.clear();
        source.sendKeys("DEL");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        //if u wanna chose the other options use loop
        source.sendKeys(Keys.ENTER);
    }

}
