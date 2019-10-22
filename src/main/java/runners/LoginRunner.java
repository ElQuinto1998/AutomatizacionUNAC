package runners;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectFeatures", glue = "stepDefinitions")
public class LoginRunner {

}
