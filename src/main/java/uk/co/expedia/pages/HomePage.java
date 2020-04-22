package uk.co.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

import java.util.logging.Logger;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    @FindBy(id = "primary-header-flight")
    WebElement _flightTab;

    @FindBy(id = "header-account-menu")
    WebElement _acccountTab;

    public void clickOnFlight() {
        Reporter.log("Click on flight tab: " + _flightTab.toString() + "<br>");
        clickOnElement(_flightTab);
        log.info("Click on flight tab:" + _flightTab.toString());
    }
    public void clickOnAccountTab() {
        Reporter.log("Click on account tab:" + _acccountTab.toString());
        clickOnElement(_acccountTab);
        log.info("Click on account tab:" + _acccountTab.toString());
    }

}
