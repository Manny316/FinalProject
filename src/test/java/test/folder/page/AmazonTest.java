package test.folder.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.folder.page.config.TestBase;
import test.folder.page.config.WebDriverFactory;
import test.folder.page.config.business.object.AmazonBO;

public class AmazonTest extends TestBase {
    WebDriver driver;
    WebDriverWait wait;
    AmazonBO amazonBO;

    @BeforeClass(alwaysRun = true)
    public void initEnv() {
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();
        amazonBO = new AmazonBO();
    }

    @Test(alwaysRun = true, priority = 1)
    public void amazonTest() {
        amazonBO.searchAndChooseThirdProduct();
        amazonBO.verifyScreenSizeBO();
        amazonBO.verifyBrandNameBO();
    }
}
