package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeConstants;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;


public class AddTimeService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
      MobileActionManager.waitVisibility(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
      Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void addTime(){
        MobileActionManager.click(HomeConstants.HOME_BUTON_ADD_TIME);
    }

    public static void addHsMin(String hs,String min){
        //MobileActionManager.click(AddTimeConstants.NUMBER_PICKER_HS);
        MobileActionManager.setInput(AddTimeConstants.NUMBER_PICKER_HS,hs);
        //MobileActionManager.click(AddTimeConstants.NUMBER_PICKER_MINUTES);
        MobileActionManager.setInput(AddTimeConstants.NUMBER_PICKER_MINUTES,min);

    }

    public static void addProject(){
        MobileActionManager.click(AddTimeConstants.CHOICE_PROJECT_BUTON_MENU);
        MobileActionManager.click(AddTimeConstants.CHOICE_PROJECT);
    }

    public static void saveTime(){
        MobileActionManager.click((AddTimeConstants.SAVE_TIME_ENTRY));
    }
    public static void tapMenu(){
        MobileActionManager.click(HomeConstants.OPEN_NAVIGATION_DRAWER);
    }
    public static void tapTimeTrackerOption(){
        MobileActionManager.click(AddTimeConstants.SELECTION_TIME_TRACKER);
    }
    public static void timeAddedCorretly(){
        MobileActionManager.isPresent(AddTimeConstants.TIMES_ENTRIES_TEXT_TODAY);
    }
}
