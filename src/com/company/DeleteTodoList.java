package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DeleteTodoList {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://webdriveruniversity.com/To-Do-List/index.html";
        driver.get(url);

        WebElement todo = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        todo.sendKeys("Automation");

        WebElement plusSign = driver.findElement(By.xpath("//i[@id='plus-icon']"));
        plusSign.click();

        WebElement ele = driver.findElement(By.xpath("//body/div[@id='container']/ul[1]/li[1]"));
           //Creating object of an Actions class
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();

        Thread.sleep(1000);


    }
}
