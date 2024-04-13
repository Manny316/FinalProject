package test.folder.page.config.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

import static org.testng.Assert.assertEquals;

public class KotsovolosProductPO {
    final String phoneSpecs = "//span[contains(text(),'ΧΑΡΑΚΤΗΡΙΣΤΙΚΑ')]";
    final String productName = "//h5[contains(text(),'Apple iPhone 13 128GB Midnight Κινητό Smartphone')]";
    final String productNameValue = "Apple iPhone 13 128GB Midnight Κινητό Smartphone";
    final String connectionNetwork = "(//span[contains(text(),'5G')])[2]";
    final String connectionNetworkValue= "5G";
    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public void clickPhoneSpecs(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneSpecs)));
       driver.findElement(By.xpath(phoneSpecs)).click();
    }
    public String getProductName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productName)));
        return driver.findElement(By.xpath(productName)).getText();
    }
    public String getConnectionNetwork(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(connectionNetwork)));
        return driver.findElement(By.xpath(connectionNetwork)).getText();
    }

    public void verifyProductName(){
       assertEquals(getProductName(),productNameValue);
    }

    public void verifyConnectionNetWork(){
       assertEquals(getConnectionNetwork(),connectionNetworkValue);
    }

}
