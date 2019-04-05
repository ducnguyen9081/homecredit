package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helper.DriverManager;
import pageObject.BankManager;

public class BankManagerSteps {

    DriverManager driverManager;
    BankManager bankManager;

    @And("^User enter customer name \"([^\"]*)\"$")
    public void userEnterCustomerName(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterName(input);
    }

    @And("^User enter date of birth \"([^\"]*)\"$")
    public void userEnterDateOfBirth(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterDob(input);
    }

    @And("^User enter address \"([^\"]*)\"$")
    public void userEnterAddress(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterAddress(input);
    }

    @And("^User enter city \"([^\"]*)\"$")
    public void userEnterCity(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterCity(input);
    }

    @And("^User enter state \"([^\"]*)\"$")
    public void userEnterState(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterState(input);
    }

    @And("^User enter pin \"([^\"]*)\"$")
    public void userEnterPin(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterPin(input);
    }

    @And("^User enter mobile number \"([^\"]*)\"$")
    public void userEnterMobileNumber(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterMobileNumber(input);
    }

    @And("^User enter email \"([^\"]*)\"$")
    public void userEnterEmail(String input) {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.enterEmail(input);
    }

    @And("^User click button Submit$")
    public void userClickButtonSubmit() {
    }

    @Given("User enter click New Customer")
    public void userEnterClickNewCustomer() {
        bankManager = new BankManager(driverManager.getDriver());
        bankManager.clickOn_NewCustomer();
    }
}
