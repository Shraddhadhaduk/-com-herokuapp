package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    public static void main(String[] args) throws InterruptedException {
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //open the url into the browser
        driver.get(baseUrl);

        //maximize the browser
        driver.manage().window().maximize();

        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        String  current = driver.getCurrentUrl();
        System.out.println("The current url " + driver.getCurrentUrl());

        //get the page source
        System.out.println(driver.getPageSource());

        //find username field element and type the email
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("Shraddha");

        //Find password field element and type the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("1234");

        //Find login link element and click on it
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();
        Thread.sleep(2000);


        //Get the next Url
        String currentUrl = "http://the-internet.herokuapp.com/login";
        System.out.println("Get current Url " + driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();

    }
}
