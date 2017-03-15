package pages;


import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    public static HomePage openHomePage() {
        open(Configuration.baseUrl);
        return page(HomePage.class);
    }

    public Chapter1 openChapter1() {
        $(".mainbody").find(By.linkText("Chapter1")).click();
        return page(Chapter1.class);
    }
}
