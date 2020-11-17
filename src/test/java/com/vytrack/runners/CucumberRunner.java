package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//RunWith is Junit annotation used for kick off/trigger Runner.classes, it connects with Junit and Cucumber
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = {"@calendar_events"},
        //html is type of report, target is location of report,storing place, default-cucumber-report
        // is folder name,
        plugin = {"html:target/default-html-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {
//C:\Users\laylo\IdeaProjects\CucumberSelaniumMainProject\pom.xml
}
