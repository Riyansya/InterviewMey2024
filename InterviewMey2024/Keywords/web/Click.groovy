package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList

public class Click {


	public static int waitObject = 60000



	public static byId(String id){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		driver.findElement(By.id(id)).click()
	}

	public static byXpath(String xpath){


		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		driver.findElement(By.xpath(xpath)).click()
	}
	public static byXpathCanvas(String xpath){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		element.click()
	}

	public static byName(String name){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
		WebElement element = driver.findElement(By.name(name)).click()
	}

	public static moveById(String id){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		WebElement element =  driver.findElement(By.id(id))
		driver.switchTo().frame(element)
	}

	public static byAttribute(String byAtribute){


		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(byAtribute)))
		driver.findElement(By.tagName(byAtribute)).click()
	}

	public static byTagName(String byTagName){


		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(byTagName)))
		driver.findElement(By.tagName(byTagName)).click()
	}

	public static enterKey() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(1000)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ENTER).build().perform()
		Thread.sleep(500)
	}

	public static pageUp() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.PAGE_UP).build().perform()
	}

	public static pageDown() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.PAGE_DOWN).build().perform()
	}

	public static arrowUp() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ARROW_UP).build().perform()
	}

	public static arrowDown() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ARROW_DOWN).build().perform()
	}

	public static arrowRight() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ARROW_RIGHT).build().perform()
	}

	public static arrowLeft() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ARROW_LEFT).build().perform()
	}

	public static backSpace() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.BACK_SPACE).build().perform()
	}
	public static escape() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		action.sendKeys(Keys.ESCAPE).build().perform()
	}
	public static back() {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		Thread.sleep(500)
		Actions action = new Actions(driver)
		//action.sendKeys(Keys.MULTIPLY.ALT.ARROW_LEFT).build().perform()
		action.sendKeys(Keys.BACK_SPACE).build().perform()
	}

	public static int countRow(String xpath) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		WebElement element = driver.findElement(By.xpath(xpath))
		List<WebElement> el = element.findElements(By.className('MuiPickersCalendar-week'))
		return el.size()
	}
}

