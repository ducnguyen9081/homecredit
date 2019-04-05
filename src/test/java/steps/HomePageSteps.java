package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helper.DriverManager;
import helper.SuperManager;
import helper.pageObjectManager;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;

public class HomePageSteps {

    WebDriver webDriver;
    HomePage homePage;
    DriverManager driverManager;
    pageObjectManager pageObjectManager;
    SuperManager superManager ;

//    public HomePageSteps(SuperManager superManager){
//        this.superManager = superManager;
//        homePage = superManager.getPageObjectManager().getHomePage();
//    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_page() throws Throwable {
        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();
        pageObjectManager = new pageObjectManager(webDriver);
        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();
    }

    @And("^User enter username \"([^\"]*)\"$")
    public void user_enter_username(String input) throws Throwable {

        homePage.enterUserID(input);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void user_enter_password(String input) throws Throwable {

        homePage.enterPassword(input);
    }

    @And("^User click button Login$")
    public void user_click_button_Login() {

        homePage.clickOn_Login();

    }

}
