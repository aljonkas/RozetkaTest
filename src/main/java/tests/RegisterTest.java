package tests;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;


/**
 * Created by Alona on 16.07.2015.
 */
public class RegisterTest {
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
    public void goToRegister(){
        mpage = new MainPage(driver);
        rpage = new RegisterPage(driver);
        mpage.goToReg();
        rpage.goToEneterData();

    }



    @AfterMethod
    public void tearDown(){
        driver.close();

    }



}
