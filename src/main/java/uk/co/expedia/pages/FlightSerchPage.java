package uk.co.expedia.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;

public class FlightSerchPage extends Utility {
    private static final Logger log = Logger.getLogger(FlightSerchPage.class.getName());
 @FindBy(id = "flight-origin-hp-flight")
    WebElement _flyingFrom;
 @FindBy(id = "flight-destination-hp-flight")
    WebElement _goingTo;
 @FindBy(id = "flight-departing-hp-flight")
    WebElement _departingDate;
 @FindBy(id = "flight-returning-hp-flight")
    WebElement _returningDate;
 @FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']//div[9]/label/button")
    WebElement _searchBtn;

 public void sendTextToFlyingFrom(String flyfrm){
     sendTextToElement(_flyingFrom, flyfrm);
     log.info("Enter flying from:" + flyfrm + "in the flying from field"+ _flyingFrom.toString()+ "<br>");

 }
  public void  sendTextToGoingTo(String goTo){
     sendTextToElement(_goingTo, goTo);
     log.info("Enter going to"+goTo +" in the going to field"+ _goingTo.toString());
  }


}
