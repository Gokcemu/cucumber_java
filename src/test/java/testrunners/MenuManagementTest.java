package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/testbase/features"},
        glue = {"stepdefinitions.MenuManagementSteps"},
        plugin = {"pretty"} )
public class MenuManagementTest {
}
