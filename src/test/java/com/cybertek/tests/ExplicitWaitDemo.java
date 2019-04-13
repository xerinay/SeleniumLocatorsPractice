package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        driver.findElement(By.id("FH-origin")).sendKeys("nyc");
        driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
        driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("FH-destination")).sendKeys("istanbul");
        driver.findElement(By.id("FH-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("FH-destination")).sendKeys(Keys.ENTER);

//it is a class (webdriverWait)-passing a driver object and ordering to wait 5 sec
        //whereever u use d object it will wait 5 second
        WebDriverWait d=new WebDriverWait(driver,20);
        //wait until that locator visibilty happens
        //will only wait for this object/ depends on ur condition as well
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
        //Thread.sleep(5000L);

        driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
    }
}
