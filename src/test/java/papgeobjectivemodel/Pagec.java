package papgeobjectivemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagec {
	
	WebDriver driver;
	
	
	
	@BeforeTest
	public void ram() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get("https://blazedemo.com/index.php");
	}
	
	@Test(priority=1)
	public void test1() {
		Testcases case1= new Testcases(driver);
		
		case1.ram();
		case1.hyper();
		
	}
	@Test(priority=2)
	public void check() {
		
		Ticketbooking check1=new Ticketbooking(driver);
		check1.box("Mexico City");
		check1.box2("London");
		check1.box3();
		check1.box4();
		
	}
	
	@Test(priority=3)
	public void full() {
		
		
		Fulldeatials check2=new Fulldeatials(driver);
		
		check2.name("kathriki");
		check2.addres("India");
		check2.cityname1("Bengalore");
	check2.zipc(1234);
		check2.card(0);
		check2.cardnum(12342344);
		
		check2.namecard1("kathriki");
		
		check2.rem();
		check2.purch();
	}
	
	@AfterTest
	public void closewindow() {
		driver.quit();
	}
	
}
