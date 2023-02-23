package class2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
        HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0
        fill out the form
        click on register
        close the browser
*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Maryam");
        driver.findElement(By.id("customer.lastName")).sendKeys("Rahimi");
        driver.findElement(By.id("customer.address.street")).sendKeys("880 Knights Rd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Bensalem");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19020");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("267-456-7890");
        driver.findElement(By.id("customer.ssn")).sendKeys("267-45-7890");
        driver.findElement(By.id("customer.username")).sendKeys("MRahimi");
        driver.findElement(By.id("customer.password")).sendKeys("123$Abc");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123$Abc");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.close();











    }
}
