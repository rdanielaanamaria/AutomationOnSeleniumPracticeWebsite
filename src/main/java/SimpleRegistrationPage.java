import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleRegistrationPage {
    WebDriver driver;
    WebDriverWait wait;


    By emailField = By.id("email");
    By passwordField = By.id("password");
    By registerButton = By.id("submit");



    public SimpleRegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickRegister(){
        driver.findElement(registerButton).click();
    }

}
