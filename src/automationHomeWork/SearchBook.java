package automationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.barnesandnoble.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //searchBox;
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search by Title, Author, Keyword or ISBN']"));
        searchBox.sendKeys("Think and Grow Rich");

        //click search botton
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary rhf-search-btn']"));
        searchButton.click();

        //Price of book
        WebElement getPrice = driver.findElement(By.xpath("//div[@class='current']"));
        System.out.println("Price for book:'Think and Grow Rich in Barnes and Noble : " + getPrice.getText());

        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        //searchBox;
        WebElement amazonsearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        amazonsearchBox.sendKeys("Think and Grow Rich");

        //clck search botton
        WebElement searchBook = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBook.click();

        //Price of book
        WebElement findPrice = driver.findElement(By.xpath("//div[@class='a-row a-spacing-mini']/div[2]"));
        System.out.println("Price for book:'Think and Grow Rich' in Amazon : " + findPrice.getText());
//o

        //close browser
        driver.quit();




    }
}