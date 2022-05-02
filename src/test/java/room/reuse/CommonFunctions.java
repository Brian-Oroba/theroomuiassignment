package room.reuse;

import org.openqa.selenium.WebDriver;
import room.config.StartBrowser;
import room.objectRepository.HomePage;
import room.wdcmds.ActionDriver;

public class CommonFunctions {

    public WebDriver driver;
    public ActionDriver aDriver;

    public CommonFunctions() {
        driver = StartBrowser.driver;
        aDriver = new ActionDriver();
    }

    public void homePage() throws Exception {
        StartBrowser.childTest = StartBrowser.parentTest.createNode("The room website");
        aDriver.navigateToApplication();
        aDriver.type(HomePage.txtSearch, "TypeScript", "Search Field");
        aDriver.click(HomePage.demoLink, "Click link");
        aDriver.click(HomePage.demoLink1, "Click link");
        aDriver.click(HomePage.demoLink2, "Click link");
        aDriver.click(HomePage.demoLink3, "Click link");
        aDriver.click(HomePage.demoLink4, "Click link");
        aDriver.click(HomePage.demoLink5, "Click link");
        aDriver.click(HomePage.demoLink6, "Click link");
    }

}
