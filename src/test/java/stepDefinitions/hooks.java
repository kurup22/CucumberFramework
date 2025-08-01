package stepDefinitions;

import io.cucumber.java.After;
import utils.Injection;

import java.io.IOException;

public class hooks {

     Injection injection;

    public hooks(Injection injection){

        this.injection = injection;
    }

    @After
    public void tearDown() throws IOException {
        if (injection.testBase.getDriver() != null) {
            injection.testBase.getDriver().quit();
        }
    }


}
