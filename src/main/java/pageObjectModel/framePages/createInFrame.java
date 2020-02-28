package pageObjectModel.framePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.AbstractPage;

public class createInFrame extends AbstractPage {


    public createInFrame(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement inputName;

    public void enterInputName(String value){
        sendKeysFunction(inputName , value);
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input")
    private WebElement inputCODE;

    public void enterinputCODE(String value){
        sendKeysFunction(inputCODE , value);
    }

      @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']/input")
    private WebElement inputSHORTNAME;
    public void enterinputSHORTNAME(String value){
        sendKeysFunction(inputSHORTNAME , value);
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']/input")
    private WebElement inputINTEGRATION_CODE;

    public void enterinputINTEGRATION_CODE(String value){
        sendKeysFunction(inputINTEGRATION_CODE , value);
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']/input")
    private WebElement inputPRIORITY;

    public void enterinputPRIORITY(String value){
        sendKeysFunction(inputPRIORITY , value);
    }

    @FindBy(xpath="//textArea[@placeholder='Description']")
    private WebElement inputDescription;

    public void enterinputDescription(String value){
        sendKeysFunction(inputDescription , value);
    }

    @FindBy(xpath="//mat-dialog-container//ms-masked-text-field[@placeholder='BANK_ACCOUNT.TITLE.IBAN']/input")
    private WebElement inputIBAN;

    public void enterinputIBAN(String value){
        sendKeysFunction(inputIBAN , value);
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.ORDER']/input")
    private WebElement inputORDER;

    public void enterinputORDER(String value){
        sendKeysFunction(inputORDER , value);
    }





}
