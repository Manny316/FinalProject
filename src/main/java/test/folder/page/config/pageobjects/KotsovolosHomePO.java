package test.folder.page.config.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

public class KotsovolosHomePO {
    final String acceptCookies = "//a[contains(text(),'Αποδοχή Όλων')]";
    final String searchBarInput = "//input[@id='searchTermSN']";
    final String searchProduct = "iphone13";
    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public void cookiesBar() throws InterruptedException {
        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(acceptCookies)));
        driver.findElement((By.xpath(acceptCookies))).click();
    }

    public void setSearchBarInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchBarInput)));
        driver.findElement(By.xpath(searchBarInput)).sendKeys(searchProduct);
        driver.findElement(By.xpath(searchBarInput)).sendKeys(Keys.ENTER);
    }
}
