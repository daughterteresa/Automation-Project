package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWorkAutomation1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        driver.manage().window().maximize();

        //Reset (Clear all content)
        WebElement RESET = driver.findElement(By.xpath(" //input[@value='RESET']"));
        RESET.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
        firstName.sendKeys("Teresa");

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
        lastName.sendKeys("Thapa");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
        email.sendKeys("daughter@gmail.com");

        WebElement comment = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
        comment.sendKeys("good for all");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();
        Thread.sleep(3000);









    }

}
