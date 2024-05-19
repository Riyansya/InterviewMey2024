package mobile

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

public class Calender {
	String path = '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/'

	public setDate(String dateSet) {

		String[] dateSplitSet = dateSet.split("-")
		int tahunSet 	= Integer.parseInt(dateSplitSet[0])
		int bulanSet 	= Integer.parseInt(dateSplitSet[1])
		int tanggalSet 	= Integer.parseInt(dateSplitSet[2])

		Custom xpathObj = new Custom()

		String dateGet = Mobile.getText(findTestObject('Menu/Date/GetCurrentCallender'), 0)

		String[] dateSplit = dateGet.split(" ")
		String bulan = dateSplit[0]
		String year = dateSplit[1]

		int bulanInt = converBulanToInt(bulan)
		boolean yearStatus = false
		if(Integer.parseInt(year) < tahunSet) {
		}

		if(Integer.parseInt(year) > tahunSet) {
		}

		if(bulanInt < bulanSet && yearStatus == false) {

			int clickNext = bulanSet - bulanInt
			for(int next = 0; next < clickNext; next++ ) {
				Mobile.delay(1)
				Mobile.tap(findTestObject('Menu/Date/forward'), 0)
			}
		}

		if (bulanInt > bulanSet && yearStatus == false) {

			int clickBack = bulanSet - bulanInt
			for(int back = 0; back < clickBack; back++ ) {
				Mobile.delay(1)
				Mobile.tap(findTestObject('Menu/Date/Back'), 0)
			}
		}

		clickTanggal(tanggalSet)

		Mobile.tap(findTestObject('Menu/Date/Tab-Ok'), 0)
	}

	public void clickTanggal(int tgl) {
		Custom xpathObj = new Custom()

		for(int i = 1; i<=40; i++) {

			if(Integer.parseInt(Mobile.getText(xpathObj.getByXpath(path+'android.widget.Button['+i+']/android.widget.TextView[1]'),0)) == tgl) {

				Mobile.tap(xpathObj.getByXpath(path+'android.widget.Button['+i.toString()+']'), 0)

				break
			}
		}
	}

	public int converBulanToInt(String bulan) {

		switch(bulan.toUpperCase()) {
			case "JANUARY":
				return 1
				break;
			case "FEBUARY":
				return 2
				break;
			case "MARCH":
				return 3
				break;
			case "APRIL":
				return 4
				break;
			case "MAY":
				return 5
				break;
			case "JUNE":
				return 6
				break;
			case "JULY":
				return 7
				break;
			case "AUGUST":
				return 8
				break;
			case "SEPTEMBER":
				return 9
				break;
			case "OCTOBER":
				return 10
				break;
			case "NOVEMBER":
				return 11
				break;
			case "DECEMBER":
				return 12
				break;
		}
	}
}
