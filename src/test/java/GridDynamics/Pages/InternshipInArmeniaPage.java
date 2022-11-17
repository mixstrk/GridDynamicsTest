package GridDynamics.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class InternshipInArmeniaPage {
    private final SelenideElement INTERNSHIP_BLOCK = $x("//div[@class='CurrentInternshipBlock_grid__WE10B']");
    private final ElementsCollection INTERNSHIP_CARDS = $$x("//div[@class='InternshipCard_root__esk9M aos-init aos-animate']");
    private final SelenideElement AFTER_CARDS = $x("//li[@class='PaginationBlock_paginationListItem__PBTLY PaginationBlock_activePage__5l4cQ']");
    private final SelenideElement SUBTITLE = $x("//div[@class='HeroSection_row__Gsrvs'][1]");

    public SelenideElement getInternshipBlock() {
        return INTERNSHIP_BLOCK;
    }

    public ElementsCollection getInternshipCards() {
        return INTERNSHIP_CARDS;
    }

    public SelenideElement getAfterCards() {
        return AFTER_CARDS;
    }

    public SelenideElement getSubtitle() {
        return SUBTITLE;
    }
}
