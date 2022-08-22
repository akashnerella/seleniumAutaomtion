//package Pages;
//
//import java.io.File;
////import java.util.logging.FileHandler;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.io.FileHandler;
//
//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
//
//public class IrctcLoginPage {
//
//	WebDriver driver;
//	
//	By ok_btn = By.xpath("//button[contains(text(),'OK')]");
//	By div_ele = By.xpath("//app-header/div[1]/div[2]/a[1]/i[1]");
//	By login_btn = By.xpath("//button[contains(text(),'LOGIN')]");
//	By usr_name = By.xpath(
//			"/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]");
//	By txt_password = By.xpath(
//			"/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/input[1]");
//	By txt_captcha = By.xpath("//input[@id='nlpAnswer']");
//	By txt_signIn = By.xpath("//button[contains(text(),'SIGN IN')] ");
//
//	public IrctcLoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	public void clickOkButton() {
//		driver.findElement(ok_btn).click();
//	}
//
//	public void clickDivEle() {
//		driver.findElement(div_ele).click();
//	}
//
//	public void clickOnLogin() {
//		driver.findElement(login_btn).click();
//	}
//
//	public void enterUsername(String username) {
//		driver.findElement(usr_name).sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void enterCaptcha() {
//		
//		try {
//           
//			WebElement imageelement = driver.findElement(By.id("//img[@id='nlpCaptchaImg']"));
//			File src = imageelement.getScreenshotAs(OutputType.FILE);
//			String path = "C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\captchaimages\\captcha.png";
//
//			FileHandler.copy(src, new File(path));
//			
//			Thread.sleep(2000);
//
//			ITesseract image = new Tesseract();
//			
//			image.setDatapath("C:\\Users\\akashnerella\\Downloads\\tessdataa");
//
//			String str = image.doOCR(new File(path));
//
//			System.out.println("image OCR done");
//
//			System.out.println(str);
//
//			String Captcha = str.split("Below")[1].replaceAll("[a-zA-Z0-9]", "");
//
//			System.out.println(Captcha);
//
//			driver.findElement(By.xpath(
//					"//input[@id='captcha']"))
//					.sendKeys(Captcha);
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void clickSignIn() {
//		driver.findElement(txt_signIn).click();
//	}
//
//}
