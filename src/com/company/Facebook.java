package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/?stype=lo&jlou=Afdj3nFXlQHynuAtxWMf80SMMm3CG75occz8JfPdk3-jj6hXeRjqFaeQ56t49eWqucBAEuRNvxh07l86D_AXAHxV&smuh=16066&lh=Ac-kb5RFE5gIWpJesCk");

        WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
        userName.sendKeys("Teresa");

        WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
        passWord.sendKeys("rrfff");


        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
}

