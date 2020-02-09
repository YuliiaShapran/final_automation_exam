package WeaveSocks;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage checkPage() {
        $("h2").shouldHave(Condition.exactText("Hot this week"));
        return this;
    }

    public void loginPage(){
        $(By.xpath("//button[@onclick='return login()']")).click();
    }
}
