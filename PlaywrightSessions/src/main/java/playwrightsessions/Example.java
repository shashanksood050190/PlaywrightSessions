package playwrightsessions;

import com.microsoft.playwright.*;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();

      // Open new page
      Page page = context.newPage();

      // Go to https://academy.naveenautomationlabs.com/
      page.navigate("https://academy.naveenautomationlabs.com/");

      // Click text=Login
      page.click("text=Login");

      // Click button:has-text("Sign Up")
      page.click("button:has-text(\"Sign Up\")");
      
      page.pause();

      // Click [placeholder="Name"]
      page.click("[placeholder=\"Name\"]");

      // Fill [placeholder="Name"]
      page.fill("[placeholder=\"Name\"]", "testingautomation");

      // Click [placeholder="Email"]
      page.click("[placeholder=\"Email\"]");

      // Click #loginFormHtml div:has-text("Sign Up Complete your profile Name * Email * Create Password * Show Must contain")
      page.click("#loginFormHtml div:has-text(\"Sign Up Complete your profile Name * Email * Create Password * Show Must contain\")");

      // Click [placeholder="Email"]
      page.click("[placeholder=\"Email\"]");

      // Fill [placeholder="Email"]
      page.fill("[placeholder=\"Email\"]", "testautomation@gmail.com");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "test123");

      // Click [placeholder="Mobile"]
      page.click("[placeholder=\"Mobile\"]");

      // Fill [placeholder="Mobile"]
      page.fill("[placeholder=\"Mobile\"]", "5145145144");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click #loginFormHtml div [aria-label="Close"]
      page.click("#loginFormHtml div [aria-label=\"Close\"]");
    }
  }
}