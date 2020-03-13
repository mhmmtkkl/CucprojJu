package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
import java.util.Set;


public abstract class AbstractPage {

        protected WebDriver driver;
        private WebDriverWait wait;




        public AbstractPage() {
            this.driver = Driver.getDriver();
            wait = new WebDriverWait(driver, 20);

        }

        // Click on element(dropdown) , create a random number according to size of the list
//      click that random number

        public void handleDropdown(WebElement dropdown , List<WebElement> dropdownOptions){

            clickFunction( dropdown );
            int randomNum = randomGenerator( dropdownOptions.size() );
            clickFunction(dropdownOptions.get( randomNum ));

        }

        // random number creator
        public int randomGenerator(int max){

            Random random = new Random();
            int randomNum = random.nextInt(max);
            return randomNum;
        }
        public void verifyDeletedAbstractClass(List<WebElement> tableList, String value) throws InterruptedException {
            Thread.sleep(2000);
            boolean result = false;
            for (int i = 0; i < tableList.size(); i++) {
                if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                    result = true;
                    break;
                }
            }
            if (result == true) {
                Assert.fail();
            } else {
                System.out.println(value + " is not displayed");
            }
        }

        public void clickFunction(WebElement elementToClick) {

            try {
                waitUntilClickable(elementToClick);
                elementToClick.click();

            } catch (Exception e) {
                System.out.println(elementToClick + " not able to click this element");
                Assert.fail();
            }

        }

        public void clickRandomFunction(List<WebElement> listOfElements){

            int myRandomNum = randomNum(listOfElements.size());

            listOfElements.get(myRandomNum).click();

        }

        public void sendKeysFunction(WebElement sendKeysElement, String value) {

            try {
                waitVisibility(sendKeysElement);
                sendKeysElement.sendKeys(value);

            } catch (Exception e) {

                System.out.println(sendKeysElement + " not able to wait until this element");
                Assert.fail();
            }

        }

        public void waitUntilClickable(WebElement waitElement) {

            try {
                wait.until(ExpectedConditions.elementToBeClickable(waitElement));
            } catch (Exception e) {
                System.out.println(" Not able to wait until this element");
                Assert.fail();
            }
        }

        public void waitVisibility(WebElement waitElement) {

            try {
                wait.until(ExpectedConditions.visibilityOf(waitElement));

            } catch (Exception e) {
                System.out.println(waitElement + " not able to wait until this element");
                Assert.fail();
            }
        }

        public void verifyCreated(List<WebElement> names, String value) {

            boolean result = false;
            for (WebElement eachElement : names) {
                System.out.println("eachElement is here verify Created " + eachElement);
                waitVisibility(eachElement);
                if (eachElement.getText().equals(value)) {
                    result = true;

                    break;
                }
            }

            if (result == false) {

                Assert.fail();
            }

            System.out.println("Element " + value + " is visible.");
        }

        public void deleteFunctionality(List<WebElement> names, List<WebElement> deleteButtons, String value, WebElement buttonYes) {

            waitVisibility(names.get(0));
            System.out.println(value);
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i).getText() + " <<---- each name is here ");
                if (names.get(i).getText().equals(value)) {
                    clickFunction(deleteButtons.get(i));
                    clickFunction(buttonYes);
                    break;
                }
            }
        }

        public void verifyDeleted(List<WebElement> names, String value) {


            boolean result = false;
            System.out.println(names.size() + "<----- names.size() is here ");
            for (WebElement eachElement : names) {
                if (eachElement.getText().equals(value)) {
                    result = true;
                    break;
                }
            }

            if (result == true) {
                Assert.fail();
            }

            System.out.println("Element " + value + " is not visible.");
        }

        public void waitUntilInvisibility(WebElement invisibleElement) {

            try {
                wait.until(ExpectedConditions.invisibilityOf(invisibleElement));
            } catch (Exception e) {
                System.out.println(invisibleElement + " invisibility is FAILED");
            }
        }

        public void sleep(int seconds)   {
            try {
                Thread.sleep(seconds * 1000);
            }catch (Exception e ){
                System.out.println(e.getMessage());
            }

            }

        public void clickByTextFromDropdown(WebElement dropdown, String value, List<WebElement> optionsList) {

            clickFunction(dropdown);

            for (int i = 0; i < optionsList.size(); i++) {

                if (optionsList.get(i).getText().equals(value)) {
                    optionsList.get(i).click();
                }
            }

        }

        public void clickRandomInDropdown(WebElement dropdownElement){

            dropdownElement.click();

            List<WebElement> optionsInTheDropdown = driver.findElements(By.xpath("//mat-option[@aria-disabled='false']//span[@class='mat-option-text']"));

            int myRand = randomNum(optionsInTheDropdown.size());

            System.out.println("myRand in the clickRandomInDropdown---->>>>>  " + myRand);
            optionsInTheDropdown.get(myRand).click();
        }

        public int randomNum(int max){

            Random rnd = new Random();

            int randomNum = 0 ;
            if(max>1){
                randomNum= rnd.nextInt(max-1)+1;
            }else{
                randomNum =0;
            }

            System.out.println("random is here--->>> " + randomNum);
            return randomNum;
        }

        public void allRequiredDropdowns(){

            List<WebElement> allRequiredDropdownsElements = driver.findElements(By.xpath("//mat-select[contains(@class,'mat-select-required')]"));

            for(int i = 0 ; i <allRequiredDropdownsElements.size() ; i++){

                clickRandomInDropdown(allRequiredDropdownsElements.get(i));
            }

        }

    public void allRequiredInYheFrameDropdowns(){
        sleep(1);

        List<WebElement> allRequiredDropdownsElements = driver.findElements(By.xpath("//ms-dialog-content//mat-select[@aria-required='true']"));

        for(int i = 0 ; i <allRequiredDropdownsElements.size() ; i++){

            clickRandomInDropdown(allRequiredDropdownsElements.get(i));
            sleep(1);
        }

        List<WebElement> allRequiredDropdownsElements2 = driver.findElements(By.xpath("//ms-dialog-content//mat-select[@aria-required='true']"));

        int list1 = allRequiredDropdownsElements.size();
        int list2 = allRequiredDropdownsElements2.size();

        if(list1!=list2){

            for(int i = list1 ; i<list2 ; i++){
                clickRandomInDropdown(allRequiredDropdownsElements2.get(i));
                sleep(1);
            }
        }


    }

    public void switchWindow(){

        sleep(1);

        Set handles = driver.getWindowHandles();

        for (Object handle : handles) {

            driver.switchTo().window(handle.toString());


        }

        System.out.println(driver.getCurrentUrl());
    }

//    select class

    public void selectFromDropdown(WebElement dropdownList){

            Select s1 =new Select(dropdownList);

            List<WebElement> allOptions = s1.getOptions();

            int ranNum = randomNum(allOptions.size());

            s1.selectByIndex(ranNum);

            sleep(1);

    }
    public void handleInputsAndDropdowns(List<WebElement> dropdownList ,List<WebElement> inputList  ){

            if(dropdownList.size()>0) {
                for (int i = 0; i < dropdownList.size(); i++) {

                    selectFromDropdown(dropdownList.get(i));
                }

            }

            if(inputList.size()>0) {
                for (int i = 0; i < inputList.size(); i++) {

                    sendKeysFunction(inputList.get(i), "myPersonalize");

                }
            }
    }


}

