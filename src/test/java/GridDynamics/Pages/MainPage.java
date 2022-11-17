/*
Main page of web-site griddynamics
 */
package GridDynamics.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement TEXT_TITLE = $x("//h2[contains(text(), 'The Grid Effect')]");
    private final ElementsCollection HEADER_SECTION_BLOCK = $$x("//li[@class='section-block ng-tns-c27-2 ng-star-inserted']");
    private final SelenideElement POPUP_BLOCK = $x("//div[@class='popup-block ng-tns-c27-2 ng-star-inserted']");
    private final ElementsCollection OPTIONS_OF_HEADER = $$x("//span[@class='link-label ng-tns-c27-2']");
    private final SelenideElement TEXT_CLIENTS = $x("//h2[contains(text(), 'Some of our clients')]");
    private final ElementsCollection IMG_CLIENTS = $$x("//div[@class='tile ng-star-inserted']");
    private final SelenideElement SEARCH_BUTTON = $x("//button[@class='search-toggle ng-star-inserted']");
    private final SelenideElement SEARCH_FORM = $x("//input[@type='text']");
    private final SelenideElement GET_IN_TOUCH_BUTTON = $x("//span[@class='ui-button-wrapper ui-button-block ng-tns-c18-3 ng-trigger ng-trigger-fadeInOut']");
    private final SelenideElement SCROLL_AFTER_VIDEO = $x("//h2[text()=' Learn to grow ']");
    private final SelenideElement VIDEO = $x("//ng-carousel[@class='video-carousel ng-star-inserted']");
    private final SelenideElement DIALOG_WINDOW_VIDEO = $x("//div[@class='youtube-video-dialog']");
    private final SelenideElement PLAY_VIDEO = $x("//button[@aria-label='Воспроизведение']");
    private final SelenideElement PAUSE_VIDEO = $x("//button[@aria-label='Пауза']");

    private final SelenideElement SERVICES = $x("//a[@class='section-button link ng-tns-c27-2 ng-star-inserted']");
    private final SelenideElement OPEN_MENU_HEADER_BUTTON = $x("//img[@class='toggle-icon burger']");
    private final SelenideElement MENU_OVERLAY_BLOCK = $x("//div[@class='overlay-block']");
    private final ElementsCollection MENU_ELEMENTS = $x("//ul[@class='items-menu ng-star-inserted']").findAll(By.xpath("li"));

    public void openWebSite(String url) {
        Selenide.open(url);
    }

    public String getTitleLandingPage() {
        return TEXT_TITLE.innerText();
    }

    public ElementsCollection getHoverSelect() {
        return HEADER_SECTION_BLOCK;
    }

    public SelenideElement getPopupBlock() {
        return POPUP_BLOCK;
    }

    public ElementsCollection getHeader() {
        return OPTIONS_OF_HEADER;
    }

    public SelenideElement getServices() {
        return SERVICES;
    }

    public String getClients() {
        return TEXT_CLIENTS.innerText();
    }

    public ElementsCollection getImgClient() {
        return IMG_CLIENTS;
    }


    public void clickOnButtonSearch() {
        SEARCH_BUTTON.click();
    }

    public void search(String searchString) {
        SEARCH_FORM.setValue(searchString);
        SEARCH_FORM.sendKeys(Keys.ENTER);
    }

    public void clickOnButtonGetInTouch() {
        GET_IN_TOUCH_BUTTON.click();
    }

    public SelenideElement getScrollAfterVideo() {
        return SCROLL_AFTER_VIDEO;
    }

    public SelenideElement getVideo() {
        return VIDEO;
    }

    public SelenideElement getDialogWindowVideo() {
        return DIALOG_WINDOW_VIDEO;
    }

    public SelenideElement getPlayVideo() {
        return PLAY_VIDEO;
    }

    public SelenideElement getPauseVideo() {
        return PAUSE_VIDEO;
    }

    public void clickOpenMenu() {
        OPEN_MENU_HEADER_BUTTON.click();
    }

    public SelenideElement getMenuOverlayBlock() {
        return MENU_OVERLAY_BLOCK;
    }

    public ElementsCollection getMenuElements() {
        return MENU_ELEMENTS;
    }
}