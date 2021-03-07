package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayNotificationResultLocators {

	@FindBy(xpath="//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-eb-Alerts']/div[1]")
			public WebElement selectBell;
}
