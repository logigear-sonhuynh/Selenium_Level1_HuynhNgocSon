package PageObjects.Railway;

import Comman.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage extends GeneralPage{
    //Locator
    public final By titleBookticket = By.xpath("//form[@method=\"post\"]//legend");

    //Elements

    public WebElement getTitleBookticket(){
        return Constant.WEBDRIVER.findElement(titleBookticket);
    }
    //Methods

    public String getBookticket(){
        return this.getTitleBookticket().getText();
    }
}
