package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alona on 21.07.2015.
 */
public abstract class BaseForPages {
    private WebDriver driver;

    public BaseForPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
