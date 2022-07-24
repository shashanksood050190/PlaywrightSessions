package playwrightsessions;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class NewAuth {

    static Page page;

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brContext =
                browser.newContext(new Browser.NewContextOptions()
                        .setStorageStatePath(Paths.get("applogin.json")));
        Page page = brContext.newPage();
        page.navigate("http://automationpractice.com/");
    }
}
