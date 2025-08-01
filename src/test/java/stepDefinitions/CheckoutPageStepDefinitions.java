package stepDefinitions;

import PageObjects.CheckoutPage;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import utils.Injection;

public class CheckoutPageStepDefinitions {

    Injection injection;

    CheckoutPage checkoutPage;

    public CheckoutPageStepDefinitions (Injection injection){

        this.injection = injection;
        this.checkoutPage= injection.pageObjectManager.getCheckoutPage();


    }

@Given("^User verifies the (.+) is checkout page with quantity (.+)$")
    public void userVerifiesTheProductIsCheckoutPageWithQuantity(String product, String quantity) throws InterruptedException {
      injection.pageObjectManager.getLandingPage().goToCheckoutPage();
      Thread.sleep(2000);
    Assert.assertEquals(product, checkoutPage.getCheckoutProductName());
    Assert.assertEquals(quantity, checkoutPage.getCheckoutProductQuantity());
    Assert.assertTrue(checkoutPage.promoButtonIsDisplayed());
    Assert.assertTrue(checkoutPage.placeOrderButtonIsDisplayed());

   }


}
