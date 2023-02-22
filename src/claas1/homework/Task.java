package claas1.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    public static void main(String[] args) {

        /**
         * 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser
         */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        driver.get("https://www.amazon.com/");
        //or
        driver.navigate().to("https://www.amazon.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();



    }
}
