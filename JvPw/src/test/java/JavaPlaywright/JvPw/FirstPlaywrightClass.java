package JavaPlaywright.JvPw;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
import java.util.regex.Pattern;


public class FirstPlaywrightClass {

	public static void main(String[] args) throws InterruptedException {

		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = browser.newPage();
		      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		      String title = page.title();
				
				System.out.println(" Title of Page "+title);
				
				String url = page.url();
				System.out.println("Page Url "+url);
		      page.getByPlaceholder("Username").click();
		      page.getByPlaceholder("Username").fill("admin");
		      page.getByPlaceholder("Password").click();
		      page.getByPlaceholder("Password").fill("admin123");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
		      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Test 52 akhil user 2024-22-04")).getByRole(AriaRole.BUTTON).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).click();
		      page.locator("form i").nth(1).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).first().click();
		      page.getByText("6", new Page.GetByTextOptions().setExact(true)).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add")).click();
		      page.locator("form i").first().click();
		      page.locator("form i").first().click();
		      page.locator("form i").first().click();
		      page.getByText("-- Select --").first().click();
		      page.locator("form i").nth(1).click();
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Enabled")).click();
		      page.getByPlaceholder("Type for hints...").click();
		      page.getByPlaceholder("Type for hints...").fill("Mohammed Khaled");
		      page.getByRole(AriaRole.TEXTBOX).nth(3).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(3).fill("password");
		      page.getByRole(AriaRole.TEXTBOX).nth(4).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(4).fill("password");
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^PasswordYour password must contain minimum 1 number$"))).getByRole(AriaRole.TEXTBOX).click();
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^PasswordYour password must contain minimum 1 number$"))).getByRole(AriaRole.TEXTBOX).fill("password1");
		      page.getByRole(AriaRole.TEXTBOX).nth(4).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(4).fill("password1");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
		      page.locator("form i").first().click();
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Admin")).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(2).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(2).fill("mo khaled");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
		      page.getByPlaceholder("Type for hints...").click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
		      page.getByRole(AriaRole.BANNER).getByText("Test 52 user").click();
		      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
		      browser.close();
				playwright.close();
		      
		    }
		  }
		
		
		//Thread.sleep(5000);
		
	}
	
	

