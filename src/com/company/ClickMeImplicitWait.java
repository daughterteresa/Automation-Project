package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickMeImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        WebElement clickMe=driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));
        clickMe.click();




        Thread.sleep(10000);










    }





}



