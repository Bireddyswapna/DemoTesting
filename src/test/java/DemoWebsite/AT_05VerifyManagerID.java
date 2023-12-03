package DemoWebsite;

import BaseClass.OpenBrowser;
import org.junit.Assert;

public class AT_05VerifyManagerID {
    public static void VerifyID(){
        String PageText= OpenBrowser.driver.getPageSource();
        Assert.assertTrue(PageText.contains("mngr541021"));
        System.out.println("ManagerID is True");
    }

}
