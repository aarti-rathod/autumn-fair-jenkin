package com.autumfair.demo.browserselector;

import com.autumfair.demo.basepage.BasePage;
import com.autumfair.demo.loadproperty.LoadProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by JANVI on 22/10/2019.
 */
public class BrowserSelector extends BasePage{               //class exteneded

    String baseUrl=new LoadProperty().getProperty("baseUrl");
    String path=System.getProperty("user.dir");

    public void selectBrowser(String browser){


        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Inside If MEthods .....");
            /*
            *set up till open browser
             */

            //C:\Users\JANVI\IdeaProjects\autumfair-registration\driver\chromedriver.exe
            System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",path+"\\driver\\geckodriver.exe");

            driver=new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();                                 //Window maximize
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);      //Wait till 10 Sec

        }else if(browser.equalsIgnoreCase("ie")){

            //C:\Users\JANVI\IdeaProjects\autumfair-registration\driver\IEDriverServer.exe
            System.setProperty("webdriver.ie.driver",path+"\\driver\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }else{
            System.out.println("Browser Not Found");


        }
    }




    public void selectBrowsers(String chrome) {
   }
}
