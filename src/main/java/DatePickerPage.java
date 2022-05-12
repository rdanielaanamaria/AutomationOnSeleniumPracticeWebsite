import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage {
    WebDriver driver;
    WebDriverWait wait;

    By datePicker = By.xpath("//input[@formcontrolname='dateOne']");
    By rangePicker = By.xpath("//input[@formcontrolname='dateTwo']");
    By randomClick = By.xpath("//label[@class='col-sm-3']");
    By submitButton = By.id("submit");
    By successfulMessage = By.xpath("//span[@class='title']");


    public DatePickerPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void chooseDate(){
        driver.findElement(datePicker).sendKeys(Constants.DATE_PICKER);
    }
    public void chooseRangeDate(){
        driver.findElement(rangePicker).sendKeys(Constants.DATE_RANGE);
    }
    public void emptyClick(){
        driver.findElement(randomClick).click();
    }
    public void clickOnSubmitButton(){
        driver.findElement(submitButton).click();}
    public void giveSuccessfulMessage(){
        driver.findElement(successfulMessage).isEnabled();
    }
}
