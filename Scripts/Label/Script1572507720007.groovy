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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.login.LoginHelper.loginIntoApplicationWith'()

CustomKeywords.'com.helper.login.LoginHelper.NavigateToProcess'()

WebUI.delay(3)

GlobalVariable.x = CustomKeywords.'random.Common.getRandom'(1, 999999999)

WebUI.delay(1)

WebUI.setText(findTestObject('Label/AccountName'), GlobalVariable.x)

WebUI.verifyElementText(findTestObject('Label/EmptyLabel'), '')

WebUI.verifyElementText(findTestObject('Label/SpeicalCharactersLabel'), '@#$%')

WebUI.verifyElementText(findTestObject('Label/SCLabel'), '中文简体标签')

WebUI.verifyElementText(findTestObject('Label/TCLabel'), '繁體中文憂鬱的烏龜')

WebUI.verifyElementText(findTestObject('Label/JPLabel'), '日本語ラベル')

WebUI.verifyElementText(findTestObject('Label/HBLabel'), 'אחר צהריים טובים')

WebUI.verifyElementText(findTestObject('Label/NumberSpaceLabel'), 'a  23 456')

WebUI.verifyElementText(findTestObject('Label/GlobalDataLabel'), GlobalVariable.sss)

WebUI.verifyElementText(findTestObject('Label/GlobalTranslationKey_Label'), 'Test 1')

WebUI.verifyElementText(findTestObject('Label/LongLabel'), 'Text Box 3Text Box 3Text Box 3Text Box 3Text Box 3Text Box 3Text Box 3Text Box 3')

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/NextButton'))

WebUI.delay(1)

