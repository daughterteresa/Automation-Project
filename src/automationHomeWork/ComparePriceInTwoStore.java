package automationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComparePriceInTwoStore {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String website1 = "https://www.barnesandnoble.com/";
        driver.get(website1);
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
        String price1 = getPrice.getText().split(" ")[1];
        price1 = price1.replace("$", "");


// For Amazon Site
        String website2 = "https://www.amazon.com/";
        driver.get(website2);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//searchBox;
        WebElement amazonsearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        amazonsearchBox.sendKeys("Think and Grow Rich");


//clck search botton
        WebElement searchBook = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBook.click();

//Price of book
        WebElement findPrice = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[2]/a/span/span[2]/span[2]"));
        WebElement decimal = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[2]/a/span/span[2]/span[3]"));


        String price2 = findPrice.getText() + "." + decimal.getText();
        price2 = price2.replace("$", "");

// System.out.println(price1);
        System.out.println(price2);
// Convert Price to Numeric
        double p1 = Double.parseDouble(price1);
        double p2 = Double.parseDouble(price2);

        if (p1 < p2) {
            System.out.println(website1 + " price is less i.e. " + price1);

        } else {
            System.out.println(website2 + " price is less i.e. " + price2);
        }

//close browser
        driver.quit();


    }
}
