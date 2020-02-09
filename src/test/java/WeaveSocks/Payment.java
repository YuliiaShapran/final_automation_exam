package WeaveSocks;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Payment {

    public Payment setCardNumber(String name) {
        $("#form-card-number").setValue(name);
        return this;
    }


    public Payment setExpires(String name) {
        $("#form-expires").setValue(name);
        return this;
    }

    public Payment setCvv(String name) {
        $("#form-ccv").setValue(name);
        return this;
    }

    public void clickSubmitPaymentInfo() {
        $(By.xpath("//button[@onclick='return card()']")).click();
    }
}
