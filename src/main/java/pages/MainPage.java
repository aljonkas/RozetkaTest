package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alona on 16.07.2015.
 */
public class MainPage {
    private WebDriver driver;

    public static final String ENTER_TEXT = "shoes";
    @FindBy(xpath = "//header/div/div/div[2]/div[3]/form/span/span")
    WebElement bsearch;

    public static final String ENTER_NAME = "TEST";
    public static final String ENTER_EMAIL = "ta90@gmail.com";
    public static final String ENTER_PASS = "test123";

    public static final String BASE_URL = "www.rozetka.ua";

    @FindBy(css = ".header-user-link.sprite-side.novisited.xhr")
    WebElement button;
    @FindBy(css = ".novisited.auth-f-signup-link")
    WebElement register;
    @FindBy(xpath = ".//*[@id='search']/form/div[1]/div[2]/input")
    WebElement search;

    @FindBy(xpath = "//div[1]/div/nav/ul/li[2]/a")
    WebElement phone;




    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[2]/span[2]/a")
    WebElement signin;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[2]/input")
    WebElement email;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[3]/div[1]/div[1]/input")
    WebElement password;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[3]/div[1]/div[2]/div/span/button")
    WebElement enter;

//Navigation
    @FindBy(xpath = ".//*[@id='m-main']/li[1]/a")
    WebElement netbook;
    @FindBy(xpath = ".//*[@id='m-main']/li[13]/a")
    WebElement clothes;
    @FindBy(xpath = ".//*[@id='m-main']/li[15]/a")
    WebElement cosmetic;


    public void goToEnterShoes(){
        search.sendKeys(ENTER_TEXT);
        bsearch.click();

    }


    public void goToReg() {
        button.click();
        register.click();
    }


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToFind() {
        phone.click();

    }

    public void goToLog() {
        signin.click();
        email.sendKeys(ENTER_EMAIL);
        password.sendKeys(ENTER_PASS);
        enter.click();

    }

    public void goToNav() {
        netbook.click();
        driver.get(BASE_URL);
        clothes.click();
        driver.get(BASE_URL);
        cosmetic.click();
    }

    public void goToNav1() {
        driver.get(BASE_URL+"/computers-notebooks");
        driver.get(BASE_URL);
        driver.get(BASE_URL+"/phones-mp3-gps");
        driver.get(BASE_URL);
        driver.get(BASE_URL+"/tv-photo-video");


    }
}
