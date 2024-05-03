package RUNNERCLASSES;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\for_selenium\\BDD_CUCUMBER\\src\\test\\resources\\FeatureFile\\Google.feature",glue="STEPDEF")

public class GoogleRunner {

}
