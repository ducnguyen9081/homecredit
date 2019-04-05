package helper;

import org.openqa.selenium.WebDriver;
import pageObject.BankManager;
import pageObject.HomePage;

public class pageObjectManager {

    private WebDriver webDriver;
    private HomePage homePage;
    private BankManager bankManager;

    public  pageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;

    }

    public BankManager getBankManager(){

        return (bankManager == null) ? bankManager = new BankManager(webDriver) : bankManager;

    }
}
