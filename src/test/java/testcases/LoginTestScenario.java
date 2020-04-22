package testcases;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTestScenario extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void loginCms(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php/");
        //driver.findElement(By.name("q")).sendKeys("Selenium with Serenity");
        WebElementFacade userLogin=$(By.id("user_login"));
        userLogin.shouldBeVisible();

        userLogin.type("opensourcecms");
        $(By.name("pwd")).typeAndEnter("opensourcecms");
    }
}
