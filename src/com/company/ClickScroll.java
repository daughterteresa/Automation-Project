package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClickScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Scrolling/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        WebElement clickMe=driver.findElement(By.xpath("//h1[contains(text(),'Scroll to me first!')]"));
        clickMe.click();

        // scroll down to the browser
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");




        Thread.sleep(10000);










    }





}



