package com.autumfair.demo.testsuit;

import com.autumfair.demo.pages.RegistrationPage;
import com.autumfair.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by JANVI on 22/10/2019.
 */
public class RegistrationTest extends TestBase{

    RegistrationPage registrationPage= new RegistrationPage();
    @Test
    public void uesrShouldAbleToRegisterSuccessfully() {


        registrationPage.navigateToApplyForAStand();
        registrationPage.enterFirstName();
        registrationPage.enterSurName();
        registrationPage.enterEmailAdd();
       // registrationPage.enterPhoneNumber();
        registrationPage.enterCompanyName();
        registrationPage.enterJobTitle();
        registrationPage.selectJobFunctionFromDropDown();
        registrationPage.selectCountryNameFromDropDown();
        registrationPage.selectIndustryFromDropDown();
        registrationPage.selectIndustryFromDropDown();
        registrationPage.selectSectorFromDropDown();
        registrationPage.selectSubSectorFromDropDown();
        registrationPage.clickOnSubmit();
    }


}
