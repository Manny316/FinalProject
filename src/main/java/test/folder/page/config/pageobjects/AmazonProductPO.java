package test.folder.page.config.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;
import static org.testng.Assert.assertEquals;

public class AmazonProductPO {
    final String screenSize = "//tr[@class='a-spacing-small po-display.size']";
    final String screenSizeValue = "Screen Size 65 Inches";
    final String brandName = "//tr[@class='a-spacing-small po-brand']";
    final String brandNameValue = "Brand LG";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public String getScreenSize(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(screenSize)));
        return driver.findElement(By.xpath(screenSize)).getText();
    }

    public String getBrandName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(brandName)));
        return driver.findElement(By.xpath(brandName)).getText();
    }

    public void verifyScreenSize(){
        assertEquals (getScreenSize(),(screenSizeValue));
    }

    public void verifyBrandName(){
        assertEquals (getBrandName(),(brandNameValue));
    }

}
