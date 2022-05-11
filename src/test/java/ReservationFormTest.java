import org.testng.annotations.Test;

public class ReservationFormTest extends BaseClass{

    @Test
    public void testingReservationForm(){
        driver.get(Constants.RESERVATION_FORM_PAGE);
        ReservationFormPage reservationFormPage = new ReservationFormPage(driver);

        reservationFormPage.typeName(Constants.NAME);
        reservationFormPage.typeComment(Constants.COMMENT);
        reservationFormPage.checkReservation();
        reservationFormPage.checkInclusive();
        reservationFormPage.sendReservationRequest();
        driver.quit();

    }
}
