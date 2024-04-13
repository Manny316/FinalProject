package test.folder.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.folder.page.config.TestBase;
import test.folder.page.config.WebDriverFactory;
import test.folder.page.config.business.object.KotsovolosBO;

public class KotsovolosTest extends TestBase {
    WebDriver driver;
    WebDriverWait wait;
    KotsovolosBO kotsovolosBO;


    @BeforeClass(alwaysRun = true)
    public void initEnv() {
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();
        kotsovolosBO = new KotsovolosBO();
    }

    @Test(alwaysRun = true, priority = 2)
    public void kotsovolosTest() throws InterruptedException {
        kotsovolosBO.searchIPhone13();
        kotsovolosBO.verifyProductNameBO();
        kotsovolosBO.verifyConnectionNetworkBO();
    }
}


