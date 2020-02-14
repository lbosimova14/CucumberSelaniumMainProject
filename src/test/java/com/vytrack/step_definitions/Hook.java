package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {


/*@Befor annotation is coming from Cucumber annotations
* Hook class is we can say unseen step, which allows us to perform our scenarios or tests
* Class must be in same package as step definition*/
    @Before//runs befor each cucumber scenario, it will always runs no matter if scenario passes or fails

    public void setup(){
        System.out.println("##############################");
        System.out.println("Test setup!");
//        Driver.get().manage().window().maximize();
    }
//Scenario Interface allows writing text and embedding media into reports, as well as inspecting results
    @After//i use Scenario as a parameter in my befor /after method
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            //taking a screenshot
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
           //adding the screenshot to the report
            scenario.embed(screenshot, "image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }
}
