package class3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // open the Website
        driver.get("http://www.amazon.com/");

        // get all links
        // we know that all links are in tag <a> which is also called anchor tag
        // lets use the locator By tagName for this purpose

        List<WebElement> tags=driver.findElements(By.tagName("a"));
        for (WebElement tag : tags) {
         //   System.out.println(tag);// only print address not the link
            // [[ChromeDriver: chrome on WINDOWS (c9daa86f78d7af1c8b5457afe9768eea)] -> tag name: a]
            String links = tag.getAttribute("href");// we do this to have the links, usually links are in href
            System.out.println(links);
            // https://www.goodreads.com/ and ...etc

        }

    }
}
