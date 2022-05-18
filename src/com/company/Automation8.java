package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Automation8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");

        WebElement button=driver.findElement(By.xpath("https://webdriveruniversity.com/Click-Buttons/index.html"));
        button.click();

       List<WebElement>allList=driver.findElements(By.className("sub-heading"));
       for(WebElement e:allList){
           System.out.println(e.getText());
       }







    }
}
