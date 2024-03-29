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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://188.166.228.73/ssm_ui/login.html')

WebUI.setText(findTestObject('Page_SSM Admin  Login/input_Username_username'), username)

WebUI.setText(findTestObject('Page_SSM Admin  Login/input_Password_password'), password)

WebUI.click(findTestObject('Page_SSM Admin  Login/i_Login_m-icon-swapright m-icon-white'))

WebUI.waitForElementPresent(findTestObject('Page_SSM  Dashboard/div_DashboardManage Room BookingBooking (Customer)Available RoomCalendarListNew BookingBooking List'), 
    10)

WebUI.verifyElementPresent(findTestObject('Page_SSM  Dashboard/div_DashboardManage Room BookingBooking (Customer)Available RoomCalendarListNew BookingBooking List'), 
    10)

