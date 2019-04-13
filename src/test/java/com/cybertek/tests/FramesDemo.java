package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FramesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        //in order to use the frame correctly u have to switch to frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        //if there is more than one frame u use index like driver.switchTo().frame(2);
        driver.findElement(By.id("draggable")).click();
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
       WebElement target= driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();
        //to see how many iframes in the application-driver.findelemnt(By.tagName("iframe")).size();

        //if u wanna do any action other thank famework u have to use this method to make it work. othrwise it wont work

        driver.switchTo().defaultContent();
}
}