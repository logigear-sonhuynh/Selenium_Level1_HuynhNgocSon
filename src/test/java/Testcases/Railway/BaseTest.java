package Testcases.Railway;

import Common.Constant;
import Common.Utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");

        System.setProperty("Webdriver.chorme.driver", Utilities.getWorkingPath());
        Constant.WEBDRIVER = new ChromeDriver();
    }

//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("Post-Condition");
//        Constant.WEBDRIVER.quit();
//    }
}
