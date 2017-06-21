package bg.framework.app.functional.test.selfServe;

import bg.framework.app.functional.action.selfServe.OpenMeterReadAction;

import bg.framework.app.functional.action.common.HomePageAction;
import bg.framework.app.functional.entities.UserProfile;
import bg.framework.app.functional.test.common.TestBase;
import bg.framework.app.functional.util.Report;
import bg.framework.app.functional.util.TestDataHelper;
import bg.framework.app.functional.util.SiebelDataBase;
import org.testng.annotations.Test;

import static bg.framework.app.functional.entities.FunctionalCategory.ManagePersonalDetails;
import static bg.framework.app.functional.entities.FunctionalCategory.OpenMeterRead;
import static bg.framework.app.functional.entities.FunctionalCategory.Regression;

public class OpenMeterReadTest extends TestBase {
	@SuppressWarnings("unchecked")
	
	@Test(groups = {Regression, OpenMeterRead})
	public void verifyOAMOpenMeterReadJourney() {
		UserProfile userProfile = new TestDataHelper().getUserProfile("SSOAccount");
		Report.createTestLogHeader("Open Meter Read", "OAM user Open Meter Read Journey");		
        UserProfile userProfileReset = userProfile;
        try
        {
        	new OpenMeterReadAction()
        					.navigateToLoginSSO()
        					.loginSSO(userProfile)
        					.navigateToSubmitMeterRead()
        					.navigateToSubmitOpenReading()
        					.fillGasMeterRead()
        					.verifyWithOnlineDB(userProfile)
        					.logout();
        }
        finally {
        	
        }
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////September - 9th Release - Done Done Scrum////////////////////////////////////////////////////////////////////////////////////////////////	
	
@SuppressWarnings("unchecked")
@Test(groups = {Regression, OpenMeterRead})
	public void verifyPrePopulateOpenMeterReadJourneyElec() {
		Report.createTestLogHeader("Open Meter Read.", "Verify whether the Pre-populate MPxN for Electricity Customer");
		UserProfile userProfile = new TestDataHelper().getUserProfile("ElectricityAccount");
		new HomePageAction()
        .navigateToLogin()
		.loginDetails(userProfile);
		new OpenMeterReadAction()
		.navigateToPrepopulateElectricyPage(userProfile)
		.VerifyElectMeter(userProfile);
		}

@SuppressWarnings("unchecked")
@Test(groups = {Regression, OpenMeterRead})
	public void verifyPrePopulateOpenMeterReadJourneyGas() {
		Report.createTestLogHeader("Open Meter Read.", "Verify whether the Pre-populate MPxN for Gas Customer");
		UserProfile userProfile = new TestDataHelper().getUserProfile("GasAccount");
		new HomePageAction()
        .navigateToLogin()
		.loginDetails(userProfile);
		new OpenMeterReadAction()
		.navigateToPrepopulateGasPage(userProfile)
		.VerifyGasMeter(userProfile);
		}

@SuppressWarnings("unchecked")
@Test(groups = {Regression, OpenMeterRead})
	public void verifyPrePopulateOpenMeterReadJourneyJiAccount() {
		Report.createTestLogHeader("Open Meter Read.", "Verify whether the Pre-populate MPxN & MPAN for Ji Customer");
		UserProfile userProfile = new TestDataHelper().getUserProfile("JIAccount");
		new HomePageAction()
        .navigateToLogin()
		.loginDetails(userProfile);
		new OpenMeterReadAction()
		.navigateToOpeningReadPage(userProfile)
		.VerifyMeterReadPage(userProfile);
		}

@SuppressWarnings("unchecked")
@Test(groups = {Regression, OpenMeterRead})
	public void verifyPrePopulateOpenMeterReadJourneyDualAccount() {
		Report.createTestLogHeader("Open Meter Read.", "Verify whether the Pre-populate MPxN & MPAN for Dual Customer");
		UserProfile userProfile = new TestDataHelper().getUserProfile("DualAccount");
		new HomePageAction()
        .navigateToLogin()
		.loginDetails(userProfile);
		new OpenMeterReadAction()
		.navigateToOpeningReadPage(userProfile)
		.VerifyMeterReadPage(userProfile);
		}

@SuppressWarnings("unchecked")
@Test(groups = {Regression, OpenMeterRead})
	public void verifyOpenMeterReadJourneyElec() {
		Report.createTestLogHeader("Open Meter Read.", "Verify Opening Read Journey for Electricity Customer");
		UserProfile userProfile = new TestDataHelper().getUserProfile("ElectricityAccount");
		new HomePageAction()
        .navigateToLogin()
		.loginDetails(userProfile);
		new OpenMeterReadAction()
		.navigateElectricyPage(userProfile)
		.VerifyElectOpeningReadPage(userProfile)
		.verifyAuditTable(userProfile);
		}

	
	
}
