package tests;

import org.junit.Test;
import page.Popup_ScreenshotPage;
import utilities.ReusableMethods;


import java.io.IOException;

public class Popup_ScreenshotTest  {

    Popup_ScreenshotPage popup_screenshotPage=new Popup_ScreenshotPage();

    @Test
    public void popUp_ScreenShot() throws IOException {

        ReusableMethods.waitForVisibility(popup_screenshotPage.popup,5);
        ReusableMethods.getScreenshot("popup");
        popup_screenshotPage.closeButonu.click();
    }


}
