package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.ebay.pageElements.EbayNotificationResultLocators;

public class EbayNotificationResultActions {

EbayNotificationResultLocators EbayNotificationResultLocatorsObj;
	
	public EbayNotificationResultActions(){
		EbayNotificationResultLocatorsObj= new EbayNotificationResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayNotificationResultLocatorsObj);
	}
		public void selectBell(){
		EbayNotificationResultLocatorsObj.selectBell.click();
		
		}
		
		

}