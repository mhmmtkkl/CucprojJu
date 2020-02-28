package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjectModel.ApplicationPage;
import pageObjectModel.framePages.createInFrame;
import pageObjectModel.leftNavigation;
import pageObjectModel.signInPage;

public class leftNav {

    signInPage signInPage = new signInPage();
    createInFrame createInFrame = new createInFrame();
    ApplicationPage applicationPage = new ApplicationPage();
    leftNavigation leftNavigation = new leftNavigation();

    @Given("^Enter the user name and password$")
    public void Enter_the_user_name_and_password() {
        signInPage.sendKeysInTheInputUserName();
        signInPage.sendKeysInTheinputPassword();
        signInPage.clickOnButtonLogin();
        signInPage.clickOnbuttonGotIt();
    }

    @And("^Click on setup$")
    public void click_on_setup() {
        leftNavigation.clickOnbuttonSetupOnTop();
    }

    @And("^Click on parameters$")
    public void click_on_parameters() {
        leftNavigation.clickOnbuttonParameters(); }

    @And("^Click on Citizenship$")
    public void click_on_Citizenship() {
        leftNavigation.clickOnbuttonCitizenships();
    }
    @And("^Click on Country$")
    public void  Click_on_City() {
        leftNavigation.clickOnbuttonCountries();
    }

    @And("^Click on Nationalities$")
    public void  Click_on_Nationalities() {
        leftNavigation.clickOnbuttonNationalities();
    }

    @And("^Click on Subject Categories$")
    public void  Click_on_Subject_Categories() {
        leftNavigation.clickOnbuttonSubject_Categories();
    }


    @And("^Click on fees$")
    public void  Click_on_fees() {
        leftNavigation.clickOnbuttonFees();
    }

    @Given("^Click on Budget$")
    public void click_on_Budget() {
        leftNavigation.clickOnbuttonBudget();
    }

    @Given("^Click on Setup$")
    public void click_on_Setup() {
        leftNavigation.clickOnbuttonBudgetSetup();
    }

    @Given("^Click on income plans$")
    public void click_on_income_plans() {
        leftNavigation.clickOnbuttonIncomePlans();
    }
}
