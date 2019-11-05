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

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverOnLabel_Empty'), 'title', '', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/SpecialHelpText'), 'title', '`~!@#$%^&*()_+{}|:"<>? -= []\\;\',./', 
    1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverOnLabel_SC'), 'title', '阿拉伯忧郁的乌龟', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverOnLabel_TC'), 'title', '阿拉伯憂鬱的烏龜', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverOnField_TC'), 'title', '阿拉伯憂鬱的烏龜', 1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HT_JP'), 'title', 'アラブの憂鬱なカメ', 1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HT_HB'), 'title', 'אחר צהריים טובים', 1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HT_NumberAndSpace'), 'title', '234  567 8', 1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HT_GlobalData'), 'title', GlobalVariable.sss, 1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverOnLabel_GlobalTranslationKey_Label'), 'title', 'Test 1', 
    1)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/Long_HelpText'), 'title', 'This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!This is a long help text!', 
    1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

