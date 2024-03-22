package papgeobjectivemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ticketbooking {
	
	WebDriver driver;
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement selectbox1;
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement selectbox2;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	WebElement button1;
	
	@FindBy(xpath = "//tbody/tr[3]/td[1]/input[1]")
	WebElement button2;
	public Ticketbooking(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void box(String name) {
		
		Select contry= new Select(selectbox1);
		contry.selectByValue(name);
		
		
	}
	
	
	
	
public void box2(String name2) {
	Select contry= new Select(selectbox2);
	contry.selectByValue(name2);
	
	
}
public void box3()
{
	
	button1.click();
}
public void box4() {
	button2.click();
}
}


