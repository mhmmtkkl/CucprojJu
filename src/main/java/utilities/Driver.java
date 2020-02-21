package utilities;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;

public class Driver {
      /*
        Why we need to use one driver (singleton pattern )
            Because we are using page object model and we need to switch between the pages
       without singleton pattern it will throw null pointer exception
     */

    private static WebDriver driver = null;
    public static final String Access_KEY="25a46fac-4b55-4848-8357-164e2bf4c309";
    public static final String userName="technostudyy";
    public static final String SaurceLabURL = "https://" + userName +":" + Access_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    public static WebDriver getDriver()  {

        if(ReadPropertiesFile.getData("Environment").equals("local")) {
            if (driver == null) {
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            }
        }else if(ReadPropertiesFile.getData("Environment").equals("saurceLab")){

            DesiredCapabilities capabilities = new DesiredCapabilities();

                capabilities.setCapability("browserName" , ReadPropertiesFile.getData("browser"));
                capabilities.setCapability("version" , ReadPropertiesFile.getData("version"));
                capabilities.setCapability("platformName" , ReadPropertiesFile.getData("platform"));

                try{
                    driver = new RemoteWebDriver(new URL(SaurceLabURL), capabilities);
                }catch(Exception e ){
                    System.out.println("not able to find url");
                }


        }

        return driver;
    }

    public static void closeDriver(){

        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
