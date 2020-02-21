package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.ApplicationPage;
import pageObjectModel.pageCity;
import pageObjectModel.pageCountries;

public class citySteps {

    ApplicationPage ap = new ApplicationPage();
    pageCity pc = new pageCity();
    pageCountries cp = new pageCountries();

    @And("^Create an city as name is \"(.*?)\" , click on country dropdown and click on country \"(.*?)\"$")
    public void create_an_city_as_name_is_click_on_country_dropdown_and_click_on_country(String name, String country) throws Throwable {


        pc.sendKeysFunctioninputName(name);
        pc.clickDropdownCountires(country);
    }

    @And("^Remove the \"(.*?)\" from the cities table$")
    public void remove_the_from_the_cities_table(String arg1) throws Throwable {
        ap.deletingElement(arg1);
    }

    @Then("^Verify \"(.*?)\" is removed$")
    public void verify_is_removed(String arg1) throws Throwable {
        ap.verifingDeleted(arg1);
    }

    @Given("^Type in the Name \"(.*?)\"$")
    public void type_in_the_Name(String name) throws Throwable {
        cp.typeIntheCountryInputName( name );
    }

    @Given("^Choose any value from the dropdown$")
    public void choose_any_value_from_the_dropdown() throws Throwable {
        cp.handlingDropdown();
    }
}
