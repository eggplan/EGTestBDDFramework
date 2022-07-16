package tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        //tags = "",
        features = "src/test/java/features/HomePage.feature",
        glue = "stepdefs"
)


public class NavTestRunner extends AbstractTestNGCucumberTests {

}
