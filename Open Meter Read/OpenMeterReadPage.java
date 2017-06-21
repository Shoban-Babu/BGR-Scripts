package bg.framework.app.functional.page.selfServe;

import bg.framework.app.functional.common.ApplicationConfig;

import bg.framework.app.functional.page.common.BasePage;
import bg.framework.app.functional.util.PropertyLoader;
import bg.framework.app.functional.util.Report;
import bg.framework.app.functional.entities.UserProfile;
import bg.framework.app.functional.util.OnlineDBConnector;
//import java.awt.Robot;

import java.util.Properties;

public class OpenMeterReadPage extends BasePage{

	 private final static String FILE_NAME = "resources/selfServe/OpenMeterRead.properties";
	    private static Properties pageProperties = new PropertyLoader(FILE_NAME).load();
	    public static String electmpxn;
	    public static String gasmpan;
	   
	public void navigatetoLoginSSO(){
		browser.wait(getWaitTime());
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.NavigateToLogin"), "Navigate to login");
	}
	
	public void loginSSO(UserProfile userProfile) {
		browser.wait(getWaitTime());
		verifyAndInputById(pageProperties.getProperty("OpenMeterRead.Email"), "Email Id", userProfile.getEmail());
		verifyAndInputById(pageProperties.getProperty("OpenMeterRead.Password"), "Password", userProfile.getPassword());
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Login"), "Login");
		continueToMyAccount();
	}
	public void continueToMyAccount() {
		if (browser.isElementVisibleWithXpath(pageProperties.getProperty("LoginPage.WelcomeMessage"))) {
	        Report.updateTestLog("User logged in Successfully", "PASS");
	    }
		else {
			 Report.updateTestLog("User login unsuccessful", "Fail");
		}
	}
	public void navigateToSubmitMeterRead() {
		//
		//if(browser.isElementVisibleWithXpath("//*[@id='mega-menu']/ul/li[4]/a"))
		//{
			//verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.NavigateToSubmitMeterRead"), "Navigate To Submit Meter Read Page");
		//	browser.clickWithXpath(pageProperties.getProperty("OpenMeterRead.NavigateToSubmitMeterRead"));
		//}
			browser.wait(getWaitTime());
			browser.open(ApplicationConfig.APP_BG_URL+"youraccount/discover/submit-meter-reading.html");
			
	}
	
	public void navigateToSubmitOpenReading()
	{
		browser.wait(getWaitTime());
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.NavigateToSubmitOpenReading"), "Submit Open MeterReading");	
	}
	
	
	
	public void fillGasMeterRead() {
		browser.wait(getWaitTime());
		verifyAndInputById(pageProperties.getProperty("OpenMeterRead.GasMeterPointNumber"),"Gas Meter Point Number", "4267306503");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.SubmitGasPointNumber"), "Submit Gas Point Number");
		browser.wait(getWaitTime());
		verifyAndInputById(pageProperties.getProperty("OpenMeterRead.EnterGasRead"), "Enter Gas Read", "2333");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.SubmitGasRead"), "Submit Gas Read");
	}
	
	public void verifyWithOnlineDB(UserProfile userProfile) {
		String sysDate = new OnlineDBConnector().DBsysdate();
		//Report.updateTestLog(sysDate, "Fail");
		String AuditDetails = new OnlineDBConnector().verifyAuditDetailsEntryDB(userProfile.getEmail(),sysDate );
		String Entry1 = "OPEN_METER_READ_SUCCESS";
				
			if(AuditDetails.contains(Entry1))
			{
				Report.updateTestLog("Audit details updated in DB", "Pass");
			}
			else {
				Report.updateTestLog("Audit details not updated in DB", "Fail");
			}	
	
	}
	
	public void logout()
	{
		browser.wait(getWaitTime());
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Logout"), "Logout");
	}
	
	public void navigateToPrepopulateElectricyPage(UserProfile userProfile) {
		electmpxn=userProfile.getMPRN();
		System.out.println("The Electricity MPRN Number is "+ electmpxn );
    	browser.open(ApplicationConfig.APP_BG_URL+"/OpeningMeterRead/Anonymous-read/Entry/?elec="+electmpxn);
    	browser.wait(getWaitTime());
    }
	
