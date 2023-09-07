package Utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testBase.WebTestBase;

import java.util.Set;

public class ActionStuff extends WebTestBase {
    public static void scrollByVisibilityOfElement(WebDriver driver) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
    }


    public static void mouseOver(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public static void clickAndHoldMethod(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.clickAndHold(element).perform();
    }


    public static void selectDropDown(WebElement element, String term, String value) {
        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value);
        } else if (term.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value));
        } else if (term.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value);
        } else {
            System.out.println("Please select the correct value");
        }
    }


    public static void switchToWindowHandles(WebDriver driver) {
        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s).getTitle();
            }else {
                driver.switchTo().window(parentWindows);
            }

        }
    }


		
	}

