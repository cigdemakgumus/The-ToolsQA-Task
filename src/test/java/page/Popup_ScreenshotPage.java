package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Popup_ScreenshotPage {

    public Popup_ScreenshotPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='modal-content']")
    public WebElement popup;

    @FindBy(id ="closeLargeModal")
    public WebElement closeButonu;
}
