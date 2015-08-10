package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseConfig;
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
public class Test1 extends BaseConfig{
    private MainPage mpage;
    private SmartphonesPage spage;


    @FindBy(xpath = "//div/ul[2]/li[1]/ul/li[1]/a")
    WebElement allsmartphones;



    @Test
    public void goToTest1(){
        mpage = new MainPage(driver);
        spage = new SmartphonesPage(driver);
        mpage.goToFind();
        spage.goToAll();

    }



}
