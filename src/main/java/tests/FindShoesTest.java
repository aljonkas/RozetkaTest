package tests;


import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;

/**
 * Created by Alona on 17.07.2015.
 */
public class FindShoesTest extends BaseConfig{
    private MainPage mpage;



    @Test
    public void goToSearchShoes(){
        mpage = new MainPage(driver);
        mpage.goToEnterShoes();
    }

    }
