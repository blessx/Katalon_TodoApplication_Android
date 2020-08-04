import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger
import com.google.common.collect.ImmutableMap as ImmutableMap



Mobile.comment('Story: Verify if validation messages for each field will show up when the fields are empty')
Mobile.comment
'Start application on current selected android\'s device'
Mobile.startApplication(GlobalVariable.G_AndroidApp, false)


'Verify App control is presented in 10 seconds timeout'
Mobile.verifyElementExist(findTestObject('LoginScreen/loginScreenTitleText'),10)


'To change the screen into Register screen'
Mobile.tap(findTestObject('SignupScreen/btnToRegisterScreen'), 10)

'Tap Register button without inputting to fields'
Mobile.tap(findTestObject('SignupScreen/btnToSignUp'), 10)

Mobile.comment('To check validation messages on each input fields')
'To get name field error message'
def nameMsg = Mobile.getText(findTestObject('SignupScreen/validationMsgNameField'), 10)
'Verify if displayed message is correct'
Mobile.verifyEqual(nameMsg, 'Name is required.')

'To get email field error message'
def emailMsg = Mobile.getText(findTestObject('SignupScreen/validationMsgEmailField'), 10)
'Verify if displayed message is correct'
Mobile.verifyEqual(emailMsg, 'Email is required.')

'To get password field error message'
def passMsg = Mobile.getText(findTestObject('SignupScreen/validationMsgPasswordField'), 10)
'Verify if displayed message is correct'
Mobile.verifyEqual(passMsg, 'Password is required.')

'To get confirm password field error message'
def confirmPassMsg = Mobile.getText(findTestObject('SignupScreen/validationMsgConfirmPasswordField'),10)
'Verify if displayed message is correct'
Mobile.verifyEqual(confirmPassMsg, 'Password confirm is required.')


