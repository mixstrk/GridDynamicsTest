package GridDynamics.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class GetInTouchPage {
    private final SelenideElement FIRST_NAME_INP = $x("//input[@formcontrolname='firstName']");
    private final SelenideElement LAST_NAME_INP = $x("//input[@formcontrolname='lastName']");
    private final SelenideElement EMAIL_INP = $x("//input[@type='email']");
    private final SelenideElement JOB_TITLE_INP = $x("//input[@formcontrolname='jobTitle']");
    private final SelenideElement COMPANY_INP = $x("//input[@formcontrolname='company']");
    private final ElementsCollection SELECT = $$x("//gd-icon[@class='ui-icon-standard-layout ng-star-inserted']");
    private final SelenideElement SOCIAL_MEDIA_SELECT = $x("//gd-select-option[contains(text(), 'Social Media')]");
    private final SelenideElement SELECT_TWO = $x("/html/body/gd-root/gd-app-shell/div/div[1]/main/gd-contact-page/div/div[1]/div[2]/div/gd-contact-form/div/form/gd-form-field[2]/div/div/div/gd-select/div/gd-icon");
    private final SelenideElement CAREERS_SELECT = $x("//gd-select-option[contains(text(), 'Careers')]");
    private final SelenideElement MESSAGE_INP = $x("//textarea[@formcontrolname='message']");
    private final ElementsCollection CHECK_BOX_CLICK = $$x("//span[@class='ui-checkbox-cell']");
    private final SelenideElement CHECK_BOX_TWO_CLICK = $x("/html/body/gd-root/gd-app-shell/div/div[1]/main/gd-contact-page/div/div[1]/div[2]/div/gd-contact-form/div/form/gd-checkbox[2]/label/span");
    private final SelenideElement SCROLL_TO_GLOBAL_OFFICE = $x("//a[contains(text(), ' Global offices')] ");
    private final SelenideElement SUBMIT_BUTTON = $x("//button[@type='submit']");
    private final SelenideElement MESSAGE_THANK_U = $x("//h2[contains(text(), 'Thank')]");

    public void enterFirstName(String firstName) {
        FIRST_NAME_INP.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        LAST_NAME_INP.setValue(lastName);
    }

    public void enterEmail(String email) {
        EMAIL_INP.setValue(email);
    }

    public void enterJobTitle(String jobTitle) {
        JOB_TITLE_INP.setValue(jobTitle);
    }

    public void enterCompany(String company) {
        COMPANY_INP.setValue(company);
    }

    public void selectHowDidAbout() {
        SELECT.first().click();
        sleep(2000);
        SOCIAL_MEDIA_SELECT.click();
    }

    public void selectWhatInterested() {
        SELECT_TWO.click();
        CAREERS_SELECT.click();
    }

    public void enterMessage(String message) {
        MESSAGE_INP.setValue(message);
    }

    public void clickCheckBoxes() {
        CHECK_BOX_CLICK.first().click();
        CHECK_BOX_TWO_CLICK.click();
    }
    public SelenideElement getScrollElement() {
        return SCROLL_TO_GLOBAL_OFFICE;
    }

    public boolean isSubmitEnabled() {
        return SUBMIT_BUTTON.isEnabled();
    }
    
    public void clickSubmit() {
        SUBMIT_BUTTON.click();
    }

    public String getMessageThankU() {
        return MESSAGE_THANK_U.innerText();
    }
}
