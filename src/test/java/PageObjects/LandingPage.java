package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    private By searchBox= By.cssSelector(".search-keyword");
    private By productName=By.cssSelector("h4[class='product-name']:nth-child(2)");
    private By topDealsLink=By.linkText("Top Deals");



    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean verifyLandingPage() {
        return driver.getTitle().contains("GreenKart");
    }

   public void searchProduct(String shortname) {
        driver.findElement(searchBox).sendKeys(shortname);
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
}
