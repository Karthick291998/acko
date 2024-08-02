package objectRespository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basement.base;

public class ackoo {
	base b=base.getInstance();
	public ackoo()
	{
		PageFactory.initElements(b.driver, this);
	}
	@FindBy(xpath= "//input[@class='sc-32538024-3 jRefIr'])[1]")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	@FindBy(name= "dayInput")
	private WebElement day;
	@FindBy(name= "monthInput")
	private WebElement month;
	@FindBy(name= "yearInput")
	private WebElement year;
	@FindBy(xpath= "//input[@type='email']")
	private WebElement email;
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getEmail() {
		return email;
	}

	
	
	
}
