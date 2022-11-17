package GridDynamics;

import Base.BaseTest;
import GridDynamics.Pages.GetInTouchPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GetInTouchTest extends BaseTest {
    private static final String GET_IN_TOUCH_URL = "https://www.griddynamics.com/contact";
    private static final String FIRST_NAME = "Max";
    private static final String LAST_NAME = "Star";
    private static final String EMAIL = "example@gmail.com";
    private static final String JOB_TITLE = "Intern QA engineer";
    private static final String COMPANY = "Unemployed";
    private static final String MESSAGE = "Text message";
    private static final boolean ALLOW_SPAM = false;

    /**
     * Fill-in forms and submitting data
     */
    @Test
    public void getInTouch() {
        open(GET_IN_TOUCH_URL);
        GetInTouchPage getInTouchPage = new GetInTouchPage();
        getInTouchPage.enterFirstName(FIRST_NAME);
        getInTouchPage.enterLastName(LAST_NAME);
        getInTouchPage.enterEmail(EMAIL);
        getInTouchPage.enterJobTitle(JOB_TITLE);
        getInTouchPage.enterCompany(COMPANY);
        getInTouchPage.selectHowDidAbout();
        getInTouchPage.getScrollElement().scrollIntoView(false);
        getInTouchPage.selectWhatInterested();
        getInTouchPage.enterMessage(MESSAGE);
        Assertions.assertFalse(getInTouchPage.isSubmitEnabled());
        getInTouchPage.clickCheckBoxes();
        Assertions.assertTrue(getInTouchPage.isSubmitEnabled());
        if (ALLOW_SPAM) {
            getInTouchPage.clickSubmit();
            Selenide.sleep(5000);
            Assertions.assertEquals(" Thank you for your interest! ", getInTouchPage.getMessageThankU());
        }
    }
}
