package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utiles.actionsClass;

public class openingscreen extends actionsClass{

	AndroidDriver driver;
	public openingscreen(AndroidDriver driver) {
		super(driver);
       this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	}

	@AndroidFindBy (accessibility ="Create New Wallet")
	private WebElement btnCreateNewWallet;
	
	@AndroidFindBy (accessibility ="Use Existing Wallet")
	private WebElement btnExistingWallet;
	
	@AndroidFindBy (accessibility ="Beldex Wallet")
	private WebElement OpeningPageTitle;
	
	
	public void clickCreateNewWallet () {
		btnCreateNewWallet.click();
	}

	public void clickExistingWallet () {
		btnExistingWallet.click();
	}

	public WebElement openingScreenTitle () {
		return OpeningPageTitle;
	}

}
