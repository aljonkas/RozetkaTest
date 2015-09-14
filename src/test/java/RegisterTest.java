import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;
import pages.RegisterPage;



public class RegisterTest extends BaseConfig{
    private MainPage mpage;
    private RegisterPage rpage;



    @Test
    public void goToRegister(){
        mpage = new MainPage(driver);
        rpage = new RegisterPage(driver);
        mpage.goToReg();
        rpage.goToEneterData();
        rpage.goToVerification();

    }


}
