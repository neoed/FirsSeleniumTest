package Selenium_Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Firs_Selenium_Script {
    public WebDriver driver;
    @BeforeAll
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerem\\IdeaProjects\\chromedriver.exe");

    }
    @Test
    public void assertTrueTitle() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://jbzd.com.pl//");

        String title = driver.getTitle();
        assertTrue(title.contains("obrazki"));

        driver.quit();
    }

}
