package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");

        //css slector is smilar to xpath
        //css in firefox is avalable directly  but in chrome not avalable directly so u have to find it manually
        driver.findElement(By.cssSelector("#username")).sendKeys("emailadress");

        driver.findElement(By.xpath("//*[@id='password'] ")).sendKeys("ddwd12");
     //xpath can be defined in number of ways
        //right click in the webelement and cope the xpath
        // double quotes inside double quotes are not acceptes so u have to chnage to single quotes
        //when xpath starts with html, it is not realible
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        //if u wanna check the xpath that u write is wrong or right you should go to console
        //and type the xpath and hit enter, if u get a text that clickble that mean is right
        //  //tagName[@attribute='value']-xpath / //tagName[@contains(@attribute,'value')]
        //tagName[attribute='value']-css / tagName#value/tagName.className/#value
        //$("")-for css in console
        //$x("")-for xpath in console
    }

}
//relative xpath does not depend on parent node
//absolute xpath does depend parent node
// parent child relationship->write parent xpath then tagname until you reach  the right one