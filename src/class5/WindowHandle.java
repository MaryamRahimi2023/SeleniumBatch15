package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the parent window

        driver.getWindowHandle();// return us the current window handle which the focus is which is gmail.com main page now we did not change the focus still
        String parentWindowHundle = driver.getWindowHandle();
        System.out.println(parentWindowHundle);// CDwindow-61D1304FBC7A491C14F806C8691AA5B5

        // get the window handles of all the windows that have been opened up

        driver.getWindowHandles();
        // return us in a set coz multiple strings in no order randomly
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            System.out.println(windowHandle);
            /* CDwindow-962A61AAC027A736B017697043EE89E3  gmail.com
               CDwindow-BBDCDB7EA9934126071BE69729D0E80B  privacy.com
               CDwindow-767ACDAA6FB92769479B1180DAE1E067  help.com */

            driver.switchTo().window(windowHandle);
            String title=driver.getTitle();

           if(title.equalsIgnoreCase("Google Account Help")) {
               driver.findElement(By.xpath("//input [@name='q']")).sendKeys("Maryam");
               break;
           }
        }
//       to varify if we got the title, and we are in the page we want
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHundle);

    }
}
