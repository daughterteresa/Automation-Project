package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AlertDismis {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        WebElement clickMe=driver.findElement(By.xpath("//span[@id='button1']"));
//        clickMe.click();
        WebElement element = driver.findElement(By.xpath("//span[@id='button1']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        Alert alert = driver.switchTo().alert();
        alert.accept();


        Thread.sleep(10000);










    }





}



