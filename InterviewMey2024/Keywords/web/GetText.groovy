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

public class GetText {
	public static int waitObject = 30000;

	public String byId(String id){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		String data = driver.findElement(By.id(id)).getText()
		//Thread.sleep(100)
		return data
	}
	public String byIdValue(String id){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
		String data = driver.findElement(By.id(id)).getAttribute('value')
		//Thread.sleep(100)
		return data
	}

	public String byXpath(String xpath){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		String data = driver.findElement(By.xpath(xpath)).getText()
		//Thread.sleep(100)
		return data
	}

	public String byName(String name){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
		String data = driver.findElement(By.name(name)).getText()
		//Thread.sleep(100)
		return data
	}

	public String byXpathValue(String xpath){

		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, waitObject)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		String data = driver.findElement(By.xpath(xpath)).getAttribute('value')
		//Thread.sleep(100)
		return data
	}
}
