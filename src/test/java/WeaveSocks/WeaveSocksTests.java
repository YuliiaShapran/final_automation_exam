package WeaveSocks;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class WeaveSocksTests extends Configuration {

    @Test
    public void openLoginPage(){
        open("http://167.172.110.35/");
        $(By.xpath("//li[@id='login']")).shouldBe(Condition.visible).click();
        $(By.xpath("//h4[text()='Customer login']")).shouldBe(Condition.visible);
        Login login = new Login();
        login
                .setUsername("Julia")
                .setPassword("123456")
                .clickSubmitLogin();

        clickCatalogue();
        clickNinePage();
        clickNerdLegPage();
        clickAddNerdLeg();
        clickBasket();
        checkCurrentPage("Shopping cart");
        clickShippingAddressButton();

        Address address = new Address();
        address
                .setHouseNumber("45")
                .setStreetName("Street Cool coll")
                .setCity("Dnipro")
                .setPostCode("3435")
                .setCountry("Ukraine")
                .clickUpdateAddress();

        clickPaymentInfoButton();

        Payment payment = new Payment();
        payment
                .setCardNumber("4435436457567")
                .setExpires("0420")
                .setCvv("123")
                .clickSubmitPaymentInfo();

        clickProceedToCheckoutButton();
        checkCurrentPage("My orders");



    }

    public void clickCatalogue(){
        $(By.xpath("//*[text()='Catalogue ']")).shouldBe(Condition.visible).click();
    }

    public void clickNinePage(){
        $(By.xpath("//a[@onclick='setNewPageSize(9)']")).shouldBe(Condition.visible).click();
    }

    public void clickNerdLegPage(){
        $(By.xpath("//*[text()='Nerd leg']")).shouldBe(Condition.visible).click();
        checkCurrentUrl("http://167.172.110.35/detail.html?id=a0a4f044-b040-410d-8ead-4de0446aec7e");
    }

    public void clickAddNerdLeg(){
        $(By.xpath("//a[@id='buttonCart']")).shouldBe(Condition.visible).click();
    }

    public void clickBasket(){
        $(By.xpath("//span[@id='numItemsInCart']")).shouldBe(Condition.visible).click();
    }

    public void checkCurrentPage(String hintName){
        $("h1").shouldHave(Condition.exactText(hintName));
    }

    public void clickShippingAddressButton(){
        $(By.xpath("//h4[text()='Shipping Address']/following-sibling::p/a")).shouldBe(Condition.visible).click();
    }

    public void clickPaymentInfoButton(){
        $(By.xpath("//h4[text()='Payment']/following-sibling::p/a")).shouldBe(Condition.visible).click();
    }


    public void clickProceedToCheckoutButton(){
        $(By.xpath("//button[@id='orderButton']")).shouldBe(Condition.visible).click();
    }











}
