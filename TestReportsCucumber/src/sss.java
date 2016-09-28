import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions
(features={"src/default package"},
format={"html:target/cucumber"})
public class sss {

}
