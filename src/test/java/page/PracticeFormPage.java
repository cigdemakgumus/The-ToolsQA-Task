package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='card-body'])[2]")
    public WebElement formsButonu;

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormsButonu;

   @FindBy (id = "firstName")
   public WebElement firstname;

    @FindBy(id ="lastName")
    public WebElement lastname;

    @FindBy(id ="userEmail")
    public WebElement mail;

    @FindBy(id ="gender-radio-2")
    public WebElement femaleRadioButonu;

    @FindBy(id ="userNumber")
    public WebElement mobilNumber;

    @FindBy(id ="dateOfBirthInput")
    public WebElement tarih;

    @FindBy(xpath = "(//div[text()='2'])[1]")
    public WebElement tarihSec;

    @FindBy(id ="hobbies-checkbox-1")
    public WebElement sportsRadioButonu;

    @FindBy(id ="state")
    public WebElement state;

    @FindBy(id ="city")
    public WebElement city;
    @FindBy(xpath ="(//div[@class=' css-1wy0on6'])[1]")
    public WebElement selectStateButonu;

    @FindBy(xpath ="(//div[@class=' css-tlfecz-indicatorContainer'])[2]")
    public WebElement selectCityButonu;

    @FindBy(id ="currentAddress")
    public WebElement adres;


    @FindBy(id ="submit")
    public WebElement submitButonu;


}
