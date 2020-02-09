package WeaveSocks;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    public Login setUsername(String name) {
        $("#username-modal").setValue(name);
        return this;
    }



    public Login setPassword(String name) {
        $("#password-modal").setValue(name);
        return this;
    }

    public void clickSubmitLogin() {
        $(By.xpath("//button[@onclick='return login()']")).click();
    }
}
