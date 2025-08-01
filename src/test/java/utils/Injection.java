package utils;

import PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Injection {

    public WebDriver driver;
    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;
    public  String landingPageProductName;
    public Injection() throws IOException {

        testBase = new TestBase();
        pageObjectManager=new PageObjectManager(testBase.getDriver());
        genericUtils=new GenericUtils(testBase.getDriver());

   }
}
