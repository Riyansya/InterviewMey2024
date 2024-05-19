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

public class Input {

	public static int waitObject = 30000

	public static byId(String id, String value, boolean clear){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		if(clear) {
			driver.findElement(By.id(id)).clear()
		}
		driver.findElement(By.id(id)).sendKeys(value)
		//Thread.sleep(100)
	}
	public static byClassName(String className, String value, boolean clear){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(className)))
		if(clear) {
			driver.findElement(By.tagName(className)).clear()
		}
		List<WebElement> el = driver.findElements(By.tagName(className))
		el.get(0).findElement(By.tagName("input")).sendKeys(value)
		println(el)
		//Thread.sleep(100)
	}

	public static clearById(String id){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		driver.findElement(By.id(id)).clear()
	}

	public static byName(String name, String value, boolean clear){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
		if(clear) {
			driver.findElement(By.name(name)).clear()
		}

		driver.findElement(By.name(name)).sendKeys(value)
	}

	public static ClearByName(String name){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
		driver.findElement(By.name(name)).clear()
	}

	public static byXpath(String xpath, String value, boolean clear){

		if(xpath.contains("XPATH:")) {
			String[] xpaths =  xpath.split(",")
			xpath = xpaths[0].replace('[XPATH:', '')
		}
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		if(clear) {
			driver.findElement(By.xpath(xpath)).clear()
			Thread.sleep(100)
		}

		driver.findElement(By.xpath(xpath)).sendKeys(value)
		//Thread.sleep(100)
	}

	public static ClearByXpath(String xpath){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		driver.findElement(By.xpath(xpath)).clear()
	}

	public static byTagName(String tagName, String value) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(tagName)))
		driver.findElement(By.tagName(tagName)).sendKeys(value)
		Thread.sleep(100)
	}

	public static attachment(String xpath, String pathFile) {


		WebDriver driver = DriverFactory.getWebDriver()
		//driver.fi

		WebDriverWait wait = new WebDriverWait(driver, waitObject)

		//driver.execute_script("""document.querySelector("div.yourClassNameHere input[type=file]").style.display='block'""")style="display: none;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		driver.findElement(By.xpath(xpath)).sendKeys(pathFile)

	}

	public static dropdownAutoComplete(String xpath, String value) {

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		driver.findElement(By.xpath(xpath)).sendKeys(value)
		Click.arrowDown()
		Click.enterKey()
	}
}


