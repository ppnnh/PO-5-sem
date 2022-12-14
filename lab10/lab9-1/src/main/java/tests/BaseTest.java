package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected Page mainPage;

    @BeforeMethod
    public void setDriver(){
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPage = new Page(driver);
    }

    @AfterMethod (alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }

}
