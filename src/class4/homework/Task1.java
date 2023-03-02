package class4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /* check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check again if the checkbox is Selected or not*/

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox=driver.findElement(By.cssSelector("input[id= 'isAgeSelected']"));

        boolean isSelectedCheckBox=checkBox.isSelected();// the check box button is selected false
        System.out.println("the check box button is selected "+isSelectedCheckBox);
        if(!isSelectedCheckBox){
            checkBox.click();
        }
        isSelectedCheckBox=checkBox.isSelected();
        System.out.println("the check box button is selected "+isSelectedCheckBox);// the check box button is selected true

        driver.quit();

    }
}
