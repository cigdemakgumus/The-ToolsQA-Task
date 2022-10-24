package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToolsPage {
    public ToolsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
