package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicTable2 {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

//        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

// task:check the checkbox containing the product screensaver
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));// this is the list of all elements
//iterate through each to see if it conatins screen saver
        for (int i = 0; i < column.size(); i++) {
//            extract the text
            String text = column.get(i).getText();
           // System.out.println(text);
            /*      ScreenSaver
                    FamilyAlbum
                    ScreenSaver
                    MyMoney
                    MyMoney
                    FamilyAlbum
                    MyMoney
                    FamilyAlbum*/

           if (text.equalsIgnoreCase("ScreenSaver")) {// if I change this ScreenSaver to other element of table will work too
                System.out.println(text);
                /*      ScreenSaver
                        ScreenSaver */

                System.out.println("the row that contains screensaver is in the list " +i);// List<WebElement> column which the index start from 0
                System.out.println("the row that contains screensaver is in the table " + (i + 2));// i+2 coz 1 for the index difference from the list and 1 from the header in the table

                // xpath for the checkbox of ScanSaver to be checked
                System.out.println("check the check box");

                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));// checkbox is in td[1]
                checkbox.click();

           }

        }
    }
}
