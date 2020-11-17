package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",//any failing tests stored in .txt
        glue = "com/vytrack/step_definitions",
        plugin = {
                "html:target/rerun-default-cucumber-reports",
        }
)
public class FailedRunner {
}
