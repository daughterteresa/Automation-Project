package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkAutomation3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        button.click();
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
        button1.click();
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
        button2.click();




    }
}
