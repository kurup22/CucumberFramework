package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    public WebDriver driver;
    public OffersPage (WebDriver driver){
        this.driver = driver;
    }

    By searchBox = By.cssSelector("#search-field");
    By productName = By.xpath("//tr/td[1]");

    public void searchProduct(String shortname) {
        driver.findElement(searchBox).sendKeys(shortname);
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
}
