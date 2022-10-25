package tests;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import page.Popup_ScreenshotPage;
import utilities.ReusableMethods;
import java.io.IOException;

public class Popup_ScreenshotTest  {

    Popup_ScreenshotPage popup_screenshotPage=new Popup_ScreenshotPage();
    Logger log = (Logger) LogManager.getLogger(Popup_ScreenshotTest.class);
    @Test
    public void popUp_ScreenShot() throws IOException {

        ReusableMethods.waitForVisibility(popup_screenshotPage.popup,5);
        log.info("pop-up bekletildi");
        ReusableMethods.getScreenshot("popup");
        log.info("ekran görüntüsü alındı");
    }


}
