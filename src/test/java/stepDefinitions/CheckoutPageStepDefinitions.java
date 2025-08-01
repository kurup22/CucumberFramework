package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Injection;

public class CheckoutPageStepDefinitions {

    Injection injection;


    public CheckoutPageStepDefinitions (Injection injection){

        this.injection = injection;

    }

@Given("^User verifies the (.+) is checkout page with quantity (.+)$")
    public void userVerifiesTheProductIsCheckoutPageWithQuantity(String product, String quantity) {







    }


}
