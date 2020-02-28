package stepDefinition.fullPage;

import cucumber.api.java.en.Given;
import pageObjectModel.ApplicationPage;
import pageObjectModel.fullPages.fullPagePart1;

public class IncomePlans {

    fullPagePart1 fullPagePart1 = new fullPagePart1();
    ApplicationPage ApplicationPage = new ApplicationPage();


    @Given("^Enter the name in full page \"([^\"]*)\"$")
    public void enter_the_name_in_full_page(String arg1) {
        fullPagePart1.enterinputName(arg1);
    }

    @Given("^Select all the required dropdown$")
    public void click_on_the_budget_dropdown() {
        ApplicationPage.requiredDropdown();
    }


    @Given("^Select all the required in the frame in add form$")
    public void choose_the_value_in_the_grade_level_dropdown() {
        ApplicationPage.requiredInTheFrameDropdown();
    }


    @Given("^Enter the \"([^\"]*)\" in the fee Amount$")
    public void enter_the_in_the_fee_Amount(String arg1) {
        fullPagePart1.typeIninputFeeAmount(arg1);
    }
    @Given("^Enter the \"([^\"]*)\" in the student count$")
    public void enter_the_in_the_student_count(String arg1) {
        fullPagePart1.typeIninputstudentCount(arg1);
    }


}
