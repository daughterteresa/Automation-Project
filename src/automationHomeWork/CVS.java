package automationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;

public class CVS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       String url="https://sit2www.caremark.com/";
        String website1 = "https://sit2www.caremark.com/wps/myportal/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8ziHd3DQgMNnM3N_M1cLAwcfV0CwoLcTQwNDAz0wwkpiMIvHUlIf0FuRCUAgfjFdw!!/";
        driver.get(url);
        driver.get(website1);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //username;
        WebElement userName = driver.findElement(By.xpath("//input[@id='userid']"));
        userName.sendKeys("Smith.jabari@sit2.com");

        //password
       WebElement pass = driver.findElement(By.xpath("//input[@id='passwordPlaceholder']"));
        // pass.sendKeys("Common11");

        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].click();", pass);
        j.executeScript ("document.getElementById('passwordPlaceholder').value='Common11'");
        Thread.sleep(500);


        //login
        WebElement login = driver.findElement(By.xpath("//span[@class='btn_signIn_new_span']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", login);



        //select plan and benifit then select drugs
        WebElement b = driver.findElement(By.xpath("//body/div[@id='bg-outer']/div[@id='bg-inner']/div[@id='menu_outer']/div[@id='menu']/ul[@id='menu_hover']/li[3]/div[1]/div[1]/div[1]"));
        Actions a = new Actions(driver);
        a.moveToElement(b)
                .build().perform();
//cli

        WebElement drugs= driver.findElement(By.xpath("//*[text()='Check Drug Cost & Coverage')]"));
        drugs.click();

        //iframe
//        driver.switchTo().frame("Check Drug Cost");
//        System.out.println("iframe");
        //Lipitor  //iframe: iframe

//        Select drugs = new Select(driver.findElement(By.xpath("//div[@class='selection-wrapper']/select")));
//        drugs.selectByValue("TABLET20MG");
    }
}
