package browsertesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise Window
       //driver.manage().window().maximize();
        driver.manage().window().maximize();

        //we give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title=driver.getTitle();
        System.out.println("Page title is : " + title);

        // Get current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());

        //Find the email field
        WebElement emailField =driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Find the pasword field
        WebElement PasswordField =driver.findElement(By.name("Password"));
        PasswordField.sendKeys("test123");




        //close the browser


       driver.quit();
    }

}
