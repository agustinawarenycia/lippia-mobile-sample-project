package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.SettingsConstants;
import org.testng.Assert;


public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.HOME_TEXT_TOOL_BAR_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.HOME_BUTON_ADD_TIME), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void settingsMode() {

        MobileActionManager.click(HomeConstants.TOOL_BAR_SETTINGS_OPTION);
    }

    public static void logOut() {
        MobileActionManager.click(HomeConstants.OPEN_NAVIGATION_DRAWER);
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
        MobileActionManager.click(HomeConstants.CONFIRM_SIGN_OUT_BUTON);
    }

    public static void changeDarkTheme() {
        MobileActionManager.click(SettingsConstants.SETTINGS_DARK_MODE_BUTON);


    }

    public static String darkModeStatus() {

        String result = MobileActionManager.getText(SettingsConstants.SETTINGS_DARK_MODE_BUTON);
        return result;
    }

}
