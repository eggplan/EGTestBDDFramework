package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public static WebDriver driver;

    public static void openBrowser() throws InterruptedException {
        // Open browser
        String exePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        Thread.sleep(2000);
    }

    public static void goToUrl(String Url) throws InterruptedException {
        driver.get("https://www.dell.com/en-nz/shop");
        Thread.sleep(5000);
    }

    public boolean elementExists(String locator){
        return !driver.findElements(By.xpath(locator)).isEmpty();
    }

    public void hover(String locator){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(locator));
        action.moveToElement(element).perform();
    }

    public void hoverClick(String locator) {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(locator));
        action.moveToElement(element).perform();
        action.moveToElement(element).click().perform();
    }

    public String getText(String locator){
        //Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(locator));
        String text = element.getText();
        return text;
    }

    public static void CloseDell() {
        // Login to Dell
        driver.close();
    }

}

