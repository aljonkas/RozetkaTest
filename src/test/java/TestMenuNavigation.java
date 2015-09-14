import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;


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
