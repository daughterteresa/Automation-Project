package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SubmitFood {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        WebElement foodItemBox=driver.findElement(By.xpath("//input[@name='food-item']"));
        foodItemBox.click();
        foodItemBox.sendKeys("Spinach");
        Thread.sleep(900);
        //click - by using javascriptExecutor
        WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submit);

        

        Thread.sleep(10000);










    }





}



