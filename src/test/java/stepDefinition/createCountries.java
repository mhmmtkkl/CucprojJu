package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.ApplicationPage;
import pageObjectModel.pageCountries;

public class createCountries {

    ApplicationPage ap = new ApplicationPage();
    pageCountries pc = new pageCountries();

    @Given("^Click on setup , parameters and \"(.*?)\"$")
    public void click_on_setup_parameters_and(String WhichButton) throws Throwable {
        ap.SetupParametersClick(WhichButton);

    }
    @And("^Creation two inputs are  \"(.*?)\" , \"(.*?)\"$")
    public void creation_two_inputs_are(String name, String code) throws Throwable {

        pc.typeInputName(name);
        pc.typeInputCode(code);
    }

    @And("^Click on save button frame$")
    public void click_on_save_button_frame() throws Throwable {
        ap.ClickOnbuttonSaveFrame();

    }
    @Then("^Verify data is created name is \"(.*?)\"$")
    public void verify_Countries_is_created_name_is(String name) throws Throwable {

        ap.nameIsCreated(name);
    }
}
