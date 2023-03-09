package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Because the process is so fast and the code changes in dom so it won't work, and we need to place below code

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// we do not put Thread.sleep coz we don't know how long it will take
        // that code appears in DOM and above is a dynamic way and if it takes 1 second will take 1 second, and we can move for next job

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Gulam Ali");



    }
}
