package ui.selenium;

import ui.selenium.base.method.BaseMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static ui.selenium.base.driver.DriverInit.getDriver;
import static ui.selenium.base.driver.DriverInit.quit;

public class BaseTest extends BaseMethod {

    @BeforeMethod(groups = {"Smoke","Regression"})
    void setUp() {
        getDriver().get("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite");
        getDriver().manage().window().maximize();

    }

    @AfterMethod(groups = {"Smoke","Regression"})
    void close () {
        quit();
    }

}
