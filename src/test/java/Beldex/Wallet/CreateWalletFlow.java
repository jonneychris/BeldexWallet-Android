package Beldex.Wallet;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjectModel.openingscreen;
import pageObjectModel.restoreWalletScreen;
import pageObjectModel.setupPinScreen;
import utiles.baseClass;

public class CreateWalletFlow extends baseClass{

	
	openingscreen openingscreen;
	restoreWalletScreen restorewalletscreen;
	setupPinScreen setuppinscreen;
	
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

	
	@Test(priority = 5)
	public void To_Validate_Whether_value_entered_in_pin_is_editable () {
		setuppinscreen = new setupPinScreen(driver);
		setuppinscreen.Enter1();
		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
		setuppinscreen.deleteValue();
		setuppinscreen.Enter2();
		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
	}
	
	@Test(priority = 6)
    public void To_Validate_Whether_value_entered_in_pin_is_deletable () {
		setuppinscreen = new setupPinScreen(driver);
		setuppinscreen.deleteValue();
		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());

	}
	
	@Test(priority = 7)
    public void To_Validate_setuppin_by_Entering_4digitPin_in_enteryour_pin_and_Entering_6digitPin_ReEnter_pin () {
		setuppinscreen = new setupPinScreen(driver);
		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
		setuppinscreen.enterFourdigitPin();
		Assert.assertTrue(setuppinscreen.reEnterYourPinScreen().isDisplayed());
		setuppinscreen.clickSwitch6digitPin();
		setuppinscreen.enterSixdigitPin();
		Assert.assertTrue(setuppinscreen.PinInCorrect().isDisplayed());
	    setuppinscreen.clickOk();
	}
	
	@Test(priority = 8)
    public void To_Validate_setuppin_by_Entering_6digitPin_in_enteryour_pin_and_Entering_4digitPin_ReEnter_pin () {
		setuppinscreen = new setupPinScreen(driver);
		Assert.assertTrue(setuppinscreen.enterYourPinScreen().isDisplayed());
		setuppinscreen.enterSixdigitPin();
		Assert.assertTrue(setuppinscreen.reEnterYourPinScreen().isDisplayed());
		setuppinscreen.clickSwitch4digitPin();
		setuppinscreen.enterFourdigitPin();
		Assert.assertTrue(setuppinscreen.PinInCorrect().isDisplayed());
	    setuppinscreen.clickOk();
	}
	
	
//    @Test(priority = 10)
//    public void To_Validate_setupPin_by_Valid_EnterPin_and_ReEnterPin () {
//    	
//    }
//    
//    @Test(priority = 11)
//    public void To_Validate_setupPin_by_Valid_EnterPin_and_InValid_ReEnterPin () {
//    	
//    }


}
