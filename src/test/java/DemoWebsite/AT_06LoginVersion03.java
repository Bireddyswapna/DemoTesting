package DemoWebsite;

import BaseClass.OpenBrowser;
import propertiesFile.ReadPropertiesFile;

import java.io.IOException;

public class AT_06LoginVersion03 {
    public static void LoginBankV3() throws IOException {
        OpenBrowser.NavigateHP(ReadPropertiesFile.PropFile("BankV3"));
    }
}
