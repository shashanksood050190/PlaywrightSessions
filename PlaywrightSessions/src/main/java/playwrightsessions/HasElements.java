package playwrightsessions;

import com.microsoft.playwright.*;

public class HasElements {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
//        page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
//        Locator loc = page.locator("select#Form_submitForm_Country:has(option[value='India'])");
//        loc.allInnerTexts().forEach(e -> System.out.println(e));

        page.navigate("https://www.amazon.com/");
        Locator footerList = page.locator("div.navFooterLinkCol:has(a[href='https://www.amazon.jobs'])");
        footerList.allInnerTexts().forEach(e -> System.out.println(e));


    }
}
