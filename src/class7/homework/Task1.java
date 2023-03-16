package class7.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        WebElement text= driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(text.getText());// Selenium Webdriver

        boolean isTextChanged=wait.until(ExpectedConditions.textToBe(By.id("h2"),"Selenium Webdriver"));
        System.out.println(isTextChanged);
    }

}
