package Beldex.Wallet;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjectModel.newWalletScreen;
import pageObjectModel.openingscreen;
import pageObjectModel.restoreWalletScreen;
import pageObjectModel.setupPinScreen;
import utiles.baseClass;

public class CreateWalletFlow extends baseClass{

	
	openingscreen openingscreen;
	restoreWalletScreen restorewalletscreen;
	setupPinScreen setuppinscreen;
	newWalletScreen newwalletscreen;
	
//	@Test(priority = 1,groups = {"Smoke","Regression"})
//	public void To_validate_OpeningScreen_createWallet_RespondToTouch () {
//		openingscreen = new openingscreen(driver);
//		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
//		openingscreen.clickCreateNewWallet();
//		setuppinscreen = new setupPinScreen(driver);
//		//Assert.assertEquals(setuppinscreen.enterYourPinScreen(),"Enter Your PIN");
//		driver.navigate().back();
//		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
//	
//	}
//	
//	@Test(priority = 2,groups = {"Smoke","Regression"})
//	public void To_validate_OpeningScreen_UseExistingWallet_RespondToTouch () {
//		openingscreen = new openingscreen(driver);
//		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
//		openingscreen.clickExistingWallet();
//		restorewalletscreen = new restoreWalletScreen(driver);
//		Assert.assertTrue(restorewalletscreen.restoreWalletScreenTitle().isDisplayed());
//		driver.navigate().back();
//		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
//	}
// 
//	@Test(priority = 3)
//	public void To_Validate_switching_4digitpin_to_6digitpin () {
//		openingscreen = new openingscreen(driver);
//		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
//		openingscreen.clickCreateNewWallet();
//		setuppinscreen = new setupPinScreen(driver);
//		setuppinscreen.clickSwitch6digitPin();
//		Assert.assertTrue(setuppinscreen.Element4digitPin().isDisplayed());
//		
//	}
//	
//	@Test(priority = 4)
//	public void To_Validate_switching_6digitpin_to_4digitpin () {
//		
//		setuppinscreen = new setupPinScreen(driver);
//		setuppinscreen.clickSwitch4digitPin();
//		Assert.assertTrue(setuppinscreen.Element6digitPin().isDisplayed());
//		
//	}
//
//	
//	@Test(priority = 5)
//	public void To_Validate_Whether_value_entered_in_pin_is_editable () {
//		setuppinscreen = new setupPinScreen(driver);
//		setuppinscreen.Enter1();
//		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
//		setuppinscreen.deleteValue();
//		setuppinscreen.Enter2();
//		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
//	}
//	
//	@Test(priority = 6)
//    public void To_Validate_Whether_value_entered_in_pin_is_deletable () {
//		setuppinscreen = new setupPinScreen(driver);
//		setuppinscreen.deleteValue();
//		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
//
//	}
//	
//	@Test(priority = 7)
//    public void To_Validate_setuppin_by_Entering_4digitPin_in_enteryour_pin_and_Entering_6digitPin_ReEnter_pin () {
//		setuppinscreen = new setupPinScreen(driver);
//		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
//		setuppinscreen.enterFourdigitPin();
//		Assert.assertTrue(setuppinscreen.reEnterYourPinScreen().isDisplayed());
//		setuppinscreen.clickSwitch6digitPin();
//		setuppinscreen.enterSixdigitPin();
//		Assert.assertTrue(setuppinscreen.PinInCorrect().isDisplayed());
//	    setuppinscreen.clickOk();
//	}
//	
//	@Test(priority = 8)
//    public void To_Validate_setuppin_by_Entering_6digitPin_in_enteryour_pin_and_Entering_4digitPin_ReEnter_pin () {
//		setuppinscreen = new setupPinScreen(driver);
//		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
//		setuppinscreen.enterSixdigitPin();
//		Assert.assertTrue(setuppinscreen.reEnterYourPinScreen().isDisplayed());
//		setuppinscreen.clickSwitch4digitPin();
//		setuppinscreen.enterFourdigitPin();
//		Assert.assertTrue(setuppinscreen.PinInCorrect().isDisplayed());
//	    setuppinscreen.clickOk();
//	}
//	
	
	
	 @Test(priority = 9 )
	 public void To_Validate_valid_pin_in_EnterPin_and_invalid_ReEnterPIN_using_4digit () {
			setuppinscreen = new setupPinScreen(driver);
	    	Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
	    	setuppinscreen.setInValid4digitPin();
	    	setuppinscreen.clickOk();
	 }
	
	 
	 @Test(priority = 10 )
	 public void To_Validate_valid_pin_in_EnterPin_and_invalid_ReEnterPIN_using_6digit () {
	    
		 	setuppinscreen = new setupPinScreen(driver);
           setuppinscreen.clickSwitch6digitPin();
           setuppinscreen.setInValid6digitPin();
           setuppinscreen.clickOk();
	 
	 }
	 

 
	 @Test(priority = 11)
	 public void  To_Validate_valid_Pin_in_Both_EnterPIN_and_ReEnterPIN_using_6digit () throws InterruptedException {
		 	setuppinscreen = new setupPinScreen(driver);
	    	Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
	    	setuppinscreen.setValid6digitPin();
	    	Thread.sleep(2000);
	    	//Assert.assertTrue(setuppinscreen.pinSuccessPopup().isDisplayed());
	    	setuppinscreen.clickOk();
	    	newwalletscreen = new newWalletScreen(driver);
	    	Assert.assertTrue(newwalletscreen.newWalletScreenTitle().isDisplayed());
	    	driver.navigate().back();
	 }
	 @Test(priority = 12)
     public void  To_Validate_valid_Pin_in_Both_EnterPIN_and_ReEnterPIN_using_4digit () throws InterruptedException {
		 	
		    setuppinscreen = new setupPinScreen(driver);
	    	Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
	    	setuppinscreen.clickSwitch4digitPin();
	    	setuppinscreen.setValid4digitPin();
	    	Thread.sleep(2000);
	    	//Assert.assertTrue(setuppinscreen.pinSuccessPopup().isDisplayed());
	    	setuppinscreen.clickOk();
	    	newwalletscreen = new newWalletScreen(driver);
	    	Assert.assertTrue(newwalletscreen.newWalletScreenTitle().isDisplayed());
	    	driver.navigate().back();	 
	 }
	 
	
	 
	 @Test(priority = 13)
     public void To_Validate_whether_enter_values_cleared_while_switching_pin_length () {
		 
		 setuppinscreen = new setupPinScreen(driver);
		 setuppinscreen.Enter1();
		 setuppinscreen.clickSwitch6digitPin();
		 setuppinscreen.Enter1();
		 Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
		 setuppinscreen.deleteValue();
	 }
}
