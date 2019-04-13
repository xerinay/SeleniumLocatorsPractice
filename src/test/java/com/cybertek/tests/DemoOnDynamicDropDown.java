package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnDynamicDropDown {
    //dynamic dropdown is usally used for more options under dropdown like country city state
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='AIP']")).click();
        Thread.sleep(2000l);
        ;driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//when the xpath dont work u should check it from
        //cropath to see how many matching node u have then compare chose the match one , in this case it was 2 one
        //so i wrote[2].
    }
}
