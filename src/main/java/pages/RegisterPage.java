package pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;




public class RegisterPage {
    public static final String ENTER_NAME = "TEST";
    public static final String ENTER_EMAIL = "ta90@gmail.com";
    public static final String ENTER_PASS = "test123";
    private WebDriver driver;

    @FindBy(name = "title")
    WebElement name;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement pasw;
    @FindBy(xpath = ".//div/span/button")
    WebElement register;
    @FindBy(id = "personal_information")
    WebElement personalinfo;



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


    public void goToVerification() {

        Assert.assertTrue(personalinfo.getText().contains(ENTER_NAME));
       // System.out.println("Registered successfully");
    }


}
