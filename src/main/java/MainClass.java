import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MainClass {

    public static void main(String[] args) {
        String projectlocation = System.getProperty("user.home");
        System.setProperty("webdriver.chrome.driver", projectlocation+"/Documents/Work/QAMaven/chromedriver/");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open bing
        driver.get("http://www.bing.com");
        WebElement go = driver.findElement(By.name("go"));
        WebElement searchButton = driver.findElement(By.className("driver"));
        searchButton.click();


// Maximize browser

        driver.manage().window().maximize();

    }

}