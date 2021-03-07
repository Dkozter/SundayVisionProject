package tt.ebay.stepDef;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbayNotificationResultActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayNotificationSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbayNotificationResultActions EbayNotificationResultActionsObj = new EbayNotificationResultActions();
	
	@When("^Click Bell icon")
	public void open_Ebay_Website() throws Throwable {
		System.out.println("Click Bell icon");
		EbayNotificationResultActionsObj.selectBell();
	}

	@Then("^The item list should should notifications$")
	public void in_searchbar_type_in_shirts() throws Throwable {
		
	}
}