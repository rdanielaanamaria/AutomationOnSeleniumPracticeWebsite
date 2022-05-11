import org.testng.annotations.Test;

public class DropdownFormTest extends BaseClass{

    @Test
    public void testingDropdownForm(){
        driver.get(Constants.DROPDOWN_FORM);
        DropdownFormPage dropdownFormPage = new DropdownFormPage(driver);

        dropdownFormPage.clickOnMultipleSelectButton();
        dropdownFormPage.chooseOptions();
        dropdownFormPage.setSelectOptionsCars();
        dropdownFormPage.clickOnSingleSelectButton();
        dropdownFormPage.clickOnSelectOtherOptions();
        dropdownFormPage.clickOnSubmitButton();
        driver.quit();
    }
}
