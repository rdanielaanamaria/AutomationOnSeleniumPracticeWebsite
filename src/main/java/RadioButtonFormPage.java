import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonFormPage {
    WebDriver driver;
    WebDriverWait wait;


    By titleField = By.id("title");
    By descriptionField = By.id("description");
    By radioButton = By.xpath("//div[@class='form-check'][3]");
    By registerButton = By.id("submit");
    By successfulMessage = By.xpath("//span[@class='title']");

    public RadioButtonFormPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void typeTitle(String title){
        driver.findElement(titleField).sendKeys(title);
    }
    public void typeDescription(String description){
        driver.findElement(descriptionField).sendKeys(description);
    }
    public void checkRadioButton(){
        driver.findElement(radioButton).click();
    }
    public void clickRegister(){
        driver.findElement(registerButton).click();
    }
    public void giveSuccessfulMessage(){
        driver.findElement(successfulMessage).isEnabled();
    }
}
