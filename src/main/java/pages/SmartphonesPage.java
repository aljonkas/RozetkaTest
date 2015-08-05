package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alona on 23.07.2015.
 */
public class SmartphonesPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[1]/div/div[2]/div[2]/div/div[1]/div/ul[2]/li[1]/ul/li[1]/a")
    WebElement allsmartphones;


    public SmartphonesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToAll() {
        allsmartphones.click();
    }
}
