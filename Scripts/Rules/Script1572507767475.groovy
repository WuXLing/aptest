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

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Rules/Rule_Show'))

WebUI.click(findTestObject('Rules/Contains_Click'))

WebUI.click(findTestObject('Rules/Contains'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('Rules/NotContain_Click'))

WebUI.click(findTestObject('Rules/NotContain'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Rules/IsEqualTo_Click'))

WebUI.click(findTestObject('Rules/EqualTo'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.verifyElementAttributeValue(findTestObject('Rules/SetField'), 'value', 'SS', 1)

WebUI.delay(1)

WebUI.click(findTestObject('Rules/NotEqualTo_Click'))

WebUI.click(findTestObject('Rules/NotEqualTo'))

WebUI.verifyElementNotHasAttribute(findTestObject('Rules/ChangeToEnabled'), 'disabled', 1)

WebUI.verifyElementAttributeValue(findTestObject('Rules/ChangeToDisabled'), 'disabled', 'true', 1)

WebUI.verifyElementText(findTestObject('Rules/Mandatory'), '*')

WebUI.setText(findTestObject('Rules/MandatoryValue'), 'Mandatory')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Rules/NotMandatory'), '')

WebUI.delay(1)

WebUI.click(findTestObject('Rules/ContainData_Click'))

WebUI.click(findTestObject('Rules/ContainsData'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Rules/AutoLookup'), 1)

//WebUI.delay(1)
//WebUI.click(findTestObject('Rules/MandatoryValue'))
WebUI.delay(1)

WebUI.click(findTestObject('Rules/Submit'))

WebUI.delay(2)

