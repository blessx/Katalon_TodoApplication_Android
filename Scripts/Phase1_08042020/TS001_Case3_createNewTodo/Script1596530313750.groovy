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

Mobile.comment('Story: To verify the create function for the ToDo App ')

'This is to verify if the text is presented/displayed in 10 seconds timeout'
Mobile.verifyElementExist(findTestObject('Object Repository/TodoList/todoListScreenTitle'),10)
'This is to wait a 5 seconds to fully load the elements'
Mobile.delay(5)
'This is to tap the + icon below to add new Todo'
Mobile.tap(findTestObject('Object Repository/TodoList/btnToAddTodo'), 10)

'This is to add a new Todo'
Mobile.verifyElementExist(findTestObject('Object Repository/TodoList/newTodoField'),10)
Mobile.tap(findTestObject('Object Repository/TodoList/newTodoField'),10)
AndroidDriver<?> driverNewTodo = (AndroidDriver<?>) MobileDriverFactory.getDriver()
driverNewTodo.getKeyboard().sendKeys("Tasks01")
Mobile.hideKeyboard()

'This is to save the newly created Todo'
Mobile.tap(findTestObject('Object Repository/TodoList/btnToSaveTodo'), 0)
Mobile.delay(5)
Mobile.comment("Successfully create a new task")


