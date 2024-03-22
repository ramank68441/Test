package papgeobjectivemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fulldeatials {
	
	WebDriver driver;
	
	
	@FindBy(id = "inputName")
	WebElement fullname;
	@FindBy(id = "address")
	WebElement add;
	
	@FindBy(id = "city")
	WebElement city;
	
	

	@FindBy(id = "state")
	WebElement state;
	
	
	
	@FindBy(id = "zipCode")
	WebElement zipCode;
	
	@FindBy(id = "cardType")
	WebElement cardType;
	

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumber;
	

	@FindBy(id = "creditCardMonth")
	WebElement creditCardMonth;
	

	@FindBy(id = "creditCardYear")
	WebElement creditCardYear;
	

	@FindBy(id = "nameOnCard")
	WebElement nameOnCard;
	

	@FindBy(id = "rememberMe")
	WebElement rememberMe;
	

	@FindBy(xpath= "//input[@value='Purchase Flight']")
	WebElement Purchase;
	
	public Fulldeatials(WebDriver driver
			) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void name(String username) {
		
		fullname.sendKeys(username);
		
		
	}
		public void addres(String address) {
			
		add.sendKeys(address);
		}
		public void cityname1(String cityname) {
		city.sendKeys(cityname);
		
		}
		public void zipc(int zip) {
			zipCode.sendKeys("123424");
			
		}
	
	
	
	public void card(int cardType1) {
		
		Select card1=new Select(cardType);
		card1.selectByIndex(cardType1);
		
	}
	
	public void cardnum(int num) {
		
		creditCardNumber.sendKeys("12342");
		
	}
	public void namecard1(String namecard) {
		nameOnCard.sendKeys(namecard);
		
	}
	
public void rem() {
	
	rememberMe.click();
	
}
public void purch() {
	Purchase.click();
}
}
