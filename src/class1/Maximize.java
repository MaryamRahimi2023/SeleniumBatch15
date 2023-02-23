package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

    public static void main(String[] args) {

        // connect to WebDriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // initiate the instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // go to google.com
        driver.get("https://google.com");
        // maximize the window
        driver.manage().window().maximize();
        // open full screen window
        driver.manage().window().fullscreen();
        driver.close();
    }
}
