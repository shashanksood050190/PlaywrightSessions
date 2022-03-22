package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		
		BrowserContext brxc1= browser.newContext();
		Page p1=brxc1.newPage();
		p1.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		p1.fill("#Form_submitForm_subdomain", "shashank");
		System.out.println(p1.title());
		
		BrowserContext brxc2= browser.newContext();
		Page p2=brxc2.newPage();
		p2.navigate("http://automationpractice.com");
		p2.fill("#search_query_top", "dress");
		System.out.println(p2.title());
		
		BrowserContext brxc3= browser.newContext();
		Page p3=brxc3.newPage();
		p3.navigate("http://google.com");
		System.out.println(p3.title());
		
//		p1.close();
//		brxc1.close();
//		
//		p2.close();
//		brxc2.close();
//		
//		p3.close();
//		brxc3.close();
		

	}

}
