package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class listAllProductsHW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");

        WebElement button=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
        button.click();


        List<WebElement> allList = driver.findElements(By.className("sub-heading"));
        int count =0;
        for(WebElement e: allList){
            System.out.println(e.getText());
            count++;
        }

        System.out.println("Total Items: "+count);












    }





}



