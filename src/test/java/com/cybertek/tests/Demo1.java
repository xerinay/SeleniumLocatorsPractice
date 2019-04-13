package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1 {

    public static void main(String[] args) {
        //invoking the excel file first from the computer
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        //creating a driver object for chrome browser?(firefox browser)
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new InternetexplorerDriver ();

        //open the browser
        driver.get("http://google.com");
        //get the title of the page
        System.out.println(driver.getTitle());//will give us the title
        //to validate URL whether ur on right track or no
        System.out.println( driver.getCurrentUrl());//will give us the URl

        driver.get("http://yahoo.com");
        //to get back to perevoius page
        driver.navigate().back();//which means will go back to google
        //to come back to the page
        driver.navigate().forward();//will come back to yahoo
        //will cole the curret browser
        driver.close();
        //driver.quit();->will close all the browser it oppened by selnium



    }
}
