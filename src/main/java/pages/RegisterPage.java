package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alona on 16.07.2015.
 */
public class RegisterPage {
    public static final String ENTER_NAME = "TEST";
    public static final String ENTER_EMAIL = "test1234@gmail.com";
    public static final String ENTER_PASS = "test123";
    private WebDriver driver;

    @FindBy(xpath = "html/body/div[1]/div/div/div/div/form/div[1]/input")
    WebElement name;
    @FindBy(xpath = "html/body/div[1]/div/div/div/div/form/div[2]/input")
    WebElement email;
    @FindBy(xpath = "html/body/div[1]/div/div/div/div/form/div[3]/input")
    WebElement pasw;
    @FindBy(xpath = "html/body/div[1]/div/div/div/div/form/div[4]/span/button")
    WebElement register;

    @FindBy()

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goToEneterData(){
        name.sendKeys(ENTER_NAME);
        email.sendKeys(ENTER_EMAIL);
        pasw.sendKeys(ENTER_PASS);
        register.click();

    }


}
