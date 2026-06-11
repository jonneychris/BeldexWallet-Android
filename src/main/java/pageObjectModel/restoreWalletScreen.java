package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utiles.actionsClass;

public class restoreWalletScreen extends actionsClass{

	AndroidDriver driver;
	public restoreWalletScreen(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	}

	@AndroidFindBy(accessibility = "Restore Wallet")
	private WebElement restoreWalletScreentitle;
	
	
	
	
	
	
	
	public WebElement restoreWalletScreenTitle () {
		return restoreWalletScreentitle;
		
	}
	
	
}
