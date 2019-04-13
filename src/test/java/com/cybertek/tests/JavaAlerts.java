package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        //has been swith to alert pop op page
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();//if u click ok u have to use accept method
//but if u wanna click cancle or no on the alert box u should use -driver.switchTo().alert().dismiss();

    }
}
