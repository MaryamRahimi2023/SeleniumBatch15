package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));

       // click on the button for simple promote alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        // use switchTo
      Alert alert= driver.switchTo().alert();
      Thread.sleep(2000);
      alert.accept();

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
        alert.accept();

//    click on the prompt alert button
      driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
//    the focus of the driver is now on the webpage in order to bring it back to the alert to switch the driver focus on alert

      alert.sendKeys("Maryam");
      Thread.sleep(2000);
      alert.accept();



    }
}
