package pageObject;

import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends Helper {

    WebDriver driver;

    public HomePage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy (how = How.XPATH, using = ".//input[@name='uid']")
    private WebElement userID;

    @FindBy (how = How.XPATH, using = ".//input[@name='password']")
    private WebElement password;

    @FindBy (how = How.XPATH, using = ".//input[@name='btnLogin']")
    private WebElement btnLogin;

    @FindBy (how = How.XPATH, using = ".//input[@name='btnReset']")
    private WebElement btnReset;

    public void clickOn_Login(){
        btnLogin.click();
        untilPageLoadComplete(driver);

    }

    public void clickOn_Reset() {
        btnReset.click();
        waitForJQuery(driver);
    }

    public void enterUserID(String input){
        userID.sendKeys(input);
    }

    public void  enterPassword(String input){
        password.sendKeys(input);
    }

    public void goToHomePage() throws InterruptedException{
        driver.get("http://demo.guru99.com/v4/");
        waitForJQuery(driver);
        untilPageLoadComplete(driver);
    }
}
