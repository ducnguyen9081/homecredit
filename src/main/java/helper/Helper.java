package helper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


public class Helper {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public Helper(){
        super();
    }

    @Before
    public void before(Method method){
        launchBrowser();
    }

    @After
    public void after(Method method) {
        webDriver.quit();
    }


    private void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--start-maximized");
        webDriver = new ChromeDriver(optionsChrome);
    }

    private String getChromeDriverPath() {
        return System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
    }

//    public void click(WebElement element) {
//        try {
//            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
//            element.click();
////            assertStep(Status.PASS, String.format("Clicked on %s successfully", elementName));
//        } catch (Exception e) {
////            assertStep(Status.FAIL, String.format("Failed to click on %s. ERROR: %s", elementName, e.getMessage()));
//        }
//    }

//    public void sendKeys(WebElement element, String value) {
//        try {
//
//            webDriverWait.until(ExpectedConditions.visibilityOf(element));
//            element.sendKeys(value);
////            assertStep(Status.PASS, String.format("Input [%s] into the %s successfully", value, elementName));
//        } catch (Exception e) {
////            assertStep(Status.FAIL,
////                    String.format("Failed to input [%s] into the %s. ERROR: %s", value, elementName, e.getMessage()));
//        }
//    }



    public void waitForJQuery(WebDriver driver) {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
                return (Boolean) js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
            }
        });
    }

    public void untilPageLoadComplete(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for 25 times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i=0; i<25; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")){
                break;
            }
        }
    }


}
