package hooks;

import org.openqa.selenium.OutputType;

import basement.base;
import basement.browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook {
	public static base b=base.getInstance();
	@Before
	public void launchbrowser(Scenario scenario)
	{
		b.setup(browser.CHROME);
	}
	@After
	public void closebrowser(Scenario scenario)
	{
	b.finish();
	}
}
