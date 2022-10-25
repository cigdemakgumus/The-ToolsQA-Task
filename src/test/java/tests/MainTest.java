package tests;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;


public class MainTest {
    Logger log = (Logger) LogManager.getLogger(PracticeFormTest.class);
    @Test
    public void go_To_Url(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        log.info("anasayfaya gidildi");
        String expectedTitle="ToolsQA";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        log.info("anasayfaya giriş yapılabildiği doğrulandı");
    }
}
