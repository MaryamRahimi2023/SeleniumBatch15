package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    /* Task
    1. navigate to the link ...........
    2. login
    3.get title and verify it is correct
    4.logout
    5.close the browser
     */

    public static void main(String[] args) {
        // tell your project where the wendriver is located.

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WedDriver

        WebDriver driver=new ChromeDriver();

        // navigateto the website

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // maximize the window

        driver.manage().window().maximize();

        // send the username

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // send the password

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // click on log in button

        driver.findElement(By.className("button")).click();

        // get the title and verify if it is correct

        String title = driver.getTitle();
        // System.out.println(title);// to see what is the title

        if(title.equals("Web Orders")){
            System.out.println("the title is correct");
        }else {
            System.out.println("the title is incorrect");
        }

        System.out.println(driver.findElement(By.className("login_info")).getText());

        // logout

       driver.findElement(By.linkText("Logout")).click();

       driver.close();
    }
}
