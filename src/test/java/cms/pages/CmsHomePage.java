package cms.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CmsHomePage extends PageObject {

    public void verifyTitle(){
        String title=getDriver().getTitle();
        Assert.assertTrue(title.contains("Log In ‹ opensourcecms — WordPress"));
    }
    public void enterUsernamePassword(){
        //getDriver().findElement(By.id("")); solo para selenium
        $(By.id("user_login")).type("opensourcecms"); //solo con serenity
        $(By.name("pwd")).typeAndEnter("opensourcecms");
    }
    public void verifyLogin(){
        String currentUrl=getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/wordpress/wp-admin/"));
    }
}
