package stepDefinition.etsy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjectModel.etsy.etsyHomePage;
import pageObjectModel.etsy.itemsPage;

public class etsyAddCard {

    etsyHomePage etsyHomePage = new etsyHomePage();
    itemsPage itemsPage = new itemsPage();

    @And("^search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
        etsyHomePage.sendKeysIninputSearchTab(arg1);
        etsyHomePage.clickButtonSearch();
    }

    @And("^Click on any item$")
    public void click_on_any_item() {
        etsyHomePage.clickRandomAllItems();
        etsyHomePage.switchWindow();
    }

    @And("^Choose or enter all the required fields$")
    public void choose_or_enter_all_the_required_fields() {
        itemsPage.handleDropdownsAndInputs();
    }

    @And("^Click on add to card$")
    public void click_on_add_to_card() {

        itemsPage.clickaddToCart();
    }

    @Then("^Verify item is in the card$")
    public void verify_item_is_in_the_card() {

    }
}
