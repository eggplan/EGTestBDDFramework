package tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import utils.BasePage;

import java.io.IOException;


@CucumberOptions(
        //tags = "",
        features = "src/test/java/features/HomePage.feature",
        glue = "stepdefs"
)


public class NavTestRunner extends AbstractTestNGCucumberTests {

//public NavTestRunner() throws IOException {
//        Process path  = Runtime.getRuntime().exec( "cmd /c start cmd.exe /K C:\\Tools\\allure-2.18.1\\bin");
//        Process report  = Runtime.getRuntime().exec( "cmd /c start cmd.exe /K C:\\Tools\\allure-2.18.1\\bin\\allure serve C:\\Users\\eg.plan\\Documents\\GitHub\\EGTestBDDFramework\\allure-results");
//    }

}


//allure bin path
//C:\Tools\allure-2.18.1>

//Allure results folder path
//C:\Users\eg.plan\Documents\GitHub\EGTestBDDFramework\allure-results

//command
//allure serve <folder-path>