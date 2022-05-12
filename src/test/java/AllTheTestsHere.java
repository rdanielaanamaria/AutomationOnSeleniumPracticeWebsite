import org.testng.annotations.Test;

public class AllTheTestsHere extends BaseClass{

    @Test
    public void testingRegistration() {
        driver.get(Constants.SIMPLE_REGISTRATION);
        SimpleRegistrationPage simpleRegistrationPage = new SimpleRegistrationPage(driver);

        simpleRegistrationPage.typeEmail(Constants.EMAIL);
        simpleRegistrationPage.typePassword(Constants.PASSWORD);
        simpleRegistrationPage.clickRegister();
        simpleRegistrationPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on Simple Registration Page");
    }

    @Test
    public void testingRadioButtonForm(){
        driver.get(Constants.RADIO_BUTTON_FORM);
        RadioButtonFormPage radioButtonFormPage = new RadioButtonFormPage(driver);

        radioButtonFormPage.typeTitle(Constants.TITLE);
        radioButtonFormPage.typeDescription(Constants.DESCRIPTION);
        radioButtonFormPage.checkRadioButton();
        radioButtonFormPage.clickRegister();
        radioButtonFormPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on Radio Button Form Page");
    }

    @Test
    public void testingReservationForm(){
        driver.get(Constants.RESERVATION_FORM_PAGE);
        ReservationFormPage reservationFormPage = new ReservationFormPage(driver);

        reservationFormPage.typeName(Constants.NAME);
        reservationFormPage.typeComment(Constants.COMMENT);
        reservationFormPage.checkReservation();
        reservationFormPage.checkInclusive();
        reservationFormPage.sendReservationRequest();
        reservationFormPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on Reservation Form Page");
    }

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
        dropdownFormPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on Dropdown Form Page");
    }

    @Test
    public void testingDatePickerForm(){
        driver.get(Constants.DATE_PICKER_FORM);
        DatePickerPage datePickerPage = new DatePickerPage(driver);

        datePickerPage.chooseDate();
        datePickerPage.chooseRangeDate();
        datePickerPage.emptyClick();
        datePickerPage.clickOnSubmitButton();
        datePickerPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on Date Picker Form");
    }

    @Test
    public void testingFileUploadPage(){
        driver.get(Constants.FILE_UPLOAD_FORM);
        FileUploadPage fileUploadPage = new FileUploadPage(driver);

        fileUploadPage.chooseFile();
        fileUploadPage.submitFile();
        fileUploadPage.giveSuccessfulMessage();
        System.out.println(Constants.SUCCESSFUL_MESSAGE + " on File Upload Page");
    }
}
