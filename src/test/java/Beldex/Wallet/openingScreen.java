package Beldex.Wallet;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjectModel.openingscreen;
import pageObjectModel.restoreWalletScreen;
import pageObjectModel.setupPinScreen;
import utiles.baseClass;

public class openingScreen extends baseClass{

	
	openingscreen openingscreen;
	restoreWalletScreen restorewalletscreen;
	setupPinScreen setuppinscreen;
	
	@Test(priority = 1,groups = {"Smoke","Regression"})
	public void To_validate_OpeningScreen_createWallet_RespondToTouch () {
		openingscreen = new openingscreen(driver);
		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
		openingscreen.clickCreateNewWallet();
		setuppinscreen = new setupPinScreen(driver);
		//Assert.assertEquals(setuppinscreen.enterYourPinScreen(),"Enter Your PIN");
		driver.navigate().back();
		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
	
	}
	
	@Test(priority = 2,groups = {"Smoke","Regression"})
	public void To_validate_OpeningScreen_UseExistingWallet_RespondToTouch () {
		openingscreen = new openingscreen(driver);
		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
		openingscreen.clickExistingWallet();
		restorewalletscreen = new restoreWalletScreen(driver);
		Assert.assertTrue(restorewalletscreen.restoreWalletScreenTitle().isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
	}
 
	@Test(priority = 3)
	public void To_Validate_switching_4digitpin_to_6digitpin () {
		openingscreen = new openingscreen(driver);
		Assert.assertTrue(openingscreen.openingScreenTitle().isDisplayed());
		openingscreen.clickCreateNewWallet();
		setuppinscreen = new setupPinScreen(driver);
		setuppinscreen.clickSwitch6digitPin();
		Assert.assertTrue(setuppinscreen.Element4digitPin().isDisplayed());
		
	}
	
	@Test(priority = 4)
	public void To_Validate_switching_6digitpin_to_4digitpin () {
		
		setuppinscreen = new setupPinScreen(driver);
		setuppinscreen.clickSwitch4digitPin();
		Assert.assertTrue(setuppinscreen.Element6digitPin().isDisplayed());
		
	}

}
