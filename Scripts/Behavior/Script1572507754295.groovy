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

//WebUI.verifyElementAttributeValue(findTestObject('9.Appearance/Font'), 'style', 'font-family: Impact; font-size: 14px; font-weight: bold; font-style: italic; text-decoration: underline; width: 80%;', 
//   1)
//WebUI.verifyElementAttributeValue(findTestObject('9.Appearance/Font'), 'style', 'width: 80%; font-family: Impact; font-size: 14px; font-style: italic; font-weight: bold; text-decoration: underline;', 
  //  1)

WebUI.delay(1)

WebUI.verifyElementNotHasAttribute(findTestObject('Behavior/CheckEnable'), 'disabled', 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/CheckDisable'), 'disabled', 'true', 1)

WebUI.delay(1)

//WebUI.verifyElementAttributeValue(findTestObject('Behavior/RightToLeftChecked'), 'style', 'width: 80%; text-align: right; font-family: Arial; font-size: 12px; font-style: normal; font-weight: normal; text-decoration: none; float: right;', 
  //  1)

//WebUI.verifyElementAttributeValue(findTestObject('Behavior/RightToLeftUnchecked'), 'style', 'width: 80%; font-family: Arial; font-size: 12px; font-style: normal; font-weight: normal; text-decoration: none;', 
  //  1)

//WebUI.verifyElementAttributeValue(findTestObject('Behavior/RightToLeftChecked'), 'style', 'float: right; text-align: right; font-family: Arial; font-size: 12px; font-weight: normal; font-style: normal; text-decoration: none; width: 80%;', 
//    1)
//WebUI.verifyElementAttributeValue(findTestObject('Behavior/RightToLeftUnchecked'), 'style', 'font-family: Arial; font-size: 12px; font-weight: normal; font-style: normal; text-decoration: none; width: 80%;', 
//  1)
WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Behavior/Visible'))

WebUI.verifyElementNotVisible(findTestObject('Behavior/Invisable'))

//WebUI.verifyElementAttributeValue(findTestObject('Behavior/LabelPositionLeft'), 'style', 'width: 25%; font-family: Arial; font-size: 12px; font-style: normal; font-weight: normal; text-decoration: none; float: left;', 
  //  1)

//WebUI.verifyElementAttributeValue(findTestObject('Behavior/LabelPositionTop'), 'style', 'width: 80%; font-family: Arial; font-size: 12px; font-style: normal; font-weight: normal; text-decoration: none;', 
  //  1)

/* WebUI.verifyElementAttributeValue(findTestObject('Behavior/LabelPositionLeft'), 'style', 'float: left; font-family: Arial; font-size: 12px; font-weight: normal; font-style: normal; text-decoration: none; width: 25%;', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/LabelPositionTop'), 'style', 'font-family: Arial; font-size: 12px; font-weight: normal; font-style: normal; text-decoration: none; width: 80%;', 
    1)
    */

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

