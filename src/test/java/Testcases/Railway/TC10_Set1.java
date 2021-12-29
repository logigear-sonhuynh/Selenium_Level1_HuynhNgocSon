package Testcases.Railway;

import Comman.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10_Set1 extends BaseTest{
    @Test(description ="User can't create account with \"Confirm password\" is not the same with \"Password\"")
        public void TC10(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Register\" tab");
        homePage.gotoRegisterPage();

        System.out.println("3. Enter valid information into all fields except \"Confirm password\" is not the same with \"Password");
        RegisterPage registerPage = new RegisterPage();
        registerPage.register(Constant.USERNAME3,Constant.PASSWORD3,Constant.CONFIRM_PASSWORD3,Constant.PID);

        String actualMsg=registerPage.getRegisterErrorMsg();
        String expectedMsg="There are errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg,expectedMsg,"");
    }

}
