import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservationFormPage {
    WebDriver driver;
    WebDriverWait wait;


    By nameField = By.id("name");
    By commentField = By.id("comment");
    By reservationField = By.xpath("//div[@class='form-check'][1]");
    By inclusiveField = By.xpath("//nb-checkbox[@value='breakfast']/label/span");
    By sendRequest = By.id("submit");
    By successfulMessage = By.xpath("//span[@class='title']");


    public ReservationFormPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void typeName(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void typeComment(String comment){
        driver.findElement(commentField).sendKeys(comment);
    }
    public void checkReservation(){
        driver.findElement(reservationField).click();
    }
    public void checkInclusive(){
        driver.findElement(inclusiveField).click();
    }
    public void sendReservationRequest(){
        driver.findElement(sendRequest).click();
    }
    public void giveSuccessfulMessage(){
        driver.findElement(successfulMessage).isEnabled();
    }

}
