package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SmartphonesPage {
    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='head_banner_container']/div/div[2]/div/div/div[1]/div/ul[2]/li[1]/ul/li[1]/a")
    WebElement smartphone;

    @FindBy(xpath = ".//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[1]/div/ul[2]/li[1]/ul/li[1]/a")
    WebElement allsmartphones;

    @FindBy(xpath = "*//i[contains(@class,'g-tag') and contains(@class,'g-tag-icon-middle-popularity')]/ancestor::div[3]//div[4]/a")
    private List<WebElement> searchTopNamePhone;
    @FindBy(xpath = "*//i[contains(@class,'g-tag') and contains(@class,'g-tag-icon-middle-popularity')]/ancestor::div[3]//div[@class='g-price-uah']")
    private List<WebElement> searchTopPricePhone;


    public SmartphonesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToAll() {
        smartphone.click();
        allsmartphones.click();
    }

    public ArrayList<String> printToFileNamePhones(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < searchTopNamePhone.size(); i++) {
            arrayList.add(searchTopNamePhone.get(i).getText() + " = " + searchTopPricePhone.get(i).getText());
            fileWriter.write(arrayList.get(i) + "\r\n");
        }
        fileWriter.write("==========================================================================" + "\r\n");
        fileWriter.close();
        return arrayList;
    }

    public void goToPage(int number) {
        driver.findElement(By.linkText(String.valueOf(number))).click();
    }
}
