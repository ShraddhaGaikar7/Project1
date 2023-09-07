package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ActionStuff;
import testBase.WebTestBase;


public class SkinCarePage extends WebTestBase {
    @FindBy(xpath = "//*[@id=\"search-results\"]/div/div[2]/div[1]/span/div/select")
    WebElement dropDownTextBox;

    @FindBy(xpath = "//*[@id=\"search-results\"]/div/div[2]/div[5]/div[2]/div/ul/li[1]")
    WebElement radioBtn;


    public SkinCarePage() {

        PageFactory.initElements(driver, this);
    }


    public void dropDowmExample()  {
        dropDownTextBox.click();
        ActionStuff.selectDropDown(dropDownTextBox, "byIndex", "1");

    }

    public void radioButtonExample()  {
        radioBtn.click();


    }
}