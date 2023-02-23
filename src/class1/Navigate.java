package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect to WebDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
       // initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // open google.com            // if I want to navigate to a website I can do 2 ways
        driver.get("https://google.com");
        // navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // slow down
        Thread.sleep(2000);
        //go back
        driver.navigate().back();// only available in navigate not in get
        // slow down
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();

        driver.close();


    }


}
