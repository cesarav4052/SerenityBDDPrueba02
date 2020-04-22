package testcases;

import cms.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginApplicationWithPO {

    @Managed
    WebDriver driver;

    @Steps
    HomePage home;

    @Test
    public void loginAsAdmin(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        home.verifyTitle();
        home.enterCredentials();
        home.verifyDashboard();
    }
}
