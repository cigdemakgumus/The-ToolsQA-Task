package tests;

import org.junit.Assert;
import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class MainTest {

    @Test
    public void go_To_Url(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String expectedTitle="ToolsQA";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
