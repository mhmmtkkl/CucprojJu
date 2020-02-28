package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leftNavigation extends AbstractPage {

        public leftNavigation(){

            PageFactory.initElements(driver,this);

        }


    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement buttonSetupOnTop;

    public void clickOnbuttonSetupOnTop(){
        buttonSetupOnTop.click();
    }

    @FindBy(xpath="//span[text()='Parameters']")
    private WebElement buttonParameters;

    public void clickOnbuttonParameters(){
        buttonParameters.click();
    }

    @FindBy(xpath="//span[text()='Countries']")
    private WebElement buttonCountries;

    public void clickOnbuttonCountries(){
        buttonCountries.click();
    }

    @FindBy(xpath="//span[text()='Citizenships']")
    private WebElement buttonCitizenships;
    public void clickOnbuttonCitizenships(){
        buttonCitizenships.click();
    }

    @FindBy(xpath="//span[text()='Cities']")
    private WebElement buttonCities;
    public void clickOnbuttonCities(){
        buttonCities.click();
    }

    @FindBy(xpath="//span[text()='Nationalities']")
    private WebElement buttonNationalities;
    public void clickOnbuttonNationalities(){
        buttonNationalities.click();
    }

    @FindBy(xpath="//span[text()='Fees']")
    private WebElement buttonFees;
    public void clickOnbuttonFees(){
        buttonFees.click();
    }

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement buttonSubject_Categories;
    public void clickOnbuttonSubject_Categories(){
        buttonSubject_Categories.click();
    }


    @FindBy(xpath="//span[text()='Budget']")
    private WebElement buttonBudget;
    public void clickOnbuttonBudget(){
        buttonBudget.click();
    }

    @FindBy(xpath="//span[text()='Budget']/parent::a/parent::fuse-nav-vertical-collapsable//*[text()='Setup']")
    private WebElement buttonBudgetSetup;
    public void clickOnbuttonBudgetSetup(){
        buttonBudgetSetup.click();
    }

    @FindBy(xpath="//*[text()='Income Plans']")
    private WebElement buttonIncomePlans;
    public void clickOnbuttonIncomePlans(){
        buttonIncomePlans.click();
    }

}
