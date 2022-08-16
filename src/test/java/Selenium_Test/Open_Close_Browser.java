package Selenium_Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Close_Browser {
    public WebDriver driver;
    @BeforeAll
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerem\\IdeaProjects\\chromedriver.exe");

    }

    @Test
    public void chromeSession() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.quit();
    }

}
