import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage {
    WebDriver driver;
    WebDriverWait wait;

    By chooseFileButton = By.xpath("//input[@formcontrolname='file']");
    By submitButton = By.id("submit");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }
    public void chooseFile(){
        driver.findElement(chooseFileButton).sendKeys("AutomationOnSeleniumPracticeWebsite/src/main/resources/tasha" +
                ".jpg");
    }
    public void submitFile(){
        driver.findElement(submitButton).click();
    }
}
