package DemoWebsite;

import BaseClass.OpenBrowser;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AT_02NewCustomer {
    @Test
    public static void AddNewCustomer() throws IOException {
        AT_01Login.LoginPage();
        OpenBrowser.driver.findElement(By.cssSelector("[href='addcustomerpage.php']")).click();
        OpenBrowser.driver.findElement(By.cssSelector("[name='name']")).sendKeys("Software");
        WebElement radioBtn=OpenBrowser.driver.findElement(By.cssSelector("[value='f']"));
        radioBtn.click();
        WebElement DateOfBirth=OpenBrowser.driver.findElement(By.cssSelector("#dob"));
        DateOfBirth.sendKeys("26/10/1986");
        OpenBrowser.driver.findElement(By.cssSelector("[name='addr']")).sendKeys("GUthrie way Truganina");
        OpenBrowser.driver.findElement(By.cssSelector("[name='city']")).sendKeys("Melbourne");
        OpenBrowser.driver.findElement(By.cssSelector("[name='state']")).sendKeys("Victoria");
        OpenBrowser.driver.findElement(By.cssSelector("[name='pinno']")).sendKeys("123029");
        OpenBrowser.driver.findElement(By.cssSelector("[name='telephoneno']")).sendKeys("123456789");
        OpenBrowser.driver.findElement(By.cssSelector("[name='emailid']")).sendKeys("sj@gmail.com");
        OpenBrowser.driver.findElement(By.cssSelector("[name='password']")).sendKeys("testing");
        OpenBrowser.driver.findElement(By.cssSelector("[name='sub']")).click();

        //OpenBrowser.QuitDriver();
    }
}
