package NPO.Test;

import NPO.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToFavourites {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Add to favourites")
    public void Favourites() throws InterruptedException {
        driver.get("https://evroset.by/product/smartfon-apple-iphone-14-pro-max-1tb-kosmiceskij-cernyj");
        logger.info("Open product page");


        Thread.sleep(5000);
        WebElement favourite = driver.findElement(By.xpath("//div[@class='fc_i_outer']"));
        favourite.click();
        logger.info("press heart button");
        Thread.sleep(5000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
