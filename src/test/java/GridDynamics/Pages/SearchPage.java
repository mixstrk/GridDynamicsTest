package GridDynamics.Pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection ARTICLE_TITLES = $$x("//a[@_ngcontent-gd-website-c135]");
    /**
     * Return title of the first article
     */
    public String getFirstArticleTitle() {
        return ARTICLE_TITLES.first().getAttribute("title");
    }
}
