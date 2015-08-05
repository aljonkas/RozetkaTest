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

    @FindBy(css = ".header-user-link.sprite-side.novisited.xhr")
    WebElement button;
    @FindBy(css = ".novisited.auth-f-signup-link")
    WebElement register;
    @FindBy(xpath = ".//*[@id='search']/form/div[1]/div[2]/input")
    WebElement search;

    @FindBy(xpath = "//div[1]/div/nav/ul/li[2]/a")
    WebElement phone;
    @FindBy(xpath = "//div/nav/ul/li[2]/div/div/div/div/ul/li[1]/a")
    WebElement smartphone;



    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[2]/span[2]/a")
    WebElement signin;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[2]/input")
    WebElement email;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[3]/div[1]/div[1]/input")
    WebElement password;
    @FindBy(xpath = "//header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[3]/div[1]/div[2]/div/span/button")
    WebElement enter;




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
        smartphone.click();
      //  allsmartphones.click();
    }

    public void goToLog() {
        signin.click();
        email.sendKeys(ENTER_EMAIL);
        password.sendKeys(ENTER_PASS);
        enter.click();

    }
}
