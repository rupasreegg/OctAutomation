package BasePackage;

import UtilisPackage.Utilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    public static Logger log;

    public BaseClass() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\balac\\IdeaProjects\\OctAutomation\\src\\main\\java\\ConfigPackage\\Config.Properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Initialisation(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        log.info("created driver");
        driver.manage().window().maximize();
        log.info("maxi the window");
        driver.get(prop.getProperty("url"));
        log.info("enter url");
        log=Logger.getLogger("OctAutomation");
        PropertyConfigurator.configure("C:\\Users\\balac\\IdeaProjects\\OctAutomation\\src\\test\\resources\\log4j.properties");
        driver.manage().timeouts().pageLoadTimeout(Utilis.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utilis.IMPLICIT_WAIT,TimeUnit.SECONDS);




    }

}
