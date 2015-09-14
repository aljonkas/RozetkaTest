import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class TestAliexpress {

    @Test
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://aliexpress.com");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement element = driver.findElement(By.className("searchbar-operate-box"));
            System.out.println(element.getText());

        }
    }
