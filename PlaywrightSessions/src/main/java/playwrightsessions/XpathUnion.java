package playwrightsessions;

import com.microsoft.playwright.*;

public class XpathUnion {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://academy.naveenautomationlabs.com/#");

        Locator login = page.locator("//a[text()='Login'] | //a[text()='Signin']");
        System.out.println(login.textContent());
                login.click();






    }
}
