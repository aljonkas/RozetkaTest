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

    public static final String ENTER_TEXT = "string";

    @FindBy(css = ".header-user-link.sprite-side.novisited.xhr")
    WebElement button;
    @FindBy(css = ".novisited.auth-f-signup-link")
    WebElement register;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[3]/form/div[1]/div[2]/input")
    WebElement search;

    @FindBy(xpath = "//div[1]/div/nav/ul/li[2]/a")
    WebElement phone;
    @FindBy(xpath = "//div/nav/ul/li[2]/div/div/div/div/ul/li[1]/a")
    WebElement smartphone;

    @FindBy(xpath = "//div/ul[2]/li[1]/ul/li[1]/a")
    WebElement allsmartphones;



    public void goToEnterShoes(){
        search.sendKeys(ENTER_TEXT);

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
       // allsmartphones.click();
    }
}
