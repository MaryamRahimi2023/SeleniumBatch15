package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiSelect {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dD =driver.findElement(By.xpath("//select[@id='multi-select']"));

        // use select class because this drop down has a select tag
        Select sel=new Select(dD);

        // using select class we have different methods to select the desired option

        // select by value
      sel.selectByValue("New Jersey");
      Thread.sleep(2000);
     
      // select by visible text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        // we can also deselect but only in multi select dropdown not in single dropdown

        sel.deselectByValue("New Jersey");
        Thread.sleep(1000);

        sel.deselectByVisibleText("Ohio");


        System.out.println("The dropDown is multiple selected "+ sel.isMultiple());// true

    }
}
