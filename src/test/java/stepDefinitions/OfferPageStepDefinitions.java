package stepDefinitions;

import PageObjects.OffersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.Injection;

public class OfferPageStepDefinitions {

    public Injection injection;
    public OffersPage offersPage;


    public OfferPageStepDefinitions(Injection injection) {
        this.injection = injection;
        this.offersPage = injection.pageObjectManager.getOffersPage();

    }

    @And("^User Navigates to Offer Page and searches the product (.+)$")
    public void userNavigatesToOfferPageAndSearchesTheProduct(String shortname) throws InterruptedException {
        injection.pageObjectManager.getLandingPage().clickOnTopDealsLink();
        injection.genericUtils.switchTo();
        offersPage.searchProduct(shortname);
        Thread.sleep(2000);
    }

    @Then("User extracts the product full name from Offer Page and Verifies the same with Home Page product full name")
    public void userExtractsTheProductFullNameFromOfferPageAndVerifiesTheSameWithHomePageProductFullName() {

        String productName = offersPage.getProductName();
        Assert.assertEquals(productName, injection.landingPageProductName);


    }
}
