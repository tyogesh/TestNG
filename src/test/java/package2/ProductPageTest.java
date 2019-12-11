package package2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.HomePageObjects;
import package1.ProductPageObjects;

public class ProductPageTest {
	
	HomePageObjects homePage;
	BasePage bp;
	ProductPageObjects pd;
	
	public ProductPageTest()
	{
		homePage= new HomePageObjects();
		bp=new BasePage();
		pd=new ProductPageObjects();
	}

	@Test
	public void verifyButtons()
	{
		Assert.assertTrue(bp.elementFound(pd.getTweet()));
		Assert.assertTrue(bp.elementFound(pd.getShare()));
		
	}
	
	@Test
	public void verifyProdDesc()
	{
		Assert.assertTrue(bp.elementFound(pd.getProdDesc()));
	}
	
	@BeforeMethod
	 public void before()
    {
		homePage.clickDresses();
		pd.moveToProduct();
    }
	
}
