package DemoWebsite;

import BaseClass.OpenBrowser;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertiesFile.ReadPropertiesFile;


import java.io.File;
import java.io.IOException;

public class AT_01Login {

    @Test
    public static void LoginPage() throws IOException {
        OpenBrowser.NavigateHP(ReadPropertiesFile.PropFile("Guru99"));
    }
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://www.demo.guru99.com/V4/");
        public static void UsernamePassword(){
            OpenBrowser.driver.findElement(By.cssSelector("[name='uid']")).sendKeys("mngr541021");
            OpenBrowser.driver.findElement(By.cssSelector("[name='password']")).sendKeys("rYjEzaj");

        }
       //OpenBrowser.driver.findElement(By.cssSelector("[name='uid']")).sendKeys("mngr541021");
       //OpenBrowser.driver.findElement(By.cssSelector("[name='password']")).sendKeys("rYjEzaj");
       public static void LoginButton(){
        OpenBrowser.driver.findElement(By.cssSelector("[name='btnLogin']")).click();
    }
    public static void Screenshot() throws IOException {
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\capture-1.jpeg"));

    }
}

