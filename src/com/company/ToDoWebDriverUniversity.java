package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoWebDriverUniversity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //url - TO DO list
        driver.get("https://webdriveruniversity.com/index.html");

// click on TO DO list
        WebElement toDoList = driver.findElement(By.xpath("//*[@id=\"to-do-list\"]/div/div[1]/h1"));
        toDoList.click();
//TODO
        //click ADd new to do and write "Cook Food"
        WebElement addText = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
        addText.click();
        addText.sendKeys("Cook Food");

// click on plus sign
        WebElement plusSign = driver.findElement(By.xpath("//*[@id=\"plus-icon\"]"));
        plusSign.click();


    }
}
