package automationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class iFRameDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // identify element and click
        driver.findElement(By.partialLinkText("Nested")).click();
        // switching to frame with frame name
        driver.switchTo().frame("frame-bottom");
        WebElement m = driver.findElement(By.xpath("//body"));
        System.out.println("Element identified with xpath: " +m.getText());
        driver.close();
    }
}
