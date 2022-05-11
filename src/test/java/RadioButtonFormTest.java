import org.testng.annotations.Test;

public class RadioButtonFormTest extends BaseClass{

    @Test
    public void testingRadioButtonForm(){
        driver.get(Constants.RADIO_BUTTON_FORM);
        RadioButtonFormPage radioButtonFormPage = new RadioButtonFormPage(driver);

        radioButtonFormPage.typeTitle(Constants.TITLE);
        radioButtonFormPage.typeDescription(Constants.DESCRIPTION);
        radioButtonFormPage.checkRadioButton();
        radioButtonFormPage.clickRegister();
        driver.quit();
    }
}
