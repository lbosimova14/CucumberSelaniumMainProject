package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CreateACarStepDefinitions {
    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {
        System.out.println("User clicked on "+string+" button");
    }

    @Then("user adds new car information:")
    public void user_adds_new_car_information(List<String> dataTable) {
        System.out.println(dataTable);

    }
}
