package bg.framework.app.functional.action.reFactoring;

import bg.framework.app.functional.entities.UserProfile;
import bg.framework.app.functional.page.reFactoring.PPMatePageNew;

public class PPMateActionNew {

	public PPMateActionNew cardStorageFunctionality(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.cardStorageFunctionality();
		return new PPMateActionNew();
	}
	public PPMateActionNew navigateToAccountSummaryPage(UserProfile userProfile){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.navigateToAccountSummaryPage(userProfile);
		return new PPMateActionNew();
	}
	
	public PPMateActionNew deleteCardFunctionality(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.deleteCardFunctionality();
		return new PPMateActionNew();
	}
	
	public PPMateActionNew navigateToTopupPage(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.navigateToTopupPage();
		return new PPMateActionNew();
	}
	public PPMateActionNew VerifyAddPaymentCard(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.AddPaymentCard();
		return new PPMateActionNew();
	}
	public PPMateActionNew VerifyEnterTopupamount(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.EnterTopupamount();
		return new PPMateActionNew();
	}
	
	public PPMateActionNew topAndPayPageDetails(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.topAndPayPageDetails();
		return new PPMateActionNew();
	}
	public PPMateActionNew verifyReviewAndConfirmPage(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.verifyReviewAndConfirmPage();
		return new PPMateActionNew();
	}
	public PPMateActionNew updateCustomerDetails(UserProfile userProfile){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.updateCustomerDetails(userProfile);
		return new PPMateActionNew();
	}
	public PPMateActionNew AddPaymentcardFunctionality(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.AddPaymentcardFunctionality();
		return new PPMateActionNew();
	}
	public PPMateActionNew VerifynavigateToUpdateDetailsPage(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.navigateToUpdateDetailsPage();
		return new PPMateActionNew();
	}
	public PPMateActionNew VerifyMeterreadfrequency(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.Meterreadfrequency();
		return new PPMateActionNew();
	}
	public PPMateActionNew VerifyfrequecyMetercontent(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.contentVerification();
		return new PPMateActionNew();
	}
	public PPMateActionNew navigateToManagePaymentCardsPage(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.navigateToManagePaymentCardsPage();
		return new PPMateActionNew();
	}	
	public PPMateActionNew goToYourAccountbutton(){
		PPMatePageNew ppMate = new PPMatePageNew();
		ppMate.goToYourAccountbutton();
		return new PPMateActionNew();
	}	
}
