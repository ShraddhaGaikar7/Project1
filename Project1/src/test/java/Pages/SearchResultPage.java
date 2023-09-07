package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;


public class SearchResultPage extends WebTestBase{
    @FindBy(xpath = "//span[text()='Showing results for \"skin care\"']")
    WebElement searchResultText;


  public SearchResultPage(){
      PageFactory.initElements(driver,this);
  }

    public String getTextOfSearchResultPage(){
      return searchResultText.getText();

    }

}