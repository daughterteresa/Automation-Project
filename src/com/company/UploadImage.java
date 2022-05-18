package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class UploadImage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/File-Upload/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='myFile']"));
        //chooseFile;
        chooseFile.sendKeys("D:\\1.jpg");
        System.out.println("choose File Successfully");

        //path of image
//
        WebElement submit=driver.findElement(By.xpath("//input[@id='submit-button']"));
        submit.click();
        System.out.println("Upload Image Successfully");

        Thread.sleep(10000);










    }





}



