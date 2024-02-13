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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption

Mobile.startApplication('D:\\BFLP\\Bootcamp\\Materi\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Profile/Register/ImageView.BurgerButton'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/LinearLayout.LoginButton'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/TextView.SignUPButton'), 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Username'), GlobalVariable.username, 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Email'), GlobalVariable.email, 
    10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Password'), GlobalVariable.password, 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.ConfirmPassword'), GlobalVariable.password, 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.FirstName'), GlobalVariable.firstName, 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.LastName'), GlobalVariable.lastName, 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Phone'), '08122333444', 10)

Mobile.scrollToText("REGISTER")

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.State'), 'New York', 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Address'), '456 Oak Avenue', 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.City'), 'New York', 10)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Zip'), '10001', 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/Button.RegisterButton'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/ImageView.BurgerButton'), 10)

String displayedUsername = Mobile.getText(findTestObject('Object Repository/Profile/Register/TextView.Username'), 10)

assert displayedUsername.equalsIgnoreCase(GlobalVariable.username)

Mobile.closeApplication()

