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

Mobile.startApplication('D:\\BFLP\\Bootcamp\\Materi\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Profile/Register/ImageView.BurgerButton'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/LinearLayout.LoginButton'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Login/RelativeLayout.Username'), 10)

Mobile.setText(findTestObject('Object Repository/Profile/Login/EditText.Username'), 'AquaBotol1', 10)

Mobile.tap(findTestObject('Object Repository/Profile/Login/RelativeLayout.Password'), 10)

Mobile.setText(findTestObject('Object Repository/Profile/Login/EditText.Password'), 'AquaBotol1', 10)

Mobile.tap(findTestObject('Object Repository/Profile/Login/Button.LOGIN'), 10)

Mobile.tap(findTestObject('Object Repository/Profile/Register/ImageView.BurgerButton'), 10)

String displayedUsername = Mobile.getText(findTestObject('Object Repository/Profile/Register/TextView.Username'), 10)

assert displayedUsername.equalsIgnoreCase('AquaBotol1')

Mobile.closeApplication()