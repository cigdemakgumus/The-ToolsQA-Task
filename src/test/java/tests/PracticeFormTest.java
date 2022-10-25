package tests;

import com.github.javafaker.Faker;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.PracticeFormPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PracticeFormTest {

    PracticeFormPage practiceFormPage=new PracticeFormPage();

    @Test
    public void set_To_PracticeForm() throws InterruptedException {
        String csvFile_Path="C:\\Users\\zehra\\IdeaProjects\\NTTDataProject\\TestData.csv";
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
                    String name=cell[i];
                    String lastname=cell[i+1];
                    String mail=cell[i+2];
                    String adres=cell[i+3];
                    practiceFormPage.firstname.sendKeys(name);
                    practiceFormPage.lastname.sendKeys(lastname);
                    practiceFormPage.mail.sendKeys(mail);
                    practiceFormPage.adres.sendKeys(adres);
                }
                            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }




    }
}
