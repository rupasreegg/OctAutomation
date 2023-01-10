package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(id="username")
    WebElement user;
    @FindBy(id="password")
    WebElement pass;
    @FindBy(xpath = "//button[@id='login']")
    WebElement lobtn;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void loginmethod(String un,String pwd) {
        user.sendKeys(un);
        pass.sendKeys(pwd);

    }
    public LandingPage Clicksubmit(){
        lobtn.click();
        return new LandingPage(driver);

    }

    }



