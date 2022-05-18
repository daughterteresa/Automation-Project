package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShowAllItem {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Accordion/index.html");

        WebElement mannualTesting=driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
        mannualTesting.click();

        WebElement cucumberAccording=driver.findElement(By.xpath("//button[@id='cucumber-accordion']"));
        cucumberAccording.click();

        WebElement automationAccording=driver.findElement(By.xpath("//button[@id='automation-accordion']"));
        automationAccording.click();

        WebElement clickAccording=driver.findElement(By.xpath("//button[@id='click-accordion']"));
        clickAccording.click();

        Thread.sleep(5000);










    }





}



