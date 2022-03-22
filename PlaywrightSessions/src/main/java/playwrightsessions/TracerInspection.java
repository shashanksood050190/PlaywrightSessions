package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TracerInspection {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      
      context.tracing().start(new Tracing.StartOptions()
    		  .setScreenshots(true)
    		  .setSnapshots(true));

      // Open new page
      Page page = context.newPage();

      // Go to https://academy.naveenautomationlabs.com/
      page.navigate("https://academy.naveenautomationlabs.com/");

      // Click text=Store
      page.click("text=Store");
      // assert page.url().equals("https://academy.naveenautomationlabs.com/s/store");

      // Click text=Login
      page.click("text=Login");

      // Click button:has-text("Sign Up")
      page.click("button:has-text(\"Sign Up\")");

      // Click [placeholder="Name"]
      page.click("[placeholder=\"Name\"]");

      // Fill [placeholder="Name"]
      page.fill("[placeholder=\"Name\"]", "shashank");

      // Click [placeholder="Email"]
      page.click("[placeholder=\"Email\"]");

      // Fill [placeholder="Email"]
      page.fill("[placeholder=\"Email\"]", "shashank@gmail.com");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "test12345");

      // Click text=+1
      page.click("text=+1");

      // Click :nth-match(:text("+91"), 2)
      page.click(":nth-match(:text(\"+91\"), 2)");

      // Click [placeholder="Mobile"]
      page.click("[placeholder=\"Mobile\"]");

      // Fill [placeholder="Mobile"]
      page.fill("[placeholder=\"Mobile\"]", "1234567890");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click #loginFormHtml div [aria-label="Close"]
      page.click("#loginFormHtml div [aria-label=\"Close\"]");

      // Click text=Login
      page.click("text=Login");
      
      context.tracing().stop(new Tracing.StopOptions()
    		  .setPath(Paths.get("trace.zip")));
    }
  }
}