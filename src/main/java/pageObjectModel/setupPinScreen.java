package pageObjectModel;

import java.util.Iterator;

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
		
	@AndroidFindBy(accessibility = "PIN is incorrect")
	private WebElement pinIncorrectPopup;
	
	@AndroidFindBy(accessibility = "Ok")
	private WebElement btnOk;
	
	@AndroidFindBy(accessibility = "Your PIN has been set up \\nsuccessfully!")
	private WebElement pinSuccessPopup;
	
	public String setupPINScreen () {
		return setupPinScreen.getText();
	}
	
	public void clickSwitch6digitPin () {
		switchTo6digit.click();
	}
	
	public void clickSwitch4digitPin () {
		switchTo4digit.click();
	}
 
	public WebElement enterYourPinScreen () {
		return enterYourPinScreen;
	}
	
	public WebElement reEnterYourPinScreen () {
		return reEnterYourPinScreen;
	}

	public WebElement Element4digitPin () {
		return switchTo4digit;
	}
	
	public WebElement Element6digitPin () {
		return switchTo6digit;
	}
	
	public void Enter1 () {
		for (int i=0;i<3;i++) {
			btn1.click();
		}
	}
	
	public void Enter2 () {
		for (int i=0;i<3;i++) {
			btn2.click();
		}
	}
	
	public void deleteValue () {
		for (int i=0;i<3;i++) {
			btnCancel.click();
		}	
	}
	
	public void enterFourdigitPin () {
		for (int i=0;i<=3;i++) {
			btn1.click();
		}
	}
	
		public void enterSixdigitPin () {
			for (int i=0;i<=5;i++) {
				btn1.click();
			}
	}
	
	public void clickOk () {
		btnOk.click();
	}
	
	public WebElement PinInCorrect () {
		return pinIncorrectPopup;
	}
	
	public void setValid4digitPin () {
		for( int i=0;i<4;i++) {
			btn1.click();
		}
		for (int i =0;i< 4;i++) {
            btn1.click();			
		}
	}
	
	public void setInValid4digitPin () {
		for( int i=0;i<4;i++) {
			btn1.click();
		}
		for (int i =0;i< 4;i++) {
            btn2.click();			
		}
	}
	
	public void setValid6digitPin () {
		for( int i=0;i<6;i++) {
			btn1.click();
		}
		for (int i =0;i< 6;i++) {
            btn1.click();			
		}
	}
	
	public void setInValid6digitPin () {
		for( int i=0;i<6;i++) {
			btn1.click();
		}
		for (int i =0;i< 6;i++) {
            btn2.click();			
		}
	}
	
	public WebElement pinSuccessPopup () {
		return pinSuccessPopup;
	}
	
	
}
