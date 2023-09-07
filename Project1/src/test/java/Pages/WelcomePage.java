package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;


public class WelcomePage extends WebTestBase {
    @FindBy(xpath = "//h1[text()='Welcome Gulshan']")
    WebElement welcomeText;

    @FindBy(xpath = "//a[text()='Continue Shopping']")
    WebElement continueShopingBtn;




    public WelcomePage() {

        PageFactory.initElements(driver,this);
    }
    public  String getTextOfWelcomePage(){

        return welcomeText.getText();
    }

    public void ContinueShopingClick(){

        continueShopingBtn.click();
    }

}