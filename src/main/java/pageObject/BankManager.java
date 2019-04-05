package pageObject;

import helper.Helper;
import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BankManager extends Helper {

    WebDriver driver;

    public BankManager(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy (how = How.XPATH, using = ".//a[@href='addcustomerpage.php']")
    private WebElement newCustomer;

    @FindBy(how = How.XPATH, using = ".//input[@name='name']")
    private WebElement name;

    @FindBy (how = How.XPATH, using = ".//input[@id='dob']")
    private WebElement dob;

    @FindBy (how = How.XPATH, using = ".//input[@name='addr']")
    private WebElement address;

    @FindBy (how = How.XPATH, using = ".//input[@name='city']")
    private WebElement city;

    @FindBy (how = How.XPATH, using = ".//input[@name='state']")
    private WebElement state;

    @FindBy (how = How.XPATH, using = ".//input[@name='pinno']")
    private  WebElement pinno;

    @FindBy (how = How.XPATH, using = ".//input[@name='telephoneno']")
    private  WebElement mobileNumber;

    @FindBy (how =How.XPATH, using = ".//input[@name='emailid']")
    private WebElement email;

    @FindBy (how = How.XPATH, using = ".//input[@name='sub']")
    private WebElement subMit;

    public void clickOn_NewCustomer(){
        newCustomer.click();
        waitForJQuery(driver);
        untilPageLoadComplete(driver);
    }

    public void enterName(String input) {
        name.sendKeys(input);
    }

    public  void enterDob(String input) {
        input = input.replace("/","");
        dob.sendKeys(input);
    }

    public  void enterAddress(String input){
        address.sendKeys(input);
    }

    public void enterCity(String input){
        city.sendKeys(input);
    }

    public void enterState(String input){
        state.sendKeys(input);
    }

    public void enterPin(String input){
        pinno.sendKeys(input);
    }

    public  void enterMobileNumber(String input){
        mobileNumber.sendKeys(input);
    }

    public void enterEmail(String input){
        email.sendKeys(input);
    }

    public  void clickOn_Submit(){
        subMit.click();
        waitForJQuery(driver);
        untilPageLoadComplete(driver);
    }
}
