package stepDefinition;

import org.openqa.selenium.WebElement;

import basement.base;
import basement.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRespository.ackoo;

public class acko
{
	public static ackoo ap=new ackoo();
	public static base ac =base.getInstance();
	@Given("Launch the browser and webpage of acko")
	public void launch_the_browser_and_webpage_of_acko() {
		ac.setup(browser.CHROME,"https://www.acko.com/?utm_source=google&utm_medium=search&utm_campaign=Search_Brand_Acko_Generic_Top8_Chennai&adgroup=Acko_Generic_Exact&utm_content=666438652052&utm_term=acko&utm_device=c&gad_source=1&gclid=CjwKCAjw5Ky1BhAgEiwA5jGujuHb7kwNye5epCmMC6UyhPq7LZEFIwMSHd_WYxMNcLcm10ldLIRKeRoCTfMQAvD_BwE");  
	}

	@When("choose the product in acko")
	public void choose_the_product_in_acko() {
		WebElement prod=ac.element("xpath","//div[@class=\"globalHeader_categorySubWrapper__F1QFm \"]//span[text()=\"Products\"]");
		ac.click(prod);
		ac.implicitwait(10);
	}

	@When("Select the type of insurance in acko")
	public void select_the_type_of_insurance_in_acko() {
		WebElement type=ac.element("xpath","//div[contains(@class,\"globalHeader\")]//a[text()=\"Health Insurance\"]");
		ac.click(type);
	}

	@When("Enter the details in acko")
	public void enter_the_details_in_acko() {
		  ac.windows(1);
			WebElement age=ac.element("xpath","(//input[@class=\"sc-hLseeU aIkEe\"])[3]");
			ac.type(age,"25");
			WebElement phn=ac.element("xpath","(//div[@class='sc-eDDNvR ezQIyz']/following-sibling::input)[2]");
			ac.type(phn,"8072159082");
			WebElement pin=ac.element("xpath","(//input[@class=\"sc-hLseeU aIkEe\"])[4]");
			ac.type(pin,"628002");
			ac.click(ac.element("xpath","(//button[text()=\"Check Prices\"])[last()]"));
	    	}

	@When("Fill the quote in acko")
	public void fill_the_quote_in_acko() throws InterruptedException {
		//WebElement inte=ac.element("xpath", "//div[@class='sc-da8f929f-5 cZRoDr']");
	//	ac.click(inte);
		Thread.sleep(10000);
		WebElement btn=ac.element("xpath", "//button[@class='sc-e2c25667-0 bktJyt']");
		ac.expWait(btn);
		ac.click(btn);
	}
	@Then("Fill the checkout")
	public void fill_the_checkout() throws InterruptedException {
	  WebElement  name=ac.element("xpath", "(//input[@class='sc-32538024-3 jRefIr'])[1]");
	    WebElement  day=ac.element("name","dayInput");
	    ac.scroll(day);
	    ac.type(day,"29");
	    WebElement month=ac.element("name","monthInput");
	    ac.scroll(month);
		ac.type(month,"09");	     
		WebElement year=ac.element("name","yearInput");
	    ac.scroll(year);
	 // ac.scriptInput(year);
	  ac.type(year,"1288");
	  WebElement  email=ac.element("xpath", "//input[@type='email']");
	  ac.type(email, "karthicksubramanian2904@gmail.com");   
	}
}
