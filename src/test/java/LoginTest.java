import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;
import pages.RegisterPage;



/**
 * Created by Alona on 22.07.2015.
 */
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
