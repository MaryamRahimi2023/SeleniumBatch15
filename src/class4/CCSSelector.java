package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCSSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        // click on the button create account using CCS selector

       WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);// coz code is too fast and browser is slow we need to slow down a bit to give time to it to enter name

        WebElement firstName= driver.findElement(By.cssSelector("input[name=firstname]"));
        firstName.sendKeys("Maryam");

    }

}
