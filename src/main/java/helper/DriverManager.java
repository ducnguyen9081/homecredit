package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private  WebDriver driver;

    public WebDriver getDriver() {
        if(driver == null) driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
             driver = createLocalDriver();
        return driver;
    }

    private WebDriver createLocalDriver() {
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
      driver = new ChromeDriver();
         driver.manage().window().maximize();
        return driver;
    }

    public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
