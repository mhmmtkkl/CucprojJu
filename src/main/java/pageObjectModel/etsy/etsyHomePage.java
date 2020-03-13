package pageObjectModel.etsy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.AbstractPage;

import java.util.List;

public class etsyHomePage extends AbstractPage {

    public etsyHomePage(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//input[@data-id='search-query']")
    private WebElement inputSearchTab;

    public void sendKeysIninputSearchTab(String itemName){

        sendKeysFunction(inputSearchTab , itemName);

    }


    @FindBy(xpath=" //button[@value='Search']")
    private WebElement buttonSearch;

    public void clickButtonSearch(){

        clickFunction(buttonSearch);
    }

    @FindAll({
            @FindBy(xpath = "//span[contains(@class,'text-body-larger')]/span[@class='currency-value']")
    })
    public List<WebElement> allItems;

    public void clickRandomAllItems(){

        clickRandomFunction(allItems);
    }

}
