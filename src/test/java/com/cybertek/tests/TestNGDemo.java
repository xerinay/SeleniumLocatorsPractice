package com.cybertek.tests;

import org.testng.annotations.*;

public class TestNGDemo {
    /*
    allows u to run multiple test case
    needs @Test befpre u write ur test

     */
    @BeforeTest
    public void first(){
        System.out.println("runs first ");
    }
    @AfterClass
    public void fwef(){
        System.out.println("no idea  ");
    }
    @BeforeClass
    public void efe(){
        System.out.println("number 1");
    }
    @Test
    public void test() {
        System.out.println("hi");
    }
    @Test(dependsOnMethods = "efe")
    public void test2() {
        System.out.println("bye");
    }
    @BeforeMethod
    //runs before every test
    public void test3(){
        System.out.println("so am i first");
    }
@AfterTest
    public void last(){
    System.out.println("runs at the last ");
}
@AfterMethod
    public void test4(){
    System.out.println("so i am after each test");
}
}
//beforetest-beforeclass-beforeMethod
//BeforeTest-BeforeClass-BeforeMethod-Test-AfterMethod-BeforeMethod-Test-AfterMethod-AfterClass-AfterTest