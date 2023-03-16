package class8.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {

    /* 1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

        username=Admin
        password=Hum@nhrm123

        2. click on PIM option
        3. from the table select Any  value of id and click the check box associated with it

        make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath
        */
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        List<WebElement> column=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i <column.size() ; i++) {
           String id=column.get(i).getText();
           if(id.equalsIgnoreCase("52396A")) {
               System.out.println(id);// 52396A
               System.out.println("The index of id in the list " + i); // The index of id in the list 7
               System.out.println("The index of id in the table "+(i+1)); // The index of id in the table 8
               WebElement checkBox=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+ (i + 1) +"]/td[1]/input"));
               checkBox.click();
               System.out.println(checkBox.isSelected());// true
               driver.close();
           }
        }

    }
}
