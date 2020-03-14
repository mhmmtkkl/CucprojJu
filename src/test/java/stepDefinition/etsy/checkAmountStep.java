package stepDefinition.etsy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjectModel.etsy.etsyHomePage;

public class checkAmountStep {

    etsyHomePage etsyHomePage = new etsyHomePage();


    @And("^Click on seventy five to hundred amount$")
    public void click_on_seventy_five_to_hundred_amount() {
        etsyHomePage.clickseventyFiveTo100Button();
    }

    @Then("^Verify all the items are between seventy five to hundred amount$")
    public void verify_all_the_items_are_between_seventy_five_to_hundred_amount() {
        etsyHomePage.verifyAmountIsBetweenNumbers();
    }



}
