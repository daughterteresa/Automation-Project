package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DateChange {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Datepicker/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement clickCldnr=driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-calendar']"));
        clickCldnr.click();
        Thread.sleep(3000);


        WebElement date=driver.findElement(By.xpath("//td[contains(text(),'13')]"));
        date.click();

        System.out.println("date changed Successfully");


        

        Thread.sleep(10000);










    }





}



