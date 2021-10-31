package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;


public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
      MobileActionManager.waitVisibility(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
      Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
