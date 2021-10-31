package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.AddTimeService;

import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddTimeSteps extends PageSteps {


    @And("confirm new entry is added correctly")
    public void confirmNewEntryIsAddedCorrectly() {
        AddTimeService.timeAddedCorretly();
        Assert.assertEquals(AddTimeService.timeAddedCorretly(), "Automation");
    }


    @When("the user track his work hour and minutes, select project and confirm")
    public void theUserTrackHisWorkHourAndMinutesMinutesSelectProjectAndConfirm() {
        AddTimeService.tapMenu();
        AddTimeService.tapTimeTrackerOption();
        AddTimeService.addTime();
        AddTimeService.addHsMin();
        AddTimeService.addProject();
        AddTimeService.saveTime();
    }
}
