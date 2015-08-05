package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alona on 04.08.2015.
 */
public class CssXpath {
    private WebDriver driver;

    @FindBy(xpath = ".//header/div[2]/div/div[2]/ul/li/div[2]/div/a")
    WebElement basket;
    @FindBy(xpath = ".//*[@id='head_banner_container']/div/div[3]/div/section")
    WebElement news;
    @FindBy(xpath = "//header/div[2]/div/div[2]/div[3]/form/div/div[2]")
    WebElement search;
    @FindBy(xpath = ".//*[@id='city-chooser']/a")
    WebElement changecity;


    @FindBy(css = ".sprite-side.novisited.hub-i-link.hub-i-cart-link")
    WebElement basket1;
    @FindBy(css = ".news")
    WebElement news1;
    @FindBy(css = ".header-search-input-text.passive")
    WebElement search1;
    @FindBy(css = ".novisited.sprite-side.header-city-select-link")
    WebElement changecity1;

    public CssXpath(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToClickXpath1() {
        basket.click();
    }

    public void goToClickXpath2() {
        news.click();
    }

    public void goToClickXpath3() {
        search.sendKeys("Ok");
    }

    public void goToClickXpath4() {
        changecity.click();
    }

    public void goToClickCss1() {
        basket1.click();
    }

    public void goToClickCss2() {
        news1.click();
    }

    public void goToClickCss3() {
        search1.sendKeys("Ok");
    }

    public void goToClickCss4() {
        changecity1.click();
    }
}
