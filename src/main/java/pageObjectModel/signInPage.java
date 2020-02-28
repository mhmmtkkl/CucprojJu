package pageObjectModel;

import utilities.Driver;
import utilities.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

    public class signInPage extends AbstractPage {

        public signInPage(){

            PageFactory.initElements(driver,this);

        }
    /*
        All the common actions here
                Click , sendkeys , wait , dropdown
     */

        private String username = ReadPropertiesFile.getData("Username");


        private String password = ReadPropertiesFile.getData("Password");


        @FindBy(xpath="//a[text()='Got it!']")
        private WebElement buttonGotIt;

        @FindBy(xpath="//input[@placeholder='Username']")
        private WebElement inputUsername;

        @FindBy(xpath="//input[@placeholder='Password']")
        private WebElement inputPassword;

        @FindBy(xpath="//button[@aria-label='LOGIN']")
        private WebElement buttonLogin;


        public void sendKeysInTheInputUserName(){
            sendKeysFunction(inputUsername ,ReadPropertiesFile.getData("Username"));

        }
        public void sendKeysInTheinputPassword(){
            sendKeysFunction(inputPassword ,ReadPropertiesFile.getData("Password"));

        }

        public void clickOnButtonLogin(){
            buttonLogin.click();
        }
        public void clickOnbuttonGotIt(){
            buttonGotIt.click();
        }

    }

