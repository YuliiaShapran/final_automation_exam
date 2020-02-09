package WeaveSocks;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;


public class Configuration {

    static {
        baseUrl = "http://167.172.110.35/";
    }

    public void checkCurrentUrl(String expectedUrl){
        assertEquals(url(), expectedUrl);
    }


}
