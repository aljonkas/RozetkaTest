import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.CssXpath;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alona on 04.08.2015.
 */
public class CssXpathTest extends BaseConfig{
   // private WebDriver driver;
    private CssXpath cxtest;

   /* @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua");
    }*/

    @Test
    public void goToTestXpath(){
        cxtest = new CssXpath(driver);
        cxtest.goToClickXpath1();
        System.out.println("Ok1");
        cxtest.goToClickXpath2();
        System.out.println("Ok2");
        cxtest.goToClickXpath3();
        System.out.println("Ok3");
        cxtest.goToClickXpath4();
        System.out.println("Ok4");
    }

    @Test
    public void goToTestCss(){
        cxtest = new CssXpath(driver);
        cxtest.goToClickCss1();
        System.out.println("Ok1");
        cxtest.goToClickCss2();
        System.out.println("Ok2");
        cxtest.goToClickCss3();
        System.out.println("Ok3");
        cxtest.goToClickCss4();
        System.out.println("Ok4");

    }

   /* @AfterMethod
    public void tearDown(){
        driver.close();
    }*/

}
