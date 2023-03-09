package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dropDown =driver.findElement(By.xpath("//select[@id='select-demo']"));

        /*For dropdown not necessary that always select tag is found.
        There is another way developer creates dropdown using div tag also. So,when you inspect the dropdown...if it's made of select tag then use Select class.
        For dropdown made by other than select tag. Use findElements ();
        and return type is List(WebElement)*/

        // use select class because this drop down has a select tag
        Select sel=new Select(dropDown);

        // using select class we have different methods to select the desired option

        // Select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);

        // select by value
      sel.selectByValue("Tuesday");
      Thread.sleep(2000);

      // select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);


    }
}
