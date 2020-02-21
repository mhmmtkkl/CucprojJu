package stepDefinition;




import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadPropertiesFile;
import utilities.writeInExcel;


import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hooks {

    /*
        Before and after class methods will be in this class
     */

    private WebDriver driver = null;


    @Before
    public void beforeMethod(){
        driver= Driver.getDriver();
        driver.get(ReadPropertiesFile.getData("URL"));
        driver.manage().window().maximize();

    }

    //  screen shot next class
    @After
    public void afterClass(Scenario scenario){

        if(scenario.isFailed()){

            TakesScreenshot ScreenShot = ((TakesScreenshot)driver);

            File  srcFile = ScreenShot.getScreenshotAs( OutputType.FILE );

            String featureFileName = scenario.getId();

            System.out.println(featureFileName+"<------------");

            Date now = new Date(  );

            System.out.println(now + "<---------    now ");

            SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

            String dateinString = formatter.format( now );

            dateinString = dateinString.replace( ":" ,"," );

            File destinationFile = new File("target/screenShots/"+featureFileName+dateinString+".png");

            try {
                FileUtils.copyFile( srcFile, destinationFile );
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }

        writeInExcel.excelWriteResults("results", "Sheet1",scenario);


        Driver.closeDriver();
    }

}