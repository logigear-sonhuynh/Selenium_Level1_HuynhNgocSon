package Testcases.Railway;

import Comman.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.MyticketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_Set1 extends BaseTest {
    @Test(description = "Additional pages display once user logged in")
    public void TC05() {
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Login\" tab");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();

        System.out.println("3. Login with valid account");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        MyticketPage myticketPage = new MyticketPage();
        String actualMsg = String.valueOf(myticketPage.gotoMyticketPage());
        String expected = "My ticket,Change password and Logout tabs are displayed";

        Assert.assertEquals(actualMsg, expected, "");
    }
}
