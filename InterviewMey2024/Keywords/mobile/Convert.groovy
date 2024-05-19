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

public class Convert {

	public String convertDate(String date) {

		String[] splitDate = date.split("-")

		int m = Integer.parseInt(splitDate[1])
		String ms = intToStringMouth(m)
		String[] th = splitDate[0]

		return splitDate[2]+" "+ms+" "+th[2]+th[3]
	}

	public int calculateTotalLeave(String startDate, String endDate) {

		String[] splitStartDate = startDate.split("-")
		String[] splitEndDate = endDate.split("-")
		int leaveDays = 0
		if(Integer.parseInt(splitStartDate[0]) < Integer.parseInt(splitEndDate[0])) {
			//ddd
		}else {

			if(Integer.parseInt(splitStartDate[1]) == Integer.parseInt(splitEndDate[1]) ) {
				leaveDays = (Integer.parseInt(splitEndDate[2]) - Integer.parseInt(splitStartDate[2])) +1
			}
		}

		return leaveDays
	}



	private String intToStringMouth(int m) {

		String ms = ''

		switch(m) {
			case 1 :
				ms = "Jan"
				break;
			case 2:
				ms = "Feb"
				break;
			case 3 :
				ms = "Mar"
				break;
			case 4:
				ms = "Apr"
				break;
			case 5 :
				ms = "May"
				break;
			case 6:
				ms = "Jun"
				break;
			case 7:
				ms = "Jul"
				break;
			case 8:
				ms = "Aug"
				break;
			case 9:
				ms = "Sep"
				break;
			case 10:
				ms = "Oct"
				break;
			case 11:
				ms = "Nov"
				break;
			case 12:
				ms = "Dec"
				break;
		}
		return ms;
	}
}
