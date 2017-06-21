package bg.framework.app.functional.action.selfServe;

import bg.framework.app.functional.page.selfServe.OpenMeterReadPage;
import bg.framework.app.functional.entities.UserProfile;

public class OpenMeterReadAction {

	
	public OpenMeterReadAction navigateToLoginSSO()
	{
		new OpenMeterReadPage().navigatetoLoginSSO();
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction navigateToPrepopulateElectricyPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().navigateToPrepopulateElectricyPage(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction navigateElectricyPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().navigateElectricyPage(userProfile);
		return new OpenMeterReadAction();
	}
	
	public OpenMeterReadAction VerifyElectOpeningReadPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().VerifyElectOpeningReadPage(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction verifyAuditTable(UserProfile userProfile)
	{
		new OpenMeterReadPage().verifyAuditTable(userProfile);
		return new OpenMeterReadAction();
	}
	
	public OpenMeterReadAction navigateToPrepopulateGasPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().navigateToPrepopulateGasPage(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction navigateToOpeningReadPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().navigateToOpeningReadPage(userProfile);
		return new OpenMeterReadAction();
	}
	
	public OpenMeterReadAction loginSSO(UserProfile userProfile) {
		new OpenMeterReadPage().loginSSO(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction navigateToSubmitMeterRead()
	{
		new OpenMeterReadPage().navigateToSubmitMeterRead();
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction VerifyElectMeter(UserProfile userProfile)
	{
		new OpenMeterReadPage().VerifyElectMeter(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction VerifyGasMeter(UserProfile userProfile)
	{
		new OpenMeterReadPage().VerifyGasMeter(userProfile);
		return new OpenMeterReadAction();
	}
	public OpenMeterReadAction VerifyMeterReadPage(UserProfile userProfile)
	{
		new OpenMeterReadPage().VerifyMeterReadPage(userProfile);
		return new OpenMeterReadAction();
	}
	
	public OpenMeterReadAction navigateToSubmitOpenReading()
	{
		new OpenMeterReadPage().navigateToSubmitOpenReading();
		return new OpenMeterReadAction();
	}
	
	
	public OpenMeterReadAction fillGasMeterRead()
	{
		new OpenMeterReadPage().fillGasMeterRead();
		return new OpenMeterReadAction();
	}
	
	public OpenMeterReadAction verifyWithOnlineDB(UserProfile userProfile)
	{
		new OpenMeterReadPage().verifyWithOnlineDB(userProfile);
		return new OpenMeterReadAction();
	}
	
	public void logout()
	{
		new OpenMeterReadPage().logout();
	}
	
}
