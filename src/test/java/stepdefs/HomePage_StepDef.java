package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utils.BasePage;

import java.io.IOException;

public class HomePage_StepDef {
    public static WebDriver driver;
    public static WebDriverWait wait;
    BasePage Base = new BasePage();
    HomePage Home = new HomePage();


    @Given("^Browser is opened$")
    public void openBrowser() throws InterruptedException {
        BasePage.openBrowser();
    }

    @When("^\"([^\"]*)\" is entered on the browser$")
    public void typeDellPage(String Url) throws InterruptedException {
        System.out.println("Url is " + Url);
        BasePage.goToUrl(Url);
    }

    @Then("^Dell NZ homepage is shown$")
    public void isDellHomePage() throws InterruptedException {
        Boolean logo  = Home.checkLogo();
        System.out.println("Logo is present = " + logo);
        Boolean searchInput = Home.checkSearchInput();
        System.out.println("Search Input is present = " + searchInput);
        Boolean banner = Home.checkBanner();
        System.out.println("Banner is present = " + banner);
        BasePage.CloseDell();
    }

    @And("^User navigates to view all laptops$")
    public void navigateViewAllLaptops() {
        Home.goToMenu();
    }

    @Then("^All laptops are shown$")
    public void allLaptopsAreShown() throws InterruptedException {
        Boolean allLaptops = Home.checkAllLaptops();
        System.out.println("View All Laptops is present = " + allLaptops);
        String a = Home.getL1MenuText();
        System.out.println("Menu L1 = " + a);
        String b = Home.getL2MenuText();
        System.out.println("Menu L2 = " + b);
        BasePage.CloseDell();

    }
}
