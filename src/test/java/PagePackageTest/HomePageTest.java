package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage hp;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialisation();
        hp = new HomePage(driver);
    }

    @AfterMethod
    public void Teardown() {
        driver.close();
    }

    @Test
    public void Testlogo() {
        boolean logo = hp.Checklogo();
        Assert.assertTrue(logo);
    }
    @Test
    public void Teststudent() {
        boolean student = hp.Checkfreestudent();
        Assert.assertTrue(student);
    }
    @Test
    public void login() {
        hp.Clicklogin();

    }

}






