package tests;
import org.junit.Test;
import java.io.IOException;

public class AllTest {
   MainTest mainTest=new MainTest();
   Popup_ScreenshotTest popup_screenshotTest=new Popup_ScreenshotTest();
   PracticeFormTest practiceFormTest=new PracticeFormTest();

   @Test
    public void test1() throws IOException, InterruptedException {
       mainTest.go_To_Url();
       practiceFormTest.set_To_PracticeForm();
       popup_screenshotTest.popUp_ScreenShot();

   }

}
