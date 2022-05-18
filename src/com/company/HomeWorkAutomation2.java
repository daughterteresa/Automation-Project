package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWorkAutomation2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        WebElement button = driver.findElement(By.xpath("//*[@id=\"button1\"]"));

        button.click();
        Thread.sleep(2000);

        WebElement closeButton1 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        closeButton1.click();

        WebElement button2= driver.findElement(By.xpath("//*[@id=\"button2\"]"));
        button2.click();
        Thread.sleep(2000);

        WebElement closebutton2= driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[3]/button"));
        closebutton2.click();

       WebElement button3= driver.findElement(By.xpath("//*[@id=\"button3\"]"));
       button3.click();
       Thread.sleep(2000);

      WebElement closeButton3= driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button"));
      closeButton3.click();







    }
}
