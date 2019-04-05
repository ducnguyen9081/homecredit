package helper;

import org.openqa.selenium.WebDriver;

public class SuperManager {

    private DriverManager driverManager;
    private  pageObjectManager pageObjectManager;

    public void SuperManager() {
        driverManager = new DriverManager();
        pageObjectManager = new pageObjectManager(driverManager.getDriver());
    }

    public  DriverManager getDriverManager(){
        return driverManager;
    }

    public  pageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
