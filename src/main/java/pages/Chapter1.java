package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Chapter1 {

    public HomePage openHomePage() {
        $(".mainbody").find(By.linkText("Home Page")).click();
        return page(HomePage.class);
    }

    public SelenideElement getLeftBlock() {
        return $(".leftdiv");
    }
}
