package class7.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println(checkBox.isSelected());//true

        /* This method will work as well wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox,true));;
                                         System.out.println(checkBox.isSelected());//true*/

    }
}


