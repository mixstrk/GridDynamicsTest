package GridDynamics;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Titles {
    private final SelenideElement TITLE_LANDING_PAGE = $x("//html/head/title[contains(text(), 'Global')]");
    private final SelenideElement TITLE_CONTACT_US = $x("//html/head/title[contains(text(), 'Contact us')]");
    private final SelenideElement TITLE_INVESTORS = $x("//html/head/title[contains(text(), 'Investor relations')]");
    public String getTitleLandingPage() {
        return TITLE_LANDING_PAGE.innerText();
    }

    public String getTitleInvestors() {
        return TITLE_INVESTORS.innerText();
    }

    public String getTitleContactUs() {
        return TITLE_CONTACT_US.innerText();
    }
}
