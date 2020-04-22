package cms.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

    CmsHomePage cmsHome;

    @Step("Este paso verificará el título")
    public void verifyTitle(){
        cmsHome.verifyTitle();
    }

    @Step("Este paso permitirá el logín de la aplicación")
    public void enterCredentials(){
        cmsHome.enterUsernamePassword();
    }

    @Step("Este paso verificará el dashboard")
    public void verifyDashboard(){
        cmsHome.verifyLogin();
    }


}
