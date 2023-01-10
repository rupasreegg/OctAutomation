package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;

    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialisation();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        hp.Clicklogin();
    }
    @AfterMethod
    public void Teardown(){
        driver.close();
    }
    @Test
    public void Testloginpage(){
        lp.loginmethod(prop.getProperty("username"), prop.getProperty("password") );
        land=lp.Clicksubmit();
    }

}



