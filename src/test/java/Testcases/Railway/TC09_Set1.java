package Testcases.Railway;

import Comman.Constant;
import PageObjects.Railway.ChangePasswordPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09_Set1 extends BaseTest{
    @Test(description = "User can change password")
    public void TC09(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage= new HomePage();
        homePage.open();

        System.out.println("2. Login with valid account");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on \"Change Password\" tab");
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        changePasswordPage.gotoChangePasswordPage();

        System.out.println("4. Enter valid value into all fields.");
        changePasswordPage.changepassword(Constant.CURRENT_PASSWORD,Constant.NEW_PASSWORD,Constant.CONFIRM_PASSWORD_CHANGE);

        String actualMsg=changePasswordPage.getChangePassword_success();
        String expectedMsg="Your password has been updated!";

        Assert.assertEquals(actualMsg,expectedMsg,"");
    }
}
