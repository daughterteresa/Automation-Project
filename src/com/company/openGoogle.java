package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class openGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        System.out.println("Title is "+ driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.findElement(By.name("q")).sendKeys("Hello Selenium");
        driver.findElement(By.name("q")).submit();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a")).click();



    }
}
