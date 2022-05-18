package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Automation2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Teresa");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Thapa");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("aa@gmail.com");

        WebElement comment = driver.findElement(By.xpath("//*[@name='message']"));
        comment.sendKeys("Great");

        WebElement botton = driver.findElement(By.xpath("//*[@type='submit']"));
        botton.click();


    }
}

