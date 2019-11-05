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

WebUI.click(findTestObject('AgilePointNX Metadata/SubmitForm'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/CloseError'))

WebUI.verifyElementText(findTestObject('4.Mandatory/NotMandatory'), '')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('4.Mandatory/Mandatory_Default_Message'), 'Choose Options from the M_Default')

WebUI.delay(1)

WebUI.click(findTestObject('4.Mandatory/M_Default_Click'))

WebUI.click(findTestObject('4.Mandatory/Mandatory_Default'))

WebUI.verifyElementText(findTestObject('4.Mandatory/Mandatory_SC_Message'), '请在 M_SC选择一个选项')

WebUI.click(findTestObject('4.Mandatory/M_SC_Click'))

WebUI.click(findTestObject('4.Mandatory/Mandatory_SC'))

WebUI.verifyElementText(findTestObject('4.Mandatory/Mandatory_JP_Message'), 'オプションを選択してください')

WebUI.click(findTestObject('4.Mandatory/M_JP_Click'))

WebUI.click(findTestObject('4.Mandatory/Mandatory_JP'))

WebUI.verifyElementText(findTestObject('4.Mandatory/Mandatory_GlobalData_Message'), GlobalVariable.sss)

WebUI.click(findTestObject('4.Mandatory/M_Global_Click'))

WebUI.click(findTestObject('4.Mandatory/Mandatory_GlobalData'))

WebUI.delay(1)

WebUI.setText(findTestObject('4.Mandatory/AcceptCustomValue'), 'efg')

WebUI.click(findTestObject('4.Mandatory/Accept_Label'))

WebUI.verifyElementPresent(findTestObject('4.Mandatory/VerifyCustom'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

