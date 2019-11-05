import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.click(findTestObject('Advanced/Blur_Click'))

WebUI.click(findTestObject('Advanced/Change_Click'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Advanced/Change_Click'))

WebUI.click(findTestObject('Advanced/JS_Change'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Advanced/Persist_Click'))

WebUI.click(findTestObject('Advanced/Persist'))

WebUI.click(findTestObject('Advanced/NotPersist_Click'))

WebUI.click(findTestObject('Advanced/NotPersist'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(2)

