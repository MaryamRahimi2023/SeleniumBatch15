package claas1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    private static String title;

    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriveris located.
        // for mac do not use .exe with chromedriver

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver=new ChromeDriver();

        // open the Website facebook.com

        driver.get("https://www.facebook.com/");

        // get the current url that is there in the browser

        String URL = driver.getCurrentUrl();

        // print out the url

        System.out.println(URL);

        // get the title of the webpage
        String title=driver.getTitle();

        // print the title of the page
        System.out.println("the title of the page "+title);

        Thread.sleep(3000);// before closing waits for 3 sec

        // close the browser

        driver.quit();
    }
}