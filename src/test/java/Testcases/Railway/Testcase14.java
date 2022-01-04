package Testcases.Railway;

import Comman.Constant;
import PageObjects.Railway.BookTicketPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase14 extends BaseTest{
    @Test(description = "User can book many tickets at a time")
    public void TC14(){
        System.out.println("Pre-condition: Create and activate a new account");
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Login with a valid account ");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on Book ticket tab");
        BookTicketPage bookTicketPage = new BookTicketPage();
        bookTicketPage.gotoBookTicketPage();

        System.out.println("4. Select a Depart date from the list");

        System.out.println("5. Select Nha Trang for Depart from and Sài Gòn for Arrive at");

        System.out.println("6. Select Soft seat with air conditioner for Seat type");

        System.out.println("7. Select 5 for Ticket amount");
        bookTicketPage.getBtn_BookTicket();

        String actualMsg = bookTicketPage.getBookTicket_successfully();
        String expectedMsg = Constant.BookTicket_successfully;

        Assert.assertEquals(actualMsg,expectedMsg,"Message Ticket booked successfully! not displays");
    }
}
