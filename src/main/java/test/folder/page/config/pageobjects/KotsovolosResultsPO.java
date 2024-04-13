package test.folder.page.config.pageobjects;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

public class KotsovolosResultsPO {
    final String acceptCookies = "//a[contains(text(),'Αποδοχή Όλων')]";
    final String screenWidth  = "//h6[contains(text(),'Εύρος Οθόνης')]";
    final String inchSelection = "//span[contains(text(),'6 ίντσες και άνω')]";
    final String phoneModelSelection = "//p[contains(text(),'Apple iPhone 13 128GB Midnight Κινητό Smartphone')]";
    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public void cookiesBar(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(acceptCookies)));
        driver.findElement((By.xpath(acceptCookies))).click();

    }

    public void clickScreenWidth() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(screenWidth)));
        WebElement ele = driver.findElement(By.xpath(screenWidth));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
   }

   public void clickInchSelection(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inchSelection)));
        WebElement ele1 = driver.findElement(By.xpath(inchSelection));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele1);
   }

   public void clickPhoneModelSelection(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneModelSelection)));
       driver.findElement(By.xpath(phoneModelSelection)).click();
   }
}