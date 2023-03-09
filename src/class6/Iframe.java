package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

// switch the focus of the window to the desired iframe or website inside this website to send keys

        // by index method

        driver.switchTo().frame(0);// frame index start with zero
 // now the focus is on first frame

       WebElement textBox= driver.findElement(By.xpath("//input[@id='name']"));
       textBox.sendKeys("Maryam");
//  get the text click on from parent window

       driver.switchTo().defaultContent();
      WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("The text is "+ text.getText());// The text is click on the below link:
// get the text enter your name from first iframe

        // by name or id method

     driver.switchTo().frame("iframe_a");
     WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is "+getLabel.getText());// The label is Enter your name:

// switch focus to the main page

      driver.switchTo().defaultContent();//  is default content same as parent.

// clear what ever is written in text box in first frame

        // switch the focus to first frame

        // by webElement method

        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();








    }
}
