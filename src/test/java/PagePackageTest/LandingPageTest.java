package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;

    public LandingPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialisation();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        land=new LandingPage(driver);
        hp.Clicklogin();
        lp.loginmethod(prop.getProperty("username"), prop.getProperty("password") );
        land=lp.Clicksubmit();
    }
    @AfterMethod
    public void Teardown(){
        driver.close();
    }
    @Test
    public void Testhead(){
        Boolean b=land.Checkhead();
        Assert.assertTrue(b);
    }
    @Test
    public void Testmail(){
        Boolean c=land.Checkmail();
        Assert.assertTrue(c);
    }
}