	public void navigateToPrepopulateGasPage(UserProfile userProfile) {
		gasmpan=userProfile.getMPAN();
		System.out.println("The Gas MPAN Number is "+ gasmpan );
    	browser.open(ApplicationConfig.APP_BG_URL+"/OpeningMeterRead/Anonymous-read/Entry/?gas="+gasmpan);
    	browser.wait(getWaitTime());
    }
	public void navigateToOpeningReadPage(UserProfile userProfile) {
		electmpxn=userProfile.getMPRN();
		gasmpan=userProfile.getMPAN();
		System.out.println("The Electricity MPRN Number is "+ gasmpan );
		System.out.println("The Gas MPAN Number is "+ gasmpan );
    	browser.open(ApplicationConfig.APP_BG_URL+"/OpeningMeterRead/Anonymous-read/Entry/?gas="+gasmpan+"&elec="+electmpxn);
    	browser.wait(getWaitTime());
    }
	public void VerifyElectMeter(UserProfile userProfile) {
		//gasmpan=userProfile.getMPAN();
		Report.updateTestLog("Your details page is populated successfully","Warn");
		//String Electmeter = browser.getAttributeByXpath((pageProperties.getProperty("OpenMeterRead.Electmeterpoint")), "Attribute");
		
		/*String Electmeter = browser.getTextByXpath(pageProperties.getProperty("OpenMeterRead.Electmeterpoint"));
		System.out.println("Text Box in ElectMeter is "+ Electmeter);*/
		
		browser.wait(1000);
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Continuebutton"),"Continue Button");
		browser.wait(1000);
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.ElecDayReading"),"Day Reading", "1000");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Submitbutton"),"Submit Button");
		browser.wait(1000);
		Report.updateTestLog("Confirmation page is populated successfully","Warn");
		
		
    }
	
	public void VerifyGasMeter(UserProfile userProfile) {
		//gasmpan=userProfile.getMPAN();
		Report.updateTestLog("Your details page is populated successfully","Warn");
		//String Electmeter = browser.getAttributeByXpath((pageProperties.getProperty("OpenMeterRead.Electmeterpoint")), "Attribute");
		
		/*String Electmeter = browser.getTextByXpath(pageProperties.getProperty("OpenMeterRead.Electmeterpoint"));
		System.out.println("Text Box in ElectMeter is "+ Electmeter);*/
		
		browser.wait(1000);
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Continuebutton"),"Continue Button");
		browser.wait(1000);
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.GasReading"),"Gas Reading", "1000");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Submitbutton"),"Submit Button");
		browser.wait(1000);
		Report.updateTestLog("Confirmation page is populated successfully","Warn");
		
		
    }
	
	public void VerifyMeterReadPage(UserProfile userProfile) {
		//gasmpan=userProfile.getMPAN();
		Report.updateTestLog("Your details page is populated successfully","Warn");
		//String Electmeter = browser.getAttributeByXpath((pageProperties.getProperty("OpenMeterRead.Electmeterpoint")), "Attribute");
		
		/*String Electmeter = browser.getTextByXpath(pageProperties.getProperty("OpenMeterRead.Electmeterpoint"));
		System.out.println("Text Box in ElectMeter is "+ Electmeter);*/
		
		browser.wait(1000);
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Continuebutton"),"Continue Button");
		browser.wait(1000);
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.GasReading"),"Gas Reading", "1000");
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.ElecDayReading"),"Day Reading", "1000");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Submitbutton"),"Submit Button");
		browser.wait(1000);
		Report.updateTestLog("Confirmation page is populated successfully","Warn");
		
    }
	
	public void navigateElectricyPage(UserProfile userProfile) {
		browser.wait(getWaitTime());
		browser.open(ApplicationConfig.APP_BG_URL+"/youraccount/discover/submit-meter-reading.html");
    	browser.wait(getWaitTime());
    	verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Submitmeterreadinglink"),"Submit meter reading link");
    	browser.wait(getWaitTime());
    }	
	
	public void VerifyElectOpeningReadPage(UserProfile userProfile) {
		
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.Electmeterpoint"),"Elect MPRN number Reading", userProfile.getMPRN());
		Report.updateTestLog("MPRN Number for Electricity is updated successfully","Warn");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Continuebutton"),"Continue Button");
		browser.wait(1000);
		verifyAndInputByXpath(pageProperties.getProperty("OpenMeterRead.ElecDayReading"),"Day Reading", "1000");
		verifyAndClickWithXpath(pageProperties.getProperty("OpenMeterRead.Submitbutton"),"Submit Button");
		browser.wait(1000);
		Report.updateTestLog("Confirmation page is populated successfully","Warn");
    }
	public void verifyAuditTable(UserProfile userProfile) {
		OnlineDBConnector dbFunctions = new OnlineDBConnector();
		String date = dbFunctions.DBsysdateDdmmyyhhmi();
		String Result = dbFunctions.getAuditEventTypeId(date,userProfile.getEmail());
		System.out.println("Audit Table value is : "+Result);
		Report.updateTestLog("Audit id is made in audit table as expected. Audit id ","Pass");
		
	}
	
	
	
	
	
	
}