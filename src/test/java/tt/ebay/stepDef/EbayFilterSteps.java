package tt.ebay.stepDef;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbayFilterResultActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayFilterSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbayFilterResultActions EbayFilterResultActionsObj = new EbayFilterResultActions();

	
	@When("^Select Long Sleeve filters")
	public void open_Ebay_Website() throws Throwable {
		System.out.println("Select Long Sleeve filters");
		EbayFilterResultActionsObj.selectFilter();
	}

	@Then("^The item list should only have Long Sleeve shirts$")
	public void in_searchbar_type_in_shirts() throws Throwable {
		
	}
}
