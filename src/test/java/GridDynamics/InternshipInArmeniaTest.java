package GridDynamics;

import Base.BaseTest;
import GridDynamics.Pages.InternshipInArmeniaPage;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.CollectionCondition.allMatch;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class InternshipInArmeniaTest extends BaseTest {
    private static final String INTERNSHIP_ARMENIA_URL = "https://portal.griddynamics.net/internship/armenia";

    /**
     * Check appear/disappear items on internship armenia page
     */
    @Test
    public void animationInternship() {
        open(INTERNSHIP_ARMENIA_URL);
        InternshipInArmeniaPage internshipInArmeniaPage = new InternshipInArmeniaPage();
        ElementsCollection cards = internshipInArmeniaPage.getInternshipCards();
        cards.first().shouldNotBe(visible);
        internshipInArmeniaPage.getInternshipBlock().scrollIntoView(false);
        cards.shouldBe(size(5),
                allMatch("Cards is visible", WebElement::isDisplayed));
        internshipInArmeniaPage.getAfterCards().scrollIntoView(false);
        cards.shouldBe(size(8),
                allMatch("Cards is visible", WebElement::isDisplayed));
        internshipInArmeniaPage.getSubtitle().scrollIntoView(true);
        cards.first().shouldNotBe(visible);
    }
}
