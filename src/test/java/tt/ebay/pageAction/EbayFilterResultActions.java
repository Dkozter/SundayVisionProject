package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.ebay.pageElements.EbayFilterResultLocators;

public class EbayFilterResultActions {

EbayFilterResultLocators EbayFilterResultLocatorsObj;
	
	public EbayFilterResultActions(){
		EbayFilterResultLocatorsObj= new EbayFilterResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayFilterResultLocatorsObj);
	}
		public void selectFilter(){
		EbayFilterResultLocatorsObj.txtFilter.click();
		
		}
		
		

}