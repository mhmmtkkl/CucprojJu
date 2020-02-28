package pageObjectModel.fullPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.AbstractPage;

public class fullPagePart1 extends AbstractPage {

    public fullPagePart1(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//input[@placeholder='Name']")
    private WebElement inputName;
    public void enterinputName(String value){
        sendKeysFunction(inputName , value);
    }

    @FindBy(xpath="//mat-select[@aria-label='Budget']")
    private WebElement dropDownBudget;
    public void choosedropDownBudget(){
        clickRandomInDropdown(dropDownBudget);
    }

    @FindBy(xpath="//input[@placeholder='Fee Amount']")
    private WebElement inputFeeAmount;
    public void typeIninputFeeAmount(String value){
        sendKeysFunction(inputFeeAmount ,value);
    }

    @FindBy(xpath="//ms-integer-field[@name='studentCount']/input")
    private WebElement inputstudentCount;
    public void typeIninputstudentCount(String value){
        sendKeysFunction(inputstudentCount ,value);
    }

    @FindBy(xpath="//span[text()='Apply']")
    private WebElement buttonApply;
    public void clickOnbuttonApply(){
        clickFunction(buttonApply );
        sleep(1);
    }
}
