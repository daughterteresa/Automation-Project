package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver a =new ChromeDriver();
        a.get("https://google.com");

        WebElement googleBox=a.findElement(By.name("q"));
        googleBox.sendKeys("apple computer");
        googleBox.submit();




    }
}
