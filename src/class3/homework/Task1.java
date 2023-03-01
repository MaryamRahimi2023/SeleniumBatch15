package class3.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /*  use xpath to complete this
        goto http://practice.syntaxtechs.net/basic-first-form-demo.php
        enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement message=driver.findElement(By.xpath("//input[contains(@placeholder, 'Message')]"));
        message.sendKeys("I like Selenium");
        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();
        WebElement a=driver.findElement(By.xpath("//input[@id = 'sum1']"));
        a.sendKeys("2");
        WebElement b=driver.findElement(By.xpath("//input[@id = 'sum2']"));
        b.sendKeys("3");
        WebElement total=driver.findElement(By.xpath("//button[contains(text(), 'Total')]"));
        total.click();
        String totalPrint=total.getAttribute("type");
        System.out.println(totalPrint);//button
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.xpath("//label[text()=' Total a + b = ']"))
                        .getText()+" "+driver.findElement(By.xpath("//span[@id='displayvalue']"))
                        .getText());// Total a + b = 5
        driver.quit();
    }
}
