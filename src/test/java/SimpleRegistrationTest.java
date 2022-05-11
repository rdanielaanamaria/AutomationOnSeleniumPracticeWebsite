import org.testng.annotations.Test;

public class SimpleRegistrationTest extends BaseClass {


    @Test
        public void testingRegistration() {
        driver.get(Constants.SIMPLE_REGISTRATION);
        SimpleRegistrationPage simpleRegistrationPage = new SimpleRegistrationPage(driver);

        simpleRegistrationPage.typeEmail(Constants.EMAIL);
        simpleRegistrationPage.typePassword(Constants.PASSWORD);
        simpleRegistrationPage.clickRegister();
        driver.quit();
    }
}
