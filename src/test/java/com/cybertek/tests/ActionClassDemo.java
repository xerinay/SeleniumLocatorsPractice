package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        //create actions class thaobject called a
        Actions a=new Actions(driver);//puting driver capability into actions
        //moveelement method move the mouth to specif element
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
//going to search box and typing it in capital lettter.
a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Laptop").build().perform();
//to right click on the element u use contextclick method .
        WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));//to make the step short build webelemet object and make that equil to the locator
a.moveToElement(move).contextClick().build().perform();
    }
}