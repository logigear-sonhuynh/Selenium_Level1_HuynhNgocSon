package PageObjects.Railway;

import Comman.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Timetable extends GeneralPage{
    //Locator
    public final By lnk_CheckPrice_DN_SG = By.xpath("//a[@href='TicketPricePage.cshtml?id1=4&id2=1']");
    public final By Title_CheckPrice_DN_SG = By.xpath("//tr[@class='TableSmallHeader']//th[@colspan='7']");

    //Element
    public WebElement getLnkCheckPrice_DN_SG(){
        return Constant.WEBDRIVER.findElement(lnk_CheckPrice_DN_SG);
    }
    public WebElement getLblCheckPrice_DN_SG(){
        return Constant.WEBDRIVER.findElement(Title_CheckPrice_DN_SG);
    }
    //Methods
    public void Check_Link_DN_SG(){
        this.getLnkCheckPrice_DN_SG().sendKeys(Keys.ENTER);
    }
    public String Title_DN_SG(){
        return this.getLblCheckPrice_DN_SG().getText();
    }
}
