package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

       /* task1: access level 1 table based access
                get all table data and print them*/
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data= table.getText();
        System.out.println(table_data);// return the below data as single String

        /*Company Contact Country
        Google Maria Anders Germany
        Meta Francisco Chang Mexico
        Microsoft Roland Mendel Austria
        Island Trading Helen Bennett UK
        Adobe Yoshi Tannamuri Canada
        Amazon Giovanni Rovelli Italy*/

        /*task2: row level access
            get the rows of the table and print them
            print the rows that contains company google  */

        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : Rows) {
            // extract text from  each row
            String row_text=row.getText();
            if (row_text.contains("Google")){// print only the String that contains Google
            System.out.println(row_text);// Google Maria Anders Germany
            }
        }

        /*task3: column level access
            get the text from all column of the table and print them */

        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {
            String column_text=column.getText();
            System.out.print(column_text+" ");/*Google Maria Anders Germany
                                                Meta Francisco Chang Mexico
                                                Microsoft Roland Mendel Austria
                                                Island Trading Helen Bennett UK
                                                Adobe Yoshi Tannamuri Canada
                                                Amazon Giovanni Rovelli Italy */
        }

        /*task4: just print the first column of every row */

        List<WebElement> firstColumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement firstcolumn : firstColumns) {
           String firstColumn1= firstcolumn.getText();
            System.out.println(firstColumn1);/*Google
                                               Meta
                                               Microsoft
                                               Island Trading
                                               Adobe
                                               Amazon */

        }
    }
}
