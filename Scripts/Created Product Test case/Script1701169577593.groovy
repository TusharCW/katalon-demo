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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-digi-sugam.instantmseloans.in/banker/login')

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Username_mat-input-0'), 'tusharmaker')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GST sahay/input_Password_mat-input-1'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Forgot password_mat-input-2'), 'F2n17k')

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/h3_DIGI SUGAM'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Product List'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_add Add New Product'))

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Product Name_mat-input-8'), 'Test New 281123-1')

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Loan Offer Validity_mat-input-9'), '48')

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Product Name_mat-input-8'), 'Test New 281123 1')

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Cooling off Period_mat-form-field-infix_f68b1d'))

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Cooling off Period_mat-input-10'), '15')

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_add  Create Product'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_add Add New Parameters'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Select All'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_add Add Parameters'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_1 Consumer bureau score'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_2 Commercial bureau score'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_3 Aggregate DPD _afa108'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_4 Aggregate DPD (in days) - Consumer Bu_59e16d'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_5 Financial Income Trade (FIT) Rank'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_6 Presence of ca_7110d8'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_7 Presence of De_c32a4b'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_8 Max drop in Tu_efa1e2'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_9 Overall Custom_cf156b'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/mat-expansion-panel-header_10 Borrowers Ave_a24663'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_11 Bank Credit to GST turnover Ratio'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Send To Checker'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Scaling Matrix'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Select ROI'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Individual Bureau Score'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Select Sanction Limit'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Cancel_cdk-overlay-backdrop cdk-overlay_e7717b'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/i_Send To Checker_fa-solid fa-paper-plane mr-10'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Select Sanction Limit'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_GST Turnover'))

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Minimum_mat-input-36'), '10000')

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Maximum_mat-input-37'), '100000')

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Select GST Percentage'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_25'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_undefined'))

WebUI.setText(findTestObject('Object Repository/Page_GST sahay/input_Action_mat-input-34'), '25')

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_MCLR_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_MCLR'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_EBLR'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Fixed'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Fixed_mat-radio-container'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_EBLR'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Fixed'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Send To Checker'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_MCLR'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Send To Checker'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Matching Parameters'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_No_mat-slide-toggle-bar'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_No_mat-slide-toggle-bar'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Allow borrower with No CMR   No  Yes'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_No_mat-slide-toggle-bar_1'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_No_mat-slide-toggle-thumb'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Send To Checker'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Actions'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Charges'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Select Parameter'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Not Required'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/div_Select Parameter_1'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Not Required'))

WebUI.click(findTestObject('Object Repository/Page_GST sahay/span_Send To Checker'))

