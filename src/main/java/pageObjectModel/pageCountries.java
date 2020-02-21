package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class pageCountries extends AbstractPage {


    public pageCountries(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement countryInputName;


    @FindAll({
            @FindBy(xpath="//span[@class='mat-option-text']")
    }  )
    private List<WebElement> listOfcity;

    @FindBy(xpath="//mat-dialog-container//mat-select//span")
    private WebElement frameDropdown;

    public void typeIntheCountryInputName(String name){
        sendKeysFunction( countryInputName , name );
    }
    public void handlingDropdown(){
        handleDropdown( frameDropdown , listOfcity );
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement inputName;

    @FindBy(xpath="(//mat-dialog-container//ms-text-field[contains(@placeholder,'GENERAL.FIELD')]//input)[2]")
    public WebElement inputCode;


    public void typeInputName(String value){
        sendKeysFunction(inputName,value);
    }
    public void typeInputCode(String value){
        sendKeysFunction(inputCode, value);
    }
}
