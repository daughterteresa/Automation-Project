package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //Dropdown select Python
        Thread.sleep(1000);
        Select drpSubject = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")));
        drpSubject.selectByVisibleText("Python");
        Thread.sleep(1000);

        //Dropdown select TestNG
        Select drpAutomation = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")));
        drpAutomation.selectByVisibleText("TestNG");
        Thread.sleep(1000);

        //Dropdown select JavaScript
        Select drpprorammingLanguage = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")));
        drpprorammingLanguage.selectByVisibleText("JavaScript");
        Thread.sleep(1000);


        Thread.sleep(10000);










    }





}



