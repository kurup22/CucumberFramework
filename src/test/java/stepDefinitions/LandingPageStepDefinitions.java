package stepDefinitions;

import PageObjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.GenericUtils;
import utils.Injection;

import java.io.IOException;

public class LandingPageStepDefinitions {

    public WebDriver driver;
    public Injection injection;
    public LandingPage landingPage;
    public GenericUtils genericUtils;

    public LandingPageStepDefinitions(Injection injection) throws IOException {

        this.injection=injection;
        this.landingPage=injection.pageObjectManager.getLandingPage();

    }

    @Given("User is on Greenkart Home Page")
    public void user_is_on_greenkart_home_page() {
        Assert.assertTrue(landingPage.verifyLandingPage());

    }


    @When("^User searched product (.+) in Search Bar$")
    public void userSearchedProductInSearchBar(String shortname) throws InterruptedException {
       landingPage.searchProduct(shortname);
       Thread.sleep(2000);
    }


    @And("User extracts the actual product name from Search Results")
    public void userExtractsTheProductFullNameFromSearchResults() {

        injection.landingPageProductName =landingPage.getProductNameOnly();

    }


    @When("User searched product {} in Search Bar and add quantity {}")
    public void userSearchedProductInSearchBarAndAddQuantity(String product, String quantity) throws InterruptedException {

        landingPage.searchProduct(product);
        landingPage.incrementQuantity(quantity);
    }

    @Then("User adds the product to the cart")
    public void userAddsTheProductToTheCart() {
      landingPage.addToCart();
    }
}
