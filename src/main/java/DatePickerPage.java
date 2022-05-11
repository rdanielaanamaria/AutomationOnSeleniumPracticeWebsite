import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage {
    WebDriver driver;
    WebDriverWait wait;

    By datePicker = By.xpath("//input[@formcontrolname='dateOne']");
    By rangePicker = By.xpath("//input[@formcontrolname='dateTwo']");
    By submitButton = By.id("submit");

    public DatePickerPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }
    public void chooseDate(){
        driver.findElement(datePicker).sendKeys(Constants.DATE_PICKER);
        driver.findElement(rangePicker).sendKeys(Constants.DATE_RANGE);
    }
    public void clickOnSubmitButton(){
        driver.findElement(submitButton).click();
    }
}
