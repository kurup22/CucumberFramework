package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public WebDriver getDriver() throws IOException {
       Properties prop= new Properties();
       FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Global.properties");
        prop.load(fis);
        String browserProperty = prop.getProperty("browser");
        String browserSys= System.getProperty("browser");
        String browser = browserSys != null ? browserSys : browserProperty;
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }
            driver.get(prop.getProperty("QAURL"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
        //driver.manage().window().maximize();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return driver;
    }
}
