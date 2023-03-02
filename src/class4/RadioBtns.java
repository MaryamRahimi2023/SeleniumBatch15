package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
       WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
      // maleBtn.click();

        // check if the radio button is enabled
       boolean isEnabledMale= maleBtn.isEnabled();// true
        System.out.println("the radio button male is enabled "+isEnabledMale);

        // check if the radio button is displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();// true
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        // check if the radio button is selected
        boolean isSelectedmale=maleBtn.isSelected();// false
        System.out.println("the radio button male is selected "+isSelectedmale);

        // if the radio button is not selected click on it

        if(!isSelectedmale){
            maleBtn.click();
        }

        // check the radio button is selected or not
        isSelectedmale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedmale);// true

        /* the radio button male is enabled true
           the radio button male is displayed true
           the radio button male is selected false
           the radio button male is selected true*/

    }
}
