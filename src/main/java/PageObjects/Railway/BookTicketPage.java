package PageObjects.Railway;

import Comman.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BookTicketPage extends GeneralPage{
    //Locator
    public final By titleBookTicket = By.xpath("//form[@method=\"post\"]//legend");
    public final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    public final By lblBookTicket_successfully = By.xpath("//h1[@align='center']");
    public final By dbl_date = By.xpath("//select[@name='Date']");
    public final By dbl_DepartStation = By.xpath("//select[@name='DepartStation']");
    public final By dbl_ArriveStation= By.xpath("//select[@name='ArriveStation']");
    public final By dbl_Seat_Type = By.xpath("//select[@name='SeatType']");
    public final By dbl_Ticket_Amount = By.xpath("//select[@name='TicketAmount']");
    public final By slt_Book_10_Ticket = By.xpath("//select[@name='TicketAmount']//option[@value='4']");
    public final By slt_Book_1_Ticket = By.xpath("//select[@name='TicketAmount']//option[@value='1']");
    public final By Error_BookTicket= By.xpath("//p[@class='message error']");
    public final By Error_TicKetAmount = By.xpath("//label[@class='validation-error']");
    //Elements

    public WebElement getTitleBookTicket(){
        return Constant.WEBDRIVER.findElement(titleBookTicket);
    }
    public WebElement getBtnBookTicket(){
        return Constant.WEBDRIVER.findElement(btnBookTicket);
    }
    public WebElement getLblBookTicket_successfully(){
        return Constant.WEBDRIVER.findElement(lblBookTicket_successfully);
    }
    public WebElement getDbl_date(){
        return Constant.WEBDRIVER.findElement(dbl_date);
    }
    public WebElement getDbl_DepartStation(){
        return Constant.WEBDRIVER.findElement(dbl_DepartStation);
    }
    public WebElement getDbl_ArriveStation(){
        return Constant.WEBDRIVER.findElement(dbl_ArriveStation);
    }
    public WebElement getDbl_Seat_Type(){
        return Constant.WEBDRIVER.findElement(dbl_Seat_Type);
    }
    public WebElement getDbl_Ticket_Amount(){
        return Constant.WEBDRIVER.findElement(dbl_Ticket_Amount);
    }
    public WebElement getSlt_Book_10_Ticket(){
        return Constant.WEBDRIVER.findElement(slt_Book_10_Ticket);
    }
    public WebElement getSlt_Book_1_Ticket(){
        return Constant.WEBDRIVER.findElement(slt_Book_1_Ticket);
    }
    public WebElement getError_BookTicket(){
        return Constant.WEBDRIVER.findElement(Error_BookTicket);
    }
    public WebElement getError_TicKetAmount(){
        return Constant.WEBDRIVER.findElement(Error_TicKetAmount);
    }
    //Methods

    public String getBookTicket(){
        return this.getTitleBookTicket().getText();
    }
    public BookTicketPage getBtn_BookTicket(){
        this.getBtnBookTicket().submit();
        return new BookTicketPage();
    }
    public String getBookTicket_successfully(){
        return this.getLblBookTicket_successfully().getText();
    }
    public String get_Date(){
        return this.getDbl_date().getText();
    }
    public String get_DepartStation(){
        return this.getDbl_DepartStation().getText();
    }
    public String get_ArriveStation(){
        return this.getDbl_ArriveStation().getText();
    }
    public String get_Seat_Type(){
        return this.getDbl_Seat_Type().getText();
    }
    public String get_Ticket_Amount(){
        return this.getDbl_Ticket_Amount().getText();
    }
    public void getBook_10_Ticket(){
         this.getSlt_Book_10_Ticket().click();
    }
    public void getBook_1_Ticket(){
        this.getSlt_Book_1_Ticket().click();
    }
    public String getError_BookTicket_1(){
        return this.getError_BookTicket().getText();
    }
    public String getError_TicKetAmount_1(){
        return this.getError_TicKetAmount().getText();
    }
}
