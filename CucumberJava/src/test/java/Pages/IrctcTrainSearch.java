package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcTrainSearch {
	WebDriver driver;

	By ok_btn = By.xpath("//button[contains(text(),'OK')]");
	By from_station = By.xpath(
			"//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]");
	By to_station = By.xpath(
			"//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[1]/div[2]/p-autocomplete[1]/span[1]/input[1]");
	By journey_date = By.xpath("//p-calendar[@id='jDate']");
	By journey_class = By.xpath("//span[contains(text(),'Sleeper (SL)')]");
	// By search_btn = By.xpath("//button[contains(text(),'Search')]");
	By search_btn = By.xpath(".//button[@class='search_btn train_Search']");

	public IrctcTrainSearch(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOkButton() {
		driver.findElement(ok_btn).click();
	}

	public void enterFromStation(String From) {
		driver.findElement(from_station).sendKeys(From);

	}

	public void enterToStation(String To) {
		driver.findElement(to_station).sendKeys(To);

	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	public void selectJourneyDate() {

		driver.findElement(By.xpath(
				"//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[2]/div[1]/p-calendar[1]/span[1]/input[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
//		System.out.print("1" + exDay);
//		selectJourneyDate("21", "August", "2022");
//
//		if (exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
//			System.out.println("wrong date:" + exMonth + " : " + exDay);
//			return;
//		}
//
//		if (Integer.parseInt(exDay) > 31) {
//			System.out.println("wrong date:" + exMonth + " : " + exDay);
//		}
//
//		driver.findElement(By.xpath("//p-calendar[@id='jDate']")).click();
//
//		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
//				.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar ng-tns-c58-10")));
//
//		String monthYearVal = driver.findElement(By.className("ui-datepicker-title ng-tns-c58-10")).getText();
//
//		System.out.print(monthYearVal);
//
//		String month = monthYearVal.split(" ")[0].trim();
//		String year = monthYearVal.split(" ")[1].trim();
//
//		while (!(getMonthYear(monthYearVal)[0].equals(exMonth) && getMonthYear(monthYearVal)[1].equals(exYear))) {
//			driver.findElement(By.className("ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10")).click();
//			monthYearVal = driver.findElement(By.className("ui-datepicker-title ng-tns-c58-10")).getText();
//		}
//
//		driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
//		// driver.findElement(journey_date).sendKeys(Date);
	}

	public void selectJourneyClass() {
		driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'AC First Class (1A)')]")).click();
	}

	public void highlightElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: #90ee90; border: 2px solid yellow;');",
				driver.findElement(search_btn));
	}

	public void clickOnSearchButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(search_btn));
		//driver.findElement(search_btn).click();

	}

}
