import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownFormPage {
    WebDriver driver;
    WebDriverWait wait;

    By multipleSelectButton = By.xpath("//nb-select[@formcontrolname='select1']/button");
    By msbOption1 = By.xpath("//nb-option[@value='1']");
    By msbOption2 = By.xpath("//nb-option[@value='2']");
    By msbOption4 = By.xpath("//nb-option[@value='4']");
    By selectOptionsCars0 = By.xpath("//select[@formcontrolname='select2']/option[@value=\"0: 'volvo'\"]");
    By selectOptionsCars2 = By.xpath("//select[@formcontrolname='select2']/option[@value=\"2: 'opel'\"]");
    By singleSelectButton = By.xpath("//nb-select[@formcontrolname='select3']");
    By singleSelectOption4 = By.xpath("//nb-option[@value='4']");
    By selectOtherOptions = By.xpath("//select[@formcontrolname='select4']");
    By otherOptionsChoice = By.xpath("//option[@value='audi']");
    By submitButton = By.id("submit");
    By successfulMessage = By.xpath("//span[@class='title']");

    public DropdownFormPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }
    public void clickOnMultipleSelectButton(){
        driver.findElement(multipleSelectButton).click();
    }
    public void chooseOptions(){
        driver.findElement(msbOption1).click();
        driver.findElement(msbOption2).click();
        driver.findElement(msbOption4).click();
    }
    public void setSelectOptionsCars(){
        driver.findElement(selectOptionsCars0).click();
        driver.findElement(selectOptionsCars2).click();
    }
    public void clickOnSingleSelectButton(){
        driver.findElement(singleSelectButton).click();
        driver.findElement(singleSelectOption4).click();
    }
    public void clickOnSelectOtherOptions(){
        driver.findElement(selectOtherOptions).click();
        driver.findElement(otherOptionsChoice).click();
    }
    public void clickOnSubmitButton(){
        driver.findElement(submitButton).click();
    }
    public void giveSuccessfulMessage(){
        driver.findElement(successfulMessage).isEnabled();
    }

}
