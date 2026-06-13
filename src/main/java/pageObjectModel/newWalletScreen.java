package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utiles.actionsClass;

public class newWalletScreen extends actionsClass {

	AndroidDriver driver;
	public newWalletScreen(AndroidDriver driver) {
		super(driver);
        this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	@AndroidFindBy(accessibility = "New Wallet")
	private WebElement newWalletScreenTitle;
	
	public WebElement newWalletScreenTitle () {
		return newWalletScreenTitle;
	}


}
