import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;


public class FindShoesTest extends BaseConfig{
    private MainPage mpage;



    @Test
    public void goToSearchShoes(){
        mpage = new MainPage(driver);
        mpage.goToEnterShoes();
    }

    }
