package package2;

import java.util.Random;


import org.testng.Assert;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.HomePageObjects;

public class HomePageTest {
	
	HomePageObjects homePage;
	BasePage bp;
	
	int random = new Random().nextInt(50000);
	String email = "abcd11"+random+"@gmail.com";

	public HomePageTest() {
		homePage = new HomePageObjects();
		bp=new BasePage();
	}
	
	@Test
	public void verifyTabs()
	{
		Assert.assertTrue(bp.elementFound(homePage.getWomen()));
		Assert.assertTrue(bp.elementFound(homePage.getDresses()));
		Assert.assertTrue(bp.elementFound(homePage.gettshirts()));

	}
	
	@Test
	public void verifyNavigation()
	{
		homePage.clickWomen();
		String msg=homePage.getTitleWomen();
		System.out.println("Title :" +msg);
		Assert.assertTrue(msg.equals("WOMEN"), "Failed:Women not displayed");
		
		
		homePage.clickDresses();
		String msg1=homePage.getTitleDresses();
		System.out.println("Title :" +msg1);
		Assert.assertTrue(msg1.equals("DRESSES"), "Failed:Dresses not displayed");
		
		  homePage.clickTshirts();
		  String msg2=homePage.getTitleTshirts();
		  System.out.println("Title :" +msg2);
		  Assert.assertTrue(msg2.equals("T-SHIRTS"), "Failed:Tshirts not displayed");
	}
	
	@Test
	 public void verifySubscription()
	 {
		homePage.setNewsLetter(email);
		String msg=homePage.getTxtNewsletterMessage();
		 Assert.assertTrue(msg.contains("successful"), "Failed:Subscription message is not displayed");
	 }
	}
