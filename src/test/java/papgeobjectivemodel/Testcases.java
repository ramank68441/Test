package papgeobjectivemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Testcases {
	WebDriver driver;
	
	
	@FindBy(xpath = "//h1[text()='Welcome to the Simple Travel Agency!']")
	
	WebElement actualTitle;
	
	@FindBy(xpath = "//a[text()='destination of the week! The Beach!']")
	WebElement hyperlink;
	
	
	
	public Testcases(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	public void ram() {
		
		
		String expectedTitle=
				actualTitle.getText();
				
		
		
		Assert.assertEquals("Welcome to the Simple Travel Agency!",expectedTitle );
		
	}
	public void hyper() {
		
		hyperlink.click();
		driver.navigate().back();
	}
	

}
