package com.autumfair.demo.pages;

import com.autumfair.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by JANVI on 22/10/2019.
 */
public class RegistrationPage extends Util {

    public void navigateToApplyForAStand(){
        clickOnElement(By.xpath("//a[@class='ck-button-one']"));

    }
    public void enterFirstName(){

        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Aakash");


    }
    public void enterSurName(){
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Mehta");

    }
    public  void enterEmailAdd(){
        sendTextToElement(By.xpath("//input[@id='Email']"),"aakash12@gmail.com");
    }
    //public void enterPhoneNumber(){
      //  sendNumberToTheElement(By.xpath("//div[@class='selected-flag']"),"+447879765456");
    //}
    public void enterCompanyName(){
        sendTextToElement(By.xpath("//input[@id='Company']"),"Prime Testing");

    }
    public void enterJobTitle(){
        sendTextToElement(By.xpath("//input[@id='Title']"),"Manager");
    }
    public void selectJobFunctionFromDropDown() {
        /*
        * public void selectByValueFromDropDown(By by, String value) {
       * Select select = new Select(driver.findElement(by));
      * select.selectByValue(value);
      */
        Select select=new Select (driver.findElement(By.xpath("//select[@id='apuk_jobfunction']")));
        select.selectByValue("Technical");


    }

    public void selectCountryNameFromDropDown(){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='apuk_countryos']")));
        select.selectByValue("United Kingdom");

    }
    public void selectIndustryFromDropDown(){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='apuk_industry']")));
        select.selectByValue("Fashion");

    }
    public void selectSectorFromDropDown(){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='apuk_sector']")));
        select.selectByValue("Accessories");
    }
    public void selectSubSectorFromDropDown(){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='apuk_subsector']")));
        select.selectByValue("Jwellery Designer");
    }
    public void clickOnSubmit(){
        clickOnElement(By.xpath("//button[@class='mktoButton']"));
    }

}
