import org.testng.annotations.Test;

public class DatePickerTest extends BaseClass{

    @Test
    public void testingDatePickerForm(){
        driver.get(Constants.DATE_PICKER_FORM);
        DatePickerPage datePickerPage = new DatePickerPage(driver);

        datePickerPage.chooseDate();
        datePickerPage.clickOnSubmitButton();
    }

}
