package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alona on 04.08.2015.
 */
public class TestA {

    @Test
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://aliexpress.com");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement element = driver.findElement(By.id("search-dropdown-box"));
            System.out.println(element.getText());

        }
    }
