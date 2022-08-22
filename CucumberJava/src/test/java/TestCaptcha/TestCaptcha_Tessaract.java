//package TestCaptcha;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//
//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;
//
//public class TestCaptcha_Tessaract {
//	
//	WebDriver driver;
//	
//	public static void main(String[] args) {
//		try {
//			String projectPath = System.getProperty("user.dir");
//			System.out.println("project path is :" + projectPath);
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//
//			WebDriver driver1 = new ChromeDriver();
//			System.getProperty("webdriver.chrome.driver");
//			driver1.manage().window().maximize();
//
//			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			driver1.get("https://www.irctc.co.in/nget/train-search");
//
//			driver1.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
//
//			driver1.findElement(By.xpath("//app-header/div[1]/div[2]/a[1]/i[1]")).click();
//			driver1.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
//					
//			WebElement imageelement = driver1.findElement(By.id("nlpRefCnt"));
//
//			File src = imageelement.getScreenshotAs(OutputType.FILE);
//
//			String path ="C:\\Users\\akashnerella\\Documents\\java\\CucumberJava\\captchaimages";
//
//			FileHandler.copy(src, new File(path));
//
//			Thread.sleep(2000);
//			
//			ITesseract image = new Tesseract();
//			
//			String str = image.doOCR(new File(path));
//			
//			System.out.println("image OCR done");
//			System.out.println(str);
//
//			String Captcha = str.split("below")[1].replaceAll("[a-zA-Z0-9]", "");
//
//			System.out.println(Captcha);
//
//			driver1.findElement(By.id("nlpAnswer")).sendKeys(Captcha);
//
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("ecxeption caught :" +e.getMessage());
//		}
//		
//	};
//};
