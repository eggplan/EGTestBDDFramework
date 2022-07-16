package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        OpenDell();

        SignInDell();


        //driver.findElement(By.xpath("//li[@data-testid='mh_t1_1_t2_2_t3_1_View All Laptops']")).click();
        //Thread.sleep(3000);


    }


    public static void OpenDell() throws InterruptedException {
        // Open browser & go to Dell Homepage
        String exePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.dell.com/en-nz/shop");
        Thread.sleep(2000);

    }


    public static void SignInDell() throws InterruptedException {
        // Login to Dell
        driver.findElement(By.id("signin-button")).click();
        driver.findElement(By.xpath("//a[@data-testid='mastheadLogin']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("EmailAddress")).sendKeys("eggplan@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("EGDell1234");
        Thread.sleep(2000);

        driver.findElement(By.id("sign-in-button")).click();
        Thread.sleep(2000);

    }


}

