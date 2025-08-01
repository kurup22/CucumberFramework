package PageObjects;

import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class PageObjectManager {

    public LandingPage landingPage;
    public OffersPage offerPage;

    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        if (landingPage == null) {
            landingPage = new LandingPage(driver);
        }
        return landingPage;
    }


    public OffersPage getOffersPage() {
        if (offerPage == null) {
            offerPage = new OffersPage(driver);
        }
        return offerPage;
    }


}
