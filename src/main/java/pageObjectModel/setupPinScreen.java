package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utiles.actionsClass;

public class setupPinScreen extends actionsClass{

	AndroidDriver driver;
	public setupPinScreen (AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	}
	
	@AndroidFindBy (accessibility = "Setup PIN")
	private WebElement setupPinScreen;
		
	@AndroidFindBy(accessibility = "Switch to 6-digit PIN")
	private WebElement switchTo6digit;
	
	@AndroidFindBy(accessibility = "Switch to 4-digit PIN")
	private WebElement switchTo4digit;
	
	@AndroidFindBy(accessibility = "1")
	private WebElement btn1;
	
	@AndroidFindBy(accessibility = "2")
	private WebElement btn2;
	
	
	@AndroidFindBy(xpath="//android.view.View[11]")
	private WebElement btnCancel;
	
	@AndroidFindBy(accessibility = "Enter Your PIN")
	private WebElement enterYourPinScreen;
	
	@AndroidFindBy(accessibility = "Re-Enter your PIN")
	private WebElement reEnterYourPinScreen;
		
	
	public String setupPINScreen () {
		return setupPinScreen.getText();
	}
	
	public void clickSwitch6digitPin () {
		switchTo6digit.click();
	}
	
	public void clickSwitch4digitPin () {
		switchTo4digit.click();
	}
 
	public String enterYourPinScreen () {
		return enterYourPinScreen.getText();
	}
	
	public String reEnterYourPinScreen () {
		return reEnterYourPinScreen.getText();
	}

	public WebElement Element4digitPin () {
		return switchTo4digit;
	}
	
	public WebElement Element6digitPin () {
		return switchTo6digit;
	}
}
