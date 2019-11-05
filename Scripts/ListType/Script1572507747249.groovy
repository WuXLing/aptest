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

WebUI.click(findTestObject('5.InlineList/Inlist1_Click'))

WebUI.click(findTestObject('5.InlineList/InList1_O1'))

WebUI.click(findTestObject('5.InlineList/Inlist1_Click'))

WebUI.click(findTestObject('5.InlineList/InlineList1'))

WebUI.click(findTestObject('5.InlineList/Inlist1_Click'))

WebUI.click(findTestObject('5.InlineList/InList1_O3'))

WebUI.click(findTestObject('5.InlineList/InList2_Click'))

WebUI.click(findTestObject('5.InlineList/InlineList2'))

WebUI.click(findTestObject('5.InlineList/InList3_Click'))

WebUI.click(findTestObject('5.InlineList/InlineList3'))

WebUI.click(findTestObject('5.InlineList/InList4_Click'))

WebUI.click(findTestObject('5.InlineList/InlineList4'))

WebUI.click(findTestObject('5.InlineList/InList5_Click'))

WebUI.click(findTestObject('5.InlineList/InlineList5'))

WebUI.verifyElementPresent(findTestObject('5.InlineList/InlineList6_VerifyDefault'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('6.PredefinedList/PL_Countries_Click'))

WebUI.click(findTestObject('6.PredefinedList/PreList_Countries'))

WebUI.click(findTestObject('6.PredefinedList/PL_Locale_Click'))

WebUI.click(findTestObject('6.PredefinedList/PreList_Locale'))

WebUI.click(findTestObject('6.PredefinedList/PL_Custom_Click'))

WebUI.click(findTestObject('6.PredefinedList/PreList_Custom'))

WebUI.delay(1)

WebUI.click(findTestObject('7.PickList/PList1_Click'))

WebUI.click(findTestObject('7.PickList/PickList1'))

WebUI.click(findTestObject('7.PickList/PList_Custom_Click'))

WebUI.click(findTestObject('7.PickList/PickList_Custom'))

WebUI.delay(1)

WebUI.click(findTestObject('8.Lookup/Lookup1_DB1_Click'))

WebUI.click(findTestObject('8.Lookup/Lookup_DB1'))

WebUI.click(findTestObject('8.Lookup/Lookup2_DB2_Click'))

WebUI.click(findTestObject('8.Lookup/Lookup_DB2'))

WebUI.click(findTestObject('8.Lookup/Lookup3_DE_Click'))

WebUI.click(findTestObject('8.Lookup/Lookup_DE'))

WebUI.click(findTestObject('8.Lookup/Lookup4_DE2_Click'))

WebUI.click(findTestObject('8.Lookup/Lookup_DE_Custom'))

WebUI.click(findTestObject('8.Lookup/Lookup5_REST_Click'))

WebUI.click(findTestObject('8.Lookup/Lookup_REST'))

//WebUI.click(findTestObject('8.Lookup/Lookup6_WS_Click'))

//WebUI.click(findTestObject('8.Lookup/Lookup_WS'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

