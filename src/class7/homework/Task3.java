package class7.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task3 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement disableBtn=driver.findElement(By.xpath("//button[@id='disable']"));
        wait.until(ExpectedConditions.elementToBeClickable(disableBtn));
        System.out.println(disableBtn.isEnabled());// true

    }
}
