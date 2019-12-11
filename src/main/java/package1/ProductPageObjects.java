package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObjects extends BasePage {
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement productone;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]")
	private WebElement more;
	
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
     private WebElement tweet;
	
	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	private WebElement share;
	
	@FindBy(xpath = "//*[@id='short_description_content']/p")
	private WebElement prodDesc;
	
	public ProductPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveToProduct()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(productone).moveToElement(more).click().build().perform();
	}
	
	public WebElement getTweet()
	{
		return tweet;
	}
	
	public WebElement getShare()
	{
		return share;
	}
	
	public WebElement getProdDesc()
	{
		return prodDesc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
