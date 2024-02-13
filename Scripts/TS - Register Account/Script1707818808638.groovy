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

Mobile.tap(findTestObject('Object Repository/Profile/Register/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/Register/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/Register/android.widget.TextView - SIGN UP TODAY'), 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Username'), 'AquaBotol1', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Email'), 'AquaBotol@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Password'), 'AquaBotol1', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.ConfirmPassword'), 'AquaBotol1', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.FirstName'), 'Aqua', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.LastName'), 'Botol', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Phone'), '08122333444', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.State'), 'New York', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Address'), '456 Oak Avenue', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.City'), 'New York', 0)

Mobile.setText(findTestObject('Object Repository/Profile/Register/EditText.Zip'), '10001', 0)

Mobile.tap(findTestObject('Object Repository/Profile/Register/android.widget.Button - REGISTER'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/Profile/Register/android.widget.TextView - AquaBotol1'), 0)

Mobile.closeApplication()

