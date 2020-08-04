import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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


import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


Mobile.comment('Story: To verify the signin function whether it will successfully log in the user using valid credentials')

'This is to input valid registered user email address on the email field'
Mobile.tap(findTestObject('Object Repository/LoginScreen/signInEmailField'),10)
AndroidDriver<?> driverLoginEmail = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverLoginEmail.getKeyboard().sendKeys("user5@sample.com")

'This is to input valid user email address on the mail field'
Mobile.tap(findTestObject('Object Repository/LoginScreen/signInPasswordField'),10)
AndroidDriver<?> driverLoginPass = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverLoginPass.getKeyboard().sendKeys("123456")

'This is to tap the login button'
Mobile.tap(findTestObject('Object Repository/LoginScreen/btnToSignIn'), 10)
Mobile.comment("Successfully login")
