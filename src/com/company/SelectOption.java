package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOption {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        WebElement option1=driver.findElement(By.xpath("//input[@value='option-1']"));
        option1.click();
        WebElement option2=driver.findElement(By.xpath("//input[@value='option-2']"));
        option2.click();
        WebElement option4=driver.findElement(By.xpath("//input[@value='option-4']"));
        option4.click();



        Thread.sleep(5000);










    }





}



