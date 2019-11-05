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

CustomKeywords.'com.helper.login.LoginHelper.OpenTask'()

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Label/FormData_VariableLabel'), 'TestFormDataValue')

WebUI.verifyElementText(findTestObject('Label/DataSource_VariableLabel'), GlobalVariable.x)

WebUI.verifyElementText(findTestObject('Label/ModelDate_VariableLable'), 'Test Model Data')

WebUI.verifyElementText(findTestObject('Label/SystemData_VariableLabel'), GlobalVariable.ApplicationName)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/FormData_HelpText'), 'title', 'TestFormDataValue', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/ModelData_HelpText'), 'title', 'Test Model Data', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/DataSource_HelpText'), 'title', GlobalVariable.x, 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/SystemData_HelpText'), 'title', GlobalVariable.ApplicationName, 
    1)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('4.Mandatory/M_Default_Value'), 'Option 2')

WebUI.verifyElementText(findTestObject('4.Mandatory/M_SC_Value'), 'Option 2')

WebUI.verifyElementText(findTestObject('4.Mandatory/M_JP_Value'), 'Option 2')

WebUI.verifyElementText(findTestObject('4.Mandatory/M_Global_Value'), 'Option 2')

WebUI.verifyElementPresent(findTestObject('4.Mandatory/VerifyCustom'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList1_Monday'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList1_Tuesday'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList1_Tuesday'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList2_Dog'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList3_Blue'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList4_Three'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InList5_bbb'), 1)

WebUI.verifyElementPresent(findTestObject('5.InlineList/InlineList6_VerifyDefault'), 1)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('6.PredefinedList/PL_China'), 1)

WebUI.verifyElementPresent(findTestObject('6.PredefinedList/PL_Locale_Value'), 1)

WebUI.verifyElementPresent(findTestObject('6.PredefinedList/PL_Custom_Value'), 1)

WebUI.verifyElementPresent(findTestObject('7.PickList/PList_Standard_Value'), 1)

WebUI.verifyElementPresent(findTestObject('7.PickList/PL_Custom_Value'), 1)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup1_Value'), 1)

WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup2_Value'), 1)

WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup3_Value'), 1)

WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup4_Value'), 1)

WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup5_Value'), 1)

//WebUI.verifyElementPresent(findTestObject('8.Lookup/Lookup6_Value'), 1)
WebUI.delay(1)

WebUI.click(findTestObject('Behavior/Advanced Tab'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Advanced/Persist_Value'), 'Option 2')

WebUI.verifyElementNotPresent(findTestObject('Advanced/NotPersist_Value'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

WebUI.click(findTestObject('Rules/Redirect_Click'))

WebUI.click(findTestObject('Rules/Redirect_AfterSubmit'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/SubmitForm'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Rules/BaiduPage'), 1)

WebUI.closeBrowser()

