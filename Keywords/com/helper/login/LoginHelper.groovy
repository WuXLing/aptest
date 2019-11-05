package com.helper.login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.Variable
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LoginHelper {

	@Keyword
	public void loginIntoApplication(String ApplicationUrl, String Domain, String Username, String Password){

		WebUI.openBrowser(ApplicationUrl)
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies()
		WebUI.setText(findTestObject('AgilePointNX Metadata/Domain'), Domain)
		WebUI.setText(findTestObject('AgilePointNX Metadata/UserName'), Username)
		WebUI.setEncryptedText(findTestObject('AgilePointNX Metadata/Password'), Password)
		WebUI.click(findTestObject('AgilePointNX Metadata/SubmitButton'))
		WebUI.waitForPageLoad(GlobalVariable.Timeout)
	}

	@Keyword
	public void loginIntoApplicationWith(){
		loginIntoApplication(GlobalVariable.ApplicationURL, GlobalVariable.Domain, GlobalVariable.UserName, GlobalVariable.Password)
	}

	@Keyword
	public void loginIntoApplicationWithAccount(){
		loginIntoApplication(GlobalVariable.ApplicationURL, GlobalVariable.Domain, GlobalVariable.AccountTeam, GlobalVariable.Password)
	}

	@Keyword
	public void loginIntoApplicationWithService(){
		loginIntoApplication(GlobalVariable.ApplicationURL, GlobalVariable.Domain, GlobalVariable.ServiceTeam, GlobalVariable.Password)
	}

	@Keyword
	public void loginIntoApplicationWithCustomer(){
		loginIntoApplication(GlobalVariable.ApplicationURL, GlobalVariable.Domain, GlobalVariable.CustomerService, GlobalVariable.Password)
	}

	@Keyword
	public void NavigateToProcess(){
		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnWorkCenter'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.mouseOver(findTestObject('AgilePointNX Metadata/ClickOnMyApplication'))

		WebUI.waitForElementClickable(findTestObject('AgilePointNX Metadata/ClickOnMyApplication'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnMyApplication'))

		WebUI.delay(1)

		WebUI.switchToFrame(findTestObject('AgilePointNX Metadata/SwitchToMyApplicationFrame'), GlobalVariable.Timeout)

		WebUI.delay(1)

		WebUI.setText(findTestObject('AgilePointNX Metadata/SearchApplication'), GlobalVariable.ApplicationName)

		WebUI.mouseOver(findTestObject('AgilePointNX Metadata/SelectProcessFromMyApps'))

		WebUI.delay(1)

		WebUI.click(findTestObject('AgilePointNX Metadata/SelectProcessFromMyApps'))

		WebUI.switchToWindowIndex(1)

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(2)
	}

	@Keyword
	public void OpenTask(){
		WebUI.switchToWindowIndex(0)

		WebUI.switchToDefaultContent()

		WebUI.delay(5)

		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnInbox'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(1)

		WebUI.switchToFrame(findTestObject('AgilePointNX Metadata/SwitchToMyTaskFrame'), 1)

		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnMyTaskTab'))

		WebUI.delay(2)

		 WebUI.click(findTestObject('AgilePointNX Metadata/ClickFilter'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('AgilePointNX Metadata/SelectApplication'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('AgilePointNX Metadata/SelectApplicationName'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('AgilePointNX Metadata/ClickApply_Filter'))
		 WebUI.delay(1)
		 

		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnTaskMenu'))

		WebUI.delay(1)

		/* WebUI.switchToWindowTitle('DEFAULTTENANT - Work Center')
		 WebUI.delay(1)
		 WebUI.click(findTestObject('AgilePointNX Metadata/OpenTask'))
		 */

		WebUI.switchToWindowIndex(1)

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(1)
	}


	@Keyword
	public void logoutFromApplication(){
		WebUI.switchToWindowIndex(0)
		WebUI.switchToDefaultContent()
		WebUI.delay(1)
		WebUI.click(findTestObject('AgilePointNX Metadata/ClickOnSignInUser'))
		WebUI.click(findTestObject('AgilePointNX Metadata/SignOut'))
		WebUI.closeBrowser()
	}
}
