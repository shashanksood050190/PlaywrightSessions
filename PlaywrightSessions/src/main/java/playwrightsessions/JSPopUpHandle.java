package playwrightsessions;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class JSPopUpHandle {

    static Page page;

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.onDialog(dialog -> {
            String text = dialog.message();
            System.out.println(text);
            dialog.accept("Hi this is my alert from shashank automation labs");
            //dialog.dismiss();
        });

        //JS Alerts, Prompt, Confirmation pop ups
        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        page.click("//button[text()='Click for JS Alert']");
        String result = page.textContent("#result");
        System.out.println(result);


        page.click("//button[text()='Click for JS Confirm']");
        result = page.textContent("#result");
        System.out.println(result);

        page.click("//button[text()='Click for JS Prompt']");
        result = page.textContent("#result");
        System.out.println(result);

        page.close();
        browser.close();
        playwright.close();

    }
}
