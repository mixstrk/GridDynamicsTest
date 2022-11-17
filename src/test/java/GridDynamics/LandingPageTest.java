package GridDynamics;

import Base.BaseTest;
import GridDynamics.Pages.MainPage;
import GridDynamics.Pages.SearchPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.CollectionCondition.allMatch;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;

public class LandingPageTest extends BaseTest {

    private static final String BASE_URL = "https://www.griddynamics.com/";
    private static final String SEARCH_STRING = "What is Continuous Performance Testing and why it is needed";

    /**
     * Check presence of title on landing page
     */
    @Test
    public void checkTitleLandingPage() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        Titles titles = new Titles();
        String titleExpected = "Global digital engineering company | Grid Dynamics";
        Assertions.assertEquals(titleExpected, titles.getTitleLandingPage());
    }

    /**
     * Check presence of options in "services" (pop-up block) in header block.
     */
    @Test
    public void checkHoverServices() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Services")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection services = mainPage.getHeader();
        services.shouldBe(size(6),
                allMatch("Presence of options in \"services\"", WebElement::isDisplayed));
    }

    /**
     * Check presence of options in "solutions" (pop-up block) in header block.
     */
    @Test
    public void checkHoverSolutions() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Solutions")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection solutions = mainPage.getHeader();
        solutions.shouldBe(size(7),
                allMatch("Presence of options in \"solutions\"", WebElement::isDisplayed));
    }

    /**
     * Check presence of options in "industries" (pop-up block) in header block.
     */
    @Test
    public void checkHoverIndustries() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Industries")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection industries = mainPage.getHeader();
        industries.shouldBe(size(7),
                allMatch("Presence of options in \"industries\"", WebElement::isDisplayed));
    }

    /**
     * Check presence of options in "about" (pop-up block) in header block.
     */
    @Test
    public void checkHoverAbout() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("About")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection about = mainPage.getHeader();
        about.shouldBe(size(3),
                allMatch("Presence of options in \"about\"", WebElement::isDisplayed));
    }

    /**
     * Check no hover on "partnerships".
     */
    @Test
    public void checkHoverPartnerships() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Partnerships")).hover();
        Assertions.assertFalse(mainPage.getPopupBlock().isDisplayed());
    }

    /**
     * Presence of options in "insights" (pop-up block) in header block.
     */
    @Test
    public void checkHoverInsights() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Insights")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection insights = mainPage.getHeader();
        insights.shouldBe(size(11),
                allMatch("Presence of options in \"insights\"", WebElement::isDisplayed));
    }

    /**
     * Presence of options in "careers" (pop-up block) in header block.
     */
    @Test
    public void checkHoverCareers() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Careers")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection careers = mainPage.getHeader();
        careers.shouldBe(size(6),
                allMatch("Presence of options in \"careers\"", WebElement::isDisplayed));
    }

    /**
     * Presence of options in "investors" (pop-up block) in header block.
     */
    @Test
    public void checkHoverInvestors() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getHoverSelect().findBy(text("Investors")).hover();
        Assertions.assertTrue(mainPage.getPopupBlock().should(appear).isDisplayed());
        ElementsCollection investors = mainPage.getHeader();
        investors.shouldBe(size(5),
                allMatch("Presence of options in \"investors\"", WebElement::isDisplayed));
    }

    /**
     * Check navigation keys in header block
     */
    @Test
    public void checkKeysNavigation() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getServices().sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.ENTER);
        Titles titles = new Titles();
        String titleExpected = "Investor relations | Grid Dynamics";
        Assertions.assertEquals(titleExpected, titles.getTitleInvestors());
    }

    /**
     * Presence of subtitle on main page
     */
    @Test
    public void checkSubtitleTheGridEffect() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        Assertions.assertEquals("The Grid Effect", mainPage.getTitleLandingPage().trim());
    }

    /**
     * Presence of clients icons on main page
     */
    @Test
    public void checkClients() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        Assertions.assertEquals("Some of our clients", mainPage.getClients().trim());
        ElementsCollection clients = mainPage.getImgClient();
        clients.shouldBe(size(10),
                allMatch("Presence of clients", WebElement::isDisplayed));
    }

    /**
     * Check search in header block
     */
    @Test
    public void checkSearch() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnButtonSearch();
        mainPage.search(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String firstArticle = searchPage.getFirstArticleTitle();
        Assertions.assertTrue(firstArticle.contains(SEARCH_STRING));
    }

    /**
     * Check click on button "Get in touch" in header block
     */
    @Test
    public void checkClickGetInTouch() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnButtonGetInTouch();
        Titles titles = new Titles();
        Assertions.assertEquals("Contact us | Grid Dynamics", titles.getTitleContactUs());
    }

    /**
     * Check open of dialog window video
     */
    @Test
    public void checkOpenVideo() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.getScrollAfterVideo().scrollIntoView(false);
        SelenideElement dialogWindowVideo = mainPage.getDialogWindowVideo();
        dialogWindowVideo.shouldNotBe(visible);
        mainPage.getVideo().click();
        Selenide.sleep(5000);
        Assertions.assertTrue(dialogWindowVideo.isDisplayed());
        Selenide.sleep(5000);
        dialogWindowVideo.click();
    }

    /**
     * Check click on button menu option.
     * Presence of header in menu options.
     */
    @Test
    public void checkHeaderInSmallWindow() {
        Configuration.browserSize = "1100x900";
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.clickOpenMenu();
        Assertions.assertTrue(mainPage.getMenuOverlayBlock().isDisplayed());
        mainPage.getMenuElements().shouldBe(size(9),
                allMatch("Presence of options in \"menu\"", WebElement::isDisplayed));
    }
}
