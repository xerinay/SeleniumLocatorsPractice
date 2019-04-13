package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoOnDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com");
        //you u select class if u see select in tagname
        //using select class u can manupilate dropdown
        //create slect object first, when u use select object u have do locater inside the perathese
       // Select s=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
        //2end option in the dropdown
        //s.selectByValue("AED");
        //2index under dropdown -s.selectByIndex(2);
       // s.selectByVisibleText("AED");//directly type exact letter

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000l);
        //use while loop to add the adult under dropdown box
        int i=1;
        while(i<5){ //or use for loop
            driver.findElement(By.id("hrefIncAdt")).click();//2 adults u selected once,but since u loop it i will slected 4 times
          i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
