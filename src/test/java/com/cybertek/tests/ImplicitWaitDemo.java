package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        driver.findElement(By.id("FH-origin")).sendKeys("nyc");
        driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
        driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);
driver.findElement(By.id("FH-destination")).sendKeys("istanbul");
        driver.findElement(By.id("FH-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("FH-destination")).sendKeys(Keys.ENTER);


    }
}
