package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
    @FindBy(xpath = "//a[@id='wblhead']")
    WebElement head;
    @FindBy(xpath = "//a[@href='mailto:info@whitebox-learning.com']")
    WebElement mail;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean Checkhead(){
        return head.isDisplayed();
    }
    public boolean Checkmail(){
        return mail.isDisplayed();
    }
}
