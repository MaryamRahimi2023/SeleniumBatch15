package class2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
     HW2
     navigate to fb.com
     click on create new account
     fill up all the textboxes
     click on sign up button
     close the pop up
     close the browser
     TIP for HW2:
     just fill in text boxes or button, no need to deal with other webElements
     also u will need a Thread.sleep after clcikng on create new account 🙂
     we will discuss "WHY" in future
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Gulam Ali");
        driver.findElement(By.name("lastname")).sendKeys("Mehraban");
        driver.findElement(By.name("reg_email__")).sendKeys("Gulam Ali.Mehrabani@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
        
        driver.close();








    }
}
