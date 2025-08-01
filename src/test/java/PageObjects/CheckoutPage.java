package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    public WebDriver driver;
    private By checkoutProductName = By.cssSelector(".product-name");
    private By checkoutProductQuantity = By.cssSelector(".quantity");
    private By promoButton = By.className("promoBtn");
    private By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");     // Assuming there's a promo button with this ID


    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getCheckoutProductName() {
        return driver.findElement(checkoutProductName).getText().split("-")[0].trim();
    }
    public String getCheckoutProductQuantity() {
        return driver.findElement(checkoutProductQuantity).getText();
    }

    public boolean promoButtonIsDisplayed() {

        return driver.findElement(promoButton).isDisplayed();
    }

    public boolean placeOrderButtonIsDisplayed() {

        return driver.findElement(placeOrderButton).isDisplayed();
    }
    // Method to verify product and quantity on checkout page

}
    // Additional methods related to checkout can be added here


