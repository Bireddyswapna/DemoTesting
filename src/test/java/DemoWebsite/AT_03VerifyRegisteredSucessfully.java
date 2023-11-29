package DemoWebsite;

import BaseClass.OpenBrowser;
import org.junit.Assert;
import org.junit.Test;
import propertiesFile.ReadPropertiesFile;

import java.io.IOException;


public class AT_03VerifyRegisteredSucessfully {
    @Test
    public void RegistrationPage() throws IOException {
       // AT_02NewCustomer.AddNewCustomer();
        OpenBrowser.NavigateHP(ReadPropertiesFile.PropFile("RegistrationPage"));
        String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle ="+ActualTitle);
//        String ExpectedTitle= "Guru99 Bank Customer Registration Page";
//        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion version-2
        Assert.assertTrue(ActualTitle.contains("Registration"));



    }
}
