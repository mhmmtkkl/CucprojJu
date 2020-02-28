package stepDefinition.framePagesStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.ApplicationPage;
import pageObjectModel.fullPages.fullPagePart1;

public class createInFrame {


    pageObjectModel.framePages.createInFrame createInFrame = new pageObjectModel.framePages.createInFrame();
    ApplicationPage applicationPage = new ApplicationPage();
    fullPagePart1 fullPagePart1 = new fullPagePart1();

    @And("^Click on add button$")
    public void click_on_add_button() {
        applicationPage.clickOnbuttonPlusIcon();
    }

    @Given("^Enter the name \"([^\"]*)\"$")
    public void enter_the_name(String arg1) {
        createInFrame.enterInputName(arg1);
    }

    @Given("^Enter the short name \"([^\"]*)\"$")
    public void enter_the_short_name(String arg1) {
        createInFrame.enterinputSHORTNAME(arg1);
    }

    @Given("^Enter the code \"([^\"]*)\"$")
    public void enter_the_code(String arg1) {
        createInFrame.enterinputCODE(arg1);
    }

    @Given("^Enter the priority \"([^\"]*)\"$")
    public void Enter_the_priority(String arg1) {
        createInFrame.enterinputPRIORITY(arg1);
    }
    @Given("^Enter the Integration Code \"([^\"]*)\"$")
    public void Enter_the_Integration_Code(String arg1) {
        createInFrame.enterinputINTEGRATION_CODE(arg1);
    }

    @Given("^Enter the integration code \"([^\"]*)\"$")
    public void Enter_the_integration_code(String arg1) {
        createInFrame.enterinputINTEGRATION_CODE(arg1);
    }

    @And("^Click on apply button$")
    public void Click_on_apply_button() {
        fullPagePart1.clickOnbuttonApply();

    }
    @And("^Click on save button frame$")
    public void click_on_save_button_frame() {
        applicationPage.clickOnbuttonSave();
    }


    @And("^Verify data is created name is \"([^\"]*)\"$")
    public void verify_data_is_created_name_is(String arg1) {
        applicationPage.verifyCreated(arg1);
    }

    @When("^Remove the \"([^\"]*)\" from the cities table$")
    public void remove_the_from_the_cities_table(String arg1) {
        applicationPage.deleteFunctionality(arg1);
    }

    @Then("^Verify \"([^\"]*)\" is removed$")
    public void verify_is_removed(String arg1) {
        applicationPage.verifyDeleted(arg1);
    }




}
