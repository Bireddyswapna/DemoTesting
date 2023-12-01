package DemoWebsite;

import BaseClass.OpenBrowser;
import org.openqa.selenium.By;

public class AT_04VerifyLoginPageUsingExcel {
    public static void EnterLoginDetails(String Username, String Password, String ExpectedResult){
        OpenBrowser.driver.findElement(By.cssSelector("[name='uid']")).sendKeys("Username");
        OpenBrowser.driver.findElement(By.cssSelector("[name='password']")).sendKeys("Password");

    }

}
