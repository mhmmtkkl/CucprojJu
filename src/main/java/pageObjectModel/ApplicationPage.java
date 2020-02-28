package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplicationPage extends AbstractPage{


    public ApplicationPage(){

        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath="//ms-add-button//button")
    private WebElement buttonPlusIcon;

    public void clickOnbuttonPlusIcon(){
        buttonPlusIcon.click();
    }

    @FindBy(xpath="//span[text()='Save']")
    private WebElement buttonSave;

    public void clickOnbuttonSave(){
        buttonSave.click();
    }

    @FindBy(xpath=" //span[text()=' Yes ']")
    private WebElement buttonYes;



    @FindAll({
            @FindBy(xpath = "//table//tr//td[2]")

    })
    private List<WebElement> listOfNames;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button//button")

    })
    private List<WebElement> listOfdeleteButton;

    public void verifyCreated(String name){
        sleep(2);
        verifyCreated(listOfNames , name);
    }

    public void deleteFunctionality(String name){
        deleteFunctionality(listOfNames , listOfdeleteButton , name , buttonYes);
    }

    public void verifyDeleted(String name){
        sleep(2);
        verifyDeleted(listOfNames,name);
    }

    public void requiredDropdown(){
        allRequiredDropdowns();

    }
    public void requiredInTheFrameDropdown(){
        allRequiredInYheFrameDropdowns();

    }

}
