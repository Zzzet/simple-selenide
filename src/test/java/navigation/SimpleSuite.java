package navigation;

import org.testng.annotations.Test;
import pages.Chapter1;
import pages.HomePage;

import static com.codeborne.selenide.Condition.text;

public class SimpleSuite {

    @Test
    public void goToChapter1() {
        HomePage homePage = HomePage.openHomePage();
        Chapter1 chapter1 = homePage.openChapter1();
        chapter1.getLeftBlock().shouldHave((text("Assert that this text is on the page")));
        chapter1.openHomePage();
    }


}
