package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver=new ChromeDriver();

        // open the Website http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

       // maximize window

        driver.manage().window().maximize();

        // send the user name

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // send the password

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // click on log in button

        driver.findElement(By.className("button")).click();

        driver.close();



    }
}
