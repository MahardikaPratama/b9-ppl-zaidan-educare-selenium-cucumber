import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
    tags = "", 
    features = "src/test/resources/features/LoginPage.feature", 
    glue = "com.zaiidan.testng.definitions",
    plugin= {"pretty", "html:test-output","json:target/cucumber/cucumber.json", "html:target/cucumber-html-report"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {}
