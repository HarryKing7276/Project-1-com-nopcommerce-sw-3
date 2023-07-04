package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;


    public void openBrowser(String baseUrl) {

        //Get the ChromeDriver
        driver = new ChromeDriver();

        //Get the URL
        driver.get(baseUrl);

        //Maximize window
        driver.manage().window().fullscreen();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser() {

        //Close multiple browser
        driver.quit();
    }

}




