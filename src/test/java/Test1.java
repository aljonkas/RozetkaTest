import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;
import pages.SmartphonesPage;

import java.io.IOException;


/**
 * Created by Alona on 21.07.2015.
 * - зайти на сайт rozetka.com.ua
 - перейти у розділ "Телефони, MP3, GPS" +
 - перейти у розділ "Смартфони"          +
 - перейти у розділ "Всі смартфони"      +
 - вибрати з перших трьох сторінок пошукової видачі назви і ціни всіх девайсів позначених як "Топ продажів" +
 */


public class Test1 extends BaseConfig {
    final static String FILE_NAME = "E:\\Test1_result.txt";

    private MainPage mpage;
    private SmartphonesPage spage;


    @Test
    public void goToTest1() {
       try {
            mpage = new MainPage(driver);
            spage = new SmartphonesPage(driver);
            mpage.goToFind();
            spage.goToAll();
            spage.printToFileNamePhones(FILE_NAME);
            spage.goToPage(2);
            spage.printToFileNamePhones(FILE_NAME);
            spage.goToPage(3);
            spage.printToFileNamePhones(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


