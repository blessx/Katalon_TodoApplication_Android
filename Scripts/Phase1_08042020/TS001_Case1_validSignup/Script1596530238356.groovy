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


Mobile.comment('Story: To verify the signup function whether it will successfully register user using valid credentials')

'This is to start the application on current selected android\'s device'
Mobile.startApplication(GlobalVariable.G_AndroidApp, false)
'This is to verify if the text is presented/displayed in 10 seconds timeout'
Mobile.verifyElementExist(findTestObject('LoginScreen/loginScreenTitleText'),10)
'This is to change the screen from the Signin screen to SignUp screen'
Mobile.tap(findTestObject('SignupScreen/btnToRegisterScreen'),10)

'This is to input valid username on the name field'
Mobile.tap(findTestObject('Object Repository/SignupScreen/signUpNameField'),10)
AndroidDriver<?> driverName = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverName.getKeyboard().sendKeys("user10")

'This is to input valid user email address on the mail field'
Mobile.tap(findTestObject('Object Repository/SignupScreen/signUpEmailField'),10)
AndroidDriver<?> driverEmail = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverEmail.getKeyboard().sendKeys("user10@sample.com")

'This is to input valid user password on the password field'
Mobile.tap(findTestObject('Object Repository/SignupScreen/signUpPasswordField'),10)
AndroidDriver<?> driverPass = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverPass.getKeyboard().sendKeys("123456")

'This is to input matched user passowrd on the password confirm field'
Mobile.tap(findTestObject('Object Repository/SignupScreen/signUpConfirmPasswordField'),10)
AndroidDriver<?> driverPassConfirm = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverPassConfirm.getKeyboard().sendKeys("123456")

'This is to tap the register button'
Mobile.tap(findTestObject('Object Repository/SignupScreen/btnToSignUp'), 10)

'This is to verify if the text is presented/displayed in 10 seconds timeout'
Mobile.verifyElementExist(findTestObject('Object Repository/LoginScreen/SuccessMsgAfterSignUp'),10)

'This is to verify the success message after registration'
def successMsgSignup = Mobile.getText(findTestObject('Object Repository/LoginScreen/SuccessMsgAfterSignUp'),10)
'This is to verify if displayed message is correct'
Mobile.verifyEqual(successMsgSignup, 'Registration successful, please log in.')
Mobile.comment(successMsgSignup)

