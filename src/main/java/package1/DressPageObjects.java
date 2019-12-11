package package1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage {
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtProductHeaderCount;
	
	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> firstProduct;
	
	@FindBy(xpath = "//*[@for='layered_id_attribute_group_1']")
	private WebElement txtShort;
	

	@FindBy(xpath = "//*[@for='layered_id_attribute_group_2']")
	private WebElement txtMedium;
	
	@FindBy(xpath = "//*[@for='layered_id_attribute_group_3']")
	private WebElement txtLarge;
	
	@FindBy(xpath ="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement ProductOne;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]")
	private WebElement AddToCart;
	
	@FindBy(tagName = "h2")
	private WebElement txtAddToCart;
	

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
	private WebElement close;
	
	public DressPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getShort()
	{
		return txtShort;
	}
	
	public WebElement getMedium()
	{
		
		return txtMedium;
	}
	
	public WebElement getLarge()
	{
		
		return txtLarge;
	}
	
	public int getProductCount()
	{
		return firstProduct.size();
	
	}
	
	public int getProductCountFromHeader()
	{
	 return Integer.parseInt(txtProductHeaderCount.getText().split(" ")[2]);
	}

	public void moveToProductOne()
	{  
		Actions ac= new Actions(driver);
		ac.moveToElement(ProductOne).moveToElement(AddToCart).click().build().perform();
	}
	
	public String getTxtCart()
	{
		isElementVisible(txtAddToCart);
		return txtAddToCart.getText();
	}
	
	public void close()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(close).click().build().perform();
	}
}
























