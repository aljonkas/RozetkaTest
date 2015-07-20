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

    @FindBy(css = ".header-user-link.sprite-side.novisited.xhr")
    WebElement button;
    @FindBy(css = ".novisited.auth-f-signup-link")
    WebElement register;
    @FindBy(css = ".header-search-input-text.passive")
    WebElement search;


    public void goToEnterShoes(){
        search.sendKeys("обувь");

    }


    public void goToReg() {
        button.click();
        register.click();
    }


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
