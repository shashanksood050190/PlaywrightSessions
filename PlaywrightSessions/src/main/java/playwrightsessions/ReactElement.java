package playwrightsessions;

import com.microsoft.playwright.*;

import java.util.List;

public class ReactElement {

    static Page page;

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate("https://www.netflix.com/ca/");

//        Locator email = page.locator("_react=p[name='email'] >> input").first();
//        email.click();
//        email.fill("shashank@gmail.com");

        page.locator("_react=UISelect[data-uia='language-picker']").click();

        Locator footer = page.locator("_react=UIMarkup[data-uia='data-uia-footer-label']");
//       List<String> footerList = footer.allInnerTexts();
//       for(String e: footerList)
//       {
//           System.out.println(e);
//       }
        footer.allInnerTexts().stream().forEach(e -> System.out.println(e));

    }
}
