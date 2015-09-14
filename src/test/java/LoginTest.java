import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;
import pages.RegisterPage;




public class LoginTest extends BaseConfig{
    private MainPage mpage;
    private RegisterPage rpage;



    @Test
    public void goToLogin(){
        mpage = new MainPage(driver);
        rpage = new RegisterPage(driver);
        mpage.goToLog();
    }

}
