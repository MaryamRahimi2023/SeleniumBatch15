package class6.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        /*  1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
            2.Switch to the iframe on the page
            3.Clear the existing text in the  editor inside the iframe
            4.Enter the text "Hello World!" in the editor inside the iframe
            5.Switch back to the main page */

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        driver.switchTo().frame("mce_0_ifr");
        WebElement text=driver.findElement(By.xpath("//p"));
        text.clear();

        text.sendKeys("Hello World!");

        driver.switchTo().defaultContent();

        //driver.close();

    }
}
