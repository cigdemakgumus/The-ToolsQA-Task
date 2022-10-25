package tests;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.PracticeFormPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.FileReader;
import java.io.IOException;


public class PracticeFormTest {

    PracticeFormPage practiceFormPage=new PracticeFormPage();
    Actions actions=new Actions(Driver.getDriver());
    Logger log = (Logger) LogManager.getLogger(PracticeFormTest.class);

    @Test
    public void set_To_PracticeForm() throws InterruptedException {
        String name="";
        String lastname="";
        String mail="";
        String adres="";
        String csvFile_Path="TestData.csv";
        ReusableMethods.jseClick(practiceFormPage.formsButonu);
        practiceFormPage.practiceFormsButonu.click();
        Thread.sleep(3000);
        practiceFormPage.firstname.click();

        CSVReader reader=null;
        try{
            reader=new CSVReader(new FileReader(csvFile_Path));
            String[] cell;
            while ((cell= reader.readNext())!=null){
                for (int i = 0; i < 1; i++) {
                    name=cell[i];
                    lastname=cell[i+1];
                     mail=cell[i+2];
                     adres=cell[i+3];
                }
                            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
        practiceFormPage.firstname.sendKeys(name);
        log.info("name alanı dolduruldu");
        practiceFormPage.lastname.sendKeys(lastname);
        log.info("lastname alanı dolduruldu");
        practiceFormPage.mail.sendKeys(mail);
        log.info("mail alanı dolduruldu");
        ReusableMethods.jseClick(practiceFormPage.femaleRadioButonu);
        log.info("female radio butonu tıklandı");
        practiceFormPage.mobilNumber.sendKeys("5469605458");
        log.info("mobil alanı dolduruldu");
        practiceFormPage.tarih.click();
        log.info("tarih dropdownu tıklandı");
        Select select=new Select(practiceFormPage.ddm_ay);
        select.selectByValue("2");
        log.info("ay bilgisi seçildi ");
        Select select2=new Select(practiceFormPage.ddm_yil);
        select2.selectByVisibleText("2003");
        log.info("yıl bilgisi seçildi ");
        practiceFormPage.gunSec.click();
        log.info("gun bilgisi seçildi ");
        ReusableMethods.jseClick(practiceFormPage.sportsRadioButonu);
        log.info("sport radio butonu tıklandı");
        String filePath= "C:\\Users\\zehra\\IdeaProjects\\NTTDataProject\\src\\test\\resources\\img.png";
        log.info("dosya yolu tanımlandı ");
        practiceFormPage.selectFile.sendKeys(filePath);
        log.info("dosya seç butonuna tıklandı");
        practiceFormPage.adres.sendKeys(adres);
        log.info("adres bilgisi dolduruldu");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        log.info("ulke ve sehir secildikten sonra submit butonuna tıklandı");




    }

}
