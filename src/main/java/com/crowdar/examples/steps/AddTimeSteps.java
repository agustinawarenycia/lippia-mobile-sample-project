package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.AddTimeService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AddTimeSteps extends PageSteps {


    @Then("confirm new entry is added correctly")
    public void confirmNewEntryIsAddedCorrectly() {
        AddTimeService.timeAddedCorretly();
    }


    @When("the user track his work (.*) and minutes (.*), select project and confirm")
    public void theUserTrackHisWorkHourAndMinutesMinutesSelectProjectAndConfirm(String hs, String min) {
        AddTimeService.tapMenu();
        AddTimeService.tapTimeTrackerOption();
        AddTimeService.addTime();
        AddTimeService.addHsMin(hs, min);
        AddTimeService.addProject();
        AddTimeService.saveTime();
    }
}
