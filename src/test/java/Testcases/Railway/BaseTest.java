package Testcases.Railway;

import Comman.Constant;
import Comman.Utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");

        System.setProperty("Webdriver.chorme.driver", Utilities.getWorkingPath());
        Constant.WEBDRIVER = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-Condition");
        Constant.WEBDRIVER.quit();
    }
}
