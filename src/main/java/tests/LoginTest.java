package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alona on 22.07.2015.
 */
public class LoginTest {
    private WebDriver driver;
    private MainPage mpage;
    private RegisterPage rpage;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua");
    }

    @Test
    public void goToLogin(){
        mpage = new MainPage(driver);
        rpage = new RegisterPage(driver);
        mpage.goToLog();
    }


    @AfterMethod
    public void tearDown(){
        driver.close();

    }



}
