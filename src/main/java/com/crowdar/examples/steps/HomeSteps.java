package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.SettingsConstants;
import com.crowdar.examples.services.AddTimeService;
import com.crowdar.examples.services.HomeService;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;


public class HomeSteps extends PageSteps {
//Este es para ver si estoy en el login de la app
    @Then("Home page is correct")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }


    @Then("The user log out of the app")
    public void doSignOut() {
        HomeService.logOut();


    }

    @When("the user go to menu")
    public void theUserGoToMenu() {
        AddTimeService.tapMenu();

    }

    @And("change to dark mode")
    public void changeToDarkTheme() {
        HomeService.settingsMode();
        HomeService.changeDarkTheme();
    }

    @io.cucumber.java.en.Then("confirm dark mode is enabled")
    public void confirmDarkModeIsEnabled() {
        HomeService.darkModeStatus();

    }
}
