package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;

    public WebTestBase() {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialization() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();		
		options.addArguments("--remote-allow-origins=*");
		//creating object for chrome driver 
	     driver = new ChromeDriver(options);
	    driver.navigate().to(prop.getProperty("url"));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().deleteAllCookies();
    }
}



