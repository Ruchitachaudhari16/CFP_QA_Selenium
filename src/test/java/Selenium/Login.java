package Selenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public WebDriver driver; // create object of webdriver class.

   @Test
   public void facebookLogin()
    {
        driver=new ChromeDriver(); //Open the chrome browser.
        driver.get("https://www.facebook.com/"); //Launch the application
    }
}
