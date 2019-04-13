package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //assertion use TestNG
        //testNG is testing framework
        //asserion is one thing that help validate if the result whaeter selenium return is expected or no,
        //if not it will fail the test
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

// Assert.assertTrue- will print true if the inside argument is correct but if inside is false it wont pass
        //Assert.assertFalse();- will print false if the argument is false
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        //asserEqulas method looks for if the expected result is same with actual result
//Assert.assertEquals(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),"true");
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//isEnable method - when something is able to use like return day slection when u chouse round trip
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }


    }
}