package Pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ActionStuff;
import Utils.Utility;
import testBase.WebTestBase;

import java.util.Set;

public class HomePage extends WebTestBase {
    @FindBy(id = "searchForm")
    WebElement searchTextBox;

    @FindBy(xpath = "//span[@class='icon-search']")
    WebElement searchbtn;

    @FindBy(xpath = "//span[@class='icon-account']")
    WebElement login;

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement firstAdvertiseClose;

    @FindBy(xpath = "//a[@class='lion-notification__close-button']")
    WebElement secondAdvertiseClose;


    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/div/header/div/div/div/div[3]/div/a[1]/span")
    WebElement giftIcon;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/div/header/nav/div[1]/div/div[2]/div[2]/a")
    WebElement mouseOverIcon;



    @FindBy(xpath = "//i[@class='icon-instagram']")
    WebElement instagramIcon;



    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void loginClick() {

        login.click();
    }

    public void searchProduct(String searchText) {

        searchTextBox.sendKeys(searchText);
    }

    public void searchClick() {

        searchbtn.click();
    }

    public void closedFirstAdvertise() {
        Utility.waitUntilElementToBeClick(driver, firstAdvertiseClose);

    }

    public void closedSecondAdvertise() {

        Utility.waitUntilElementToBeClick(driver, secondAdvertiseClose);
    }



    public void windowHandelExample()  {
        ActionStuff.switchToWindowHandles(driver);
        instagramIcon.click();
    }

    public void scrollDownExample() {

        ActionStuff.scrollByVisibilityOfElement(driver);
    }


    public void clickAndHoldExample()  {
        ActionStuff.clickAndHoldMethod(driver, giftIcon);
    }



    public void moveOverExample()  {

        ActionStuff.mouseOver(driver, mouseOverIcon);
        mouseOverIcon.click();


    }

    public void addCookies() {
        Cookie cok = new Cookie("Hello", "World");
        driver.manage().addCookie(cok);
    }

    public void setCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }
}