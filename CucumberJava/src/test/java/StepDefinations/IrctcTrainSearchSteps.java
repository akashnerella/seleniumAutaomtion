package StepDefinations;

import io.cucumber.java.en.And;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.IrctcTrainSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IrctcTrainSearchSteps {

	WebDriver driver = null;
	IrctcTrainSearch search;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("project path is :" + projectPath);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		driver = new ChromeDriver(opt);
		search = new IrctcTrainSearch(driver);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("Inside Step- browser is close");
	}

	@And("user is on train search page")
	public void user_is_on_train_search_page() {
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("user clicks on OK Btn")
	public void user_clicks_on_ok_btn() {
		search.clickOkButton();
	}

	@And("^user enters(.*)and(.*)")
	public void user_enters_From_and_To(String From, String To) {
		search = new IrctcTrainSearch(driver);
		search.enterFromStation(From);
		search.enterToStation(To);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("user enters journey date")
	public void user_enters_journey_date() {
		search.selectJourneyDate();
		// search.selectJourneyDate(exDay, exMonth, exYear);
		// search.selectJourneyDate("20", "August", "2022");
	}

	@And("user selects the journey class")
	public void user_selects_the_journey_class() {
		search.selectJourneyClass();
	}

	@Then("user clicks on the search Button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
		//search.highlightElement();
		search.clickOnSearchButton();
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}

}

//@Given("browser is open")
//public void browser_is_open() {
//
//	System.out.println("Inside Step- browser is open");
//
//	String projectPath = System.getProperty("user.dir");
//	System.out.println("project path is :" + projectPath);
//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//
//	ChromeOptions opt = new ChromeOptions();
//	opt.addArguments("--disable-notifications");
//
//	driver = new ChromeDriver(opt);
//	search = new IrctcTrainSearch(driver);
//	driver.manage().window().maximize();
//
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	System.out.println("Inside Step- browser is close");
//}
//
//@And("user is on train search page")
//public void user_is_on_train_search_page() {
//	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
//}
//
//@When("user clicks on OK Btn")
//public void user_clicks_on_ok_btn() {
//	search.clickOkButton();
//}
//
//@And("^user enters(.*)and(.*)")
//public void user_enters_the_from_and_To_and_date(String From, String To) {
//	search = new IrctcTrainSearch(driver);
//	search.enterFromStation(From);
//	search.enterToStation(To);
//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	
//}
//
//@When ("user enters journey date")
//public void user_enters_journy_date(String exDay, String exMonth, String exYear) {
//	System.out.print("rrrrrr");
//	search.selectJourneyDate("20","August", "2022");
//}
//
//@And("user selects the journey class")
//public void user_selects_the_journey_class() {
//	search.selectJourneyClass();
//}
//
//@Then("user clicks on the search Button")
//public void user_clicks_on_the_search_button() {
//	search.clickOnSearchButton();
//}
//
