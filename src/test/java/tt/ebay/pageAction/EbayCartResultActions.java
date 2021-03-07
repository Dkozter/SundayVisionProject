package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.utilities.ReadExcelSheet;
import tt.utilities.SetupDrivers;
import tt.ebay.pageElements.EbayCartResultLocators;
import org.openqa.selenium.support.ui.Select;


public class EbayCartResultActions {
		EbayCartResultLocators EbayCartResultLocatorsObj;
		
		public EbayCartResultActions() {
			EbayCartResultLocatorsObj = new EbayCartResultLocators();
			PageFactory.initElements(SetupDrivers.driver, EbayCartResultLocatorsObj);
		}
	
	public void selectColor() throws Exception {
		Thread.sleep(2000);
		Select myDrpDwn =new Select(EbayCartResultLocatorsObj.ddColor);
		myDrpDwn.selectByVisibleText(ReadExcelSheet.getMapData("Color"));
	}
	public void selectSize() throws Exception {
		Thread.sleep(2000);
		Select myDrpDwn =new Select(EbayCartResultLocatorsObj.ddSize);
		myDrpDwn.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
	}
	public void selectQuantity() throws Exception {
		Thread.sleep(2000);
		EbayCartResultLocatorsObj.txtbxQuantity.sendKeys(ReadExcelSheet.getMapData("Quantity"));
	}
		
	public void addToCart() throws Exception {
		Thread.sleep(2000);
		EbayCartResultLocatorsObj.btnAddCart.click();
		Thread.sleep(5000);
	}
}