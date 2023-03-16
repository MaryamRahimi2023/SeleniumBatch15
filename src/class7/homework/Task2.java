package class7.homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement displayBtn=driver.findElement(By.xpath("//button[text()='Enabled']"));
        System.out.println(displayBtn.isDisplayed());// true


       /* also we can use this method wait.until(ExpectedConditions.visibilityOf(displayBtn));
                                      System.out.println(displayBtn.isDisplayed());// true */

    }
}
