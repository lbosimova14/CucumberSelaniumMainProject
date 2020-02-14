package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@driver",
        plugin = {"html:target/default-cucumber-reports",//place where to save the reports
                "json:target/cucumber.json",//it is cucumber plugin used for reporting purpose
                "rerun:target/rerun.txt"//it will run only failed tests
        }
)
public class CucumberRunner {

}
