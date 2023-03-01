package class3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();

        // open the Website http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        // find the username
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        //find the password field
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        // clear the username text box using method clear()

        username.clear();// save our finding in a variable helps us reuse it.
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));// or we have to find again
        password.clear();

        // get the text next to the username text box

        WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());// Username:

        // get the text next to the password text box

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText= password.getText();
        System.out.println(pasText);// empty if no text






    }
}
