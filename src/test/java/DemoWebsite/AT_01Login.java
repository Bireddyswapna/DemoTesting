package DemoWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT_01Login {
    @Test
    public void LoginPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.cssSelector("[name='uid']")).sendKeys("mngr541021");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("rYjEzaj");
        driver.findElement(By.cssSelector("[name='btnLogin']")).click();
    }
}

