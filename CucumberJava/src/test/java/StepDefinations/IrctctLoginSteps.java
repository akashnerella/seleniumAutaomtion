//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import Pages.IrctcLoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class IrctctLoginSteps {
//
//	WebDriver driver = null;
//	IrctcLoginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step- browser is open");
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("project path is :" + projectPath);
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//         
//
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		
//		driver = new ChromeDriver(opt);
//		login = new IrctcLoginPage(driver);
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		System.out.println("Inside Step- browser is close");
//	}
//
//	@And("user is on train search page")
//	public void user_is_on_train_search_page() {
//
//		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
//	}
//
//	@When("user clicks on OK Btn")
//	public void user_clicks_on_ok_btn() {
//		login.clickOkButton();
//	}
//
//	@And("user clicks on the Div Btn")
//	public void user_clicks_on_the_div_btn() {
//		login.clickDivEle();
//	}
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickOnLogin();
//	}
//
//	@And("^user enters(.*)and(.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		login = new IrctcLoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@When("user enters the captcha")
//	public void user_enters_the_captcha() {
//        login.enterCaptcha();
//	}
//
//	@Then("user clicks on the signIn")
//	public void user_clicks_on_the_sign_in() {
//		login.clickSignIn();
//	}
//
//}
