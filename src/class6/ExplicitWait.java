package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        WebDriverWait wait= new WebDriverWait(driver,10);

        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[contains(text(),'First Name')]"))));

        button.click();




    }
}
