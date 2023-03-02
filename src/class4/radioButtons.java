package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//a[text()='Proceed Anyway']")).click();

        // find all the group radio buttons
       // the xpath here is common to all the webelements that have age group
       List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='ageGroup']"));
       // iterator over the list to see ur desired one
        for (WebElement radioButton : radioButtons) {
            System.out.println(radioButton.getAttribute("value"));// 0 - 5 , 5 - 15,15 - 50

           String age= radioButton.getAttribute("value");
           if(age.equalsIgnoreCase("10 - 15"));
           radioButton.click();

        }
        // also we can create an array to check if all te buttons are clickable
        String [] age={"0 - 5","5 - 15","15 - 50"};
        for (int i = 0; i < age.length; i++) {
            //radioButton.click();
        }

    }
}
