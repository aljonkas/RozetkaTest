import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;

/**
 * Created by Alona on 17.08.2015.
 */
public class TestMenuNavigation extends BaseConfig{
    private MainPage mpage;

    @Test
    public void goToTestMenuNavigation(){
        mpage = new MainPage(driver);
        mpage.goToNav();
    }

    @Test
    public void goToTestMenuNavigation1(){
        mpage = new MainPage(driver);
        mpage.goToNav1();
    }
}
