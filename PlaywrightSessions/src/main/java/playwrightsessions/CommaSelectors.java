package playwrightsessions;

import com.microsoft.playwright.*;

public class CommaSelectors {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://academy.naveenautomationlabs.com/#");
//        page.locator("a:has-text('LogIn'), " +
//                "a:has-text('SignIn')," +
//                "a:has-text('Signin'), " +
//                "a:has-text('Lognin')").click();

        Locator imp_ele = page.locator("a:has-text('Login'), a:has-text('Courses')");
        System.out.println(imp_ele.count());
        if((imp_ele.count())==3)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }




    }
}
