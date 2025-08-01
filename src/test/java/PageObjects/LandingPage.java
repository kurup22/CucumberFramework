package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    private By searchBox= By.cssSelector(".search-keyword");
    private By productName=By.cssSelector("h4[class='product-name']:nth-child(2)");
    private By topDealsLink=By.linkText("Top Deals");
    private By incrementQuantityButton = By.cssSelector(".increment");
    private By addToCartButton = By.xpath("//button[contains(text(),'ADD TO CART')]");
    private By checkoutButton = By.xpath("//img[@alt='Cart']");
    private By proceedToCheckoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");






    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean verifyLandingPage() {
        return driver.getTitle().contains("GreenKart");
    }

   public void searchProduct(String shortname) throws InterruptedException {
        driver.findElement(searchBox).sendKeys(shortname);
        Thread.sleep(3000);
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public String getProductNameOnly(){
        String name = getProductName().split("-")[0].trim();
        return name;
    }

    public void clickOnTopDealsLink() {
        driver.findElement(topDealsLink).click();
    }

    public void incrementQuantity(String quantity) {

        int actQuantity=Integer.parseInt(quantity);
        for (int i = 0; i < actQuantity-1; i++) {
            driver.findElement(incrementQuantityButton).click();
                   }
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void goToCheckoutPage() throws InterruptedException {
        driver.findElement(checkoutButton).click();
        Thread.sleep(2000);
        driver.findElement(proceedToCheckoutButton).click();
    }
}
