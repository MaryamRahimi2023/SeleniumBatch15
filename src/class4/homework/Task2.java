package class4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {

    /* 1. u need to write down the code that can select  1 check box out of 4 mentioned,
         e.g option1 , option2 , option 3, option 4

         Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

       List<WebElement> checkBoxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));


        for (WebElement checkBox : checkBoxes) {
            System.out.println(checkBox.getAttribute("value"));// Option-1, Option-2, Option-3, Option-4

            String optionBox=checkBox.getAttribute("value");
            if(optionBox.equalsIgnoreCase("Option-2")) {// we can change "Option-2" to any other value to select a different checkbox
                checkBox.click();
            }
        }
        Thread.sleep(1000);
       driver.quit();

    }
}
