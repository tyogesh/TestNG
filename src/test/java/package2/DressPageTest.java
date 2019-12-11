package package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.DressPageObjects;
import package1.HomePageObjects;

public class DressPageTest {
	
	DressPageObjects dp;
	HomePageObjects homePage;
	BasePage bp;
	
	public DressPageTest()
	{
		dp=new DressPageObjects();
		homePage=new HomePageObjects();
		bp=new BasePage();
	}

	
	  @Test
	     public void verifyIcons()
	     { 
		  homePage.clickDresses();
		  Assert.assertTrue(bp.elementFound(dp.getShort()));
		  Assert.assertTrue(bp.elementFound(dp.getMedium()));
	  	  Assert.assertTrue(bp.elementFound(dp.getLarge()));  
		  
	     }
	  
	  @Test
	  public void verifyProductCount()
	     {
	    	 homePage.clickDresses();
	    	 Assert.assertTrue(dp.getProductCount()==dp.getProductCountFromHeader(),"Failed:Count mismatched");
	     }
	  
	  @Test
	  public void verifyAddToCart()
	  {
		  homePage.clickDresses();
		  dp.moveToProductOne();
		  String msg=dp.getTxtCart();
		  Assert.assertTrue(msg.contains("successfully"), "Failed:Product not added to cart");
	      dp.close();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
