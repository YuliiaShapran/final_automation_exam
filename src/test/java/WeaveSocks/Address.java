package WeaveSocks;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Address {

    public Address setHouseNumber(String name) {
        $("#form-number").setValue(name);
        return this;
    }

    public Address setStreetName(String name) {
        $("#form-street").setValue(name);
        return this;
    }

    public Address setCity(String name) {
        $("#form-city").setValue(name);
        return this;
    }

    public Address setPostCode(String name) {
        $("#form-post-code").setValue(name);
        return this;
    }

    public Address setCountry(String name) {
        $("#form-country").setValue(name);
        return this;
    }

    public void clickUpdateAddress() {
        $(By.xpath("//button[@onclick='return address()']")).click();
    }


}
