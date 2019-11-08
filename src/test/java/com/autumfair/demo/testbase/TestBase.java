package com.autumfair.demo.testbase;

import com.autumfair.demo.basepage.BasePage;
import com.autumfair.demo.browserselector.BrowserSelector;
import com.autumfair.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by JANVI on 22/10/2019.
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String browser=new LoadProperty().getProperty("browser");


    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }


    @AfterMethod
    public void tearUp(){
//    driver.close();


    }

}
