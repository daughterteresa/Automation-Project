package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebDriverUniversity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // url - login portal
        driver.get("https://webdriveruniversity.com/index.html");

// click on Login Portal
        WebElement loginPortal = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        loginPortal.click();

//TODO -

// write user name
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys("daughter.teresa@gmail.com");
// write passord
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("MyName");
// click on  Login
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();



    }
}
