package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class LoginPageObject extends TestBase{

	public LoginPageObject() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement userNameField;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement passwordField;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement loginButton;

	

}
