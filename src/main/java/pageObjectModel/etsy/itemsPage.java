package pageObjectModel.etsy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.AbstractPage;

import java.util.List;

public class itemsPage extends AbstractPage {

    public itemsPage(){

        PageFactory.initElements(driver,this);

    }

    @FindAll({
            @FindBy(xpath = "//select[contains(@id,'inventory-variation')]")
    })
    public List<WebElement> dropdownCount;

    @FindAll({
            @FindBy(xpath = "//textarea[contains(@id,'personalization')]")
    })
    public List<WebElement> inputItem;

    public void handleDropdownsAndInputs(){
        handleInputsAndDropdowns(dropdownCount , inputItem);
    }

    @FindBy(xpath="//div[contains(text(),'Add to cart')]")
    private WebElement addToCart;

    public void clickaddToCart(){

        clickFunction(addToCart);
    }


}
