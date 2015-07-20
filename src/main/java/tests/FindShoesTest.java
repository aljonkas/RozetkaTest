package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alona on 17.07.2015.
 */
public class FindShoesTest {
    private WebDriver driver;
    private MainPage mpage;


    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua");

    }

    @Test
    public void goToSearchShoes(){
        mpage = new MainPage(driver);
        mpage.goToEnterShoes();
    }


    @AfterMethod
    public void tearDown(){
        driver.close();

    }

    }
