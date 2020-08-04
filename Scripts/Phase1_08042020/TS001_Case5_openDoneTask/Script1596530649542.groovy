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
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

Mobile.comment('Story: To verify re-opsning the done tasks function')
'This is to verify if the text is presented/displayed in 10 seconds timeout'
Mobile.verifyElementExist(findTestObject('Object Repository/TodoList/todoListScreenTitle'),10)
'This is to tap the closed tasks tab'
Mobile.tap(findTestObject('Object Repository/TodoList/tabforDoneTodo'), 10)
'This is to tap as done the first row todo on the list icon'
Mobile.tap(findTestObject('Object Repository/TodoList/doneTodoinDoneTab'),10)

'This is to verify the success message after re-opening the closed task'
def openDonetaskMsg = Mobile.getText(findTestObject('Object Repository/TodoList/taskOpenMsg'),10)
'This is to verify if displayed message is correct'
Mobile.verifyEqual(openDonetaskMsg, 'Task opened.')
Mobile.comment("Successfully" + openDonetaskMsg)



