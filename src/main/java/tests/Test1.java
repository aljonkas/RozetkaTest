package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SmartphonesPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alona on 21.07.2015.
 * - ����� �� ���� rozetka.com.ua
 - ������� � ����� "��������, MP3, GPS"
 - ������� � ����� "���������"
 - ������� � ����� "�� ���������"
 - ������� � ������ ����� ������� �������� ������ ����� � ���� ��� ������� ���������� �� "��� �������"
 */
public class Test1 {

   private static WebDriver driver;
    private MainPage mpage;
    private SmartphonesPage spage;


    @FindBy(xpath = "//div/ul[2]/li[1]/ul/li[1]/a")
    WebElement allsmartphones;




    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua");
    }



    @Test
    public void goToTest1(){
        mpage = new MainPage(driver);
        spage = new SmartphonesPage(driver);
        mpage.goToFind();
        spage.goToAll();

    }

    @AfterMethod
    public void tearDown() {driver.close();}


}