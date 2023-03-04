package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText = "Register")
	WebElement registerLink;

	@FindBy(partialLinkText = "Log")
	WebElement loginLink;
	
	@FindBy(partialLinkText = "BOOKS")
	WebElement headerBooksLink;

	public void clickRegister() {
		registerLink.click();
	}
	
	public void clickLogin() {
		loginLink.click();
	}
	
}
