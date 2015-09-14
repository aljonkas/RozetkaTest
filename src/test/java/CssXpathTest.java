import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.CssXpath;

import java.util.concurrent.TimeUnit;


public class CssXpathTest extends BaseConfig{

    private CssXpath cxtest;



    @Test
    public void goToTestXpath(){
        cxtest = new CssXpath(driver);
        cxtest.goToClickXpath1();
        System.out.println("Ok1");
        cxtest.goToClickXpath2();
        System.out.println("Ok2");
        cxtest.goToClickXpath3();
        System.out.println("Ok3");
        cxtest.goToClickXpath4();
        System.out.println("Ok4");
    }

    @Test
    public void goToTestCss(){
        cxtest = new CssXpath(driver);
        cxtest.goToClickCss1();
        System.out.println("Ok1");
        cxtest.goToClickCss2();
        System.out.println("Ok2");
        cxtest.goToClickCss3();
        System.out.println("Ok3");
        cxtest.goToClickCss4();
        System.out.println("Ok4");

    }

}
