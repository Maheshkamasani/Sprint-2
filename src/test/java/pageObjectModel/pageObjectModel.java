package pageObjectModel;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class pageObjectModel {
		public WebDriver driver;
		@CacheLookup
	    @FindBy(xpath = "//div[@id=\"preSubscribedBlocks\"]//child::div[1]//child::button[2]") WebElement cmdgetsub;
	    @FindBy(xpath = "//button[text()='Select ICONIC']") WebElement cmdICONIC;
	    @FindBy(xpath = "//*[@id='__next']/div[1]/div/div[2]/div[3]/div[3]/h4") WebElement cmdplan;
	    @FindBy(xpath = "//button[text()='Proceed to pay']") WebElement cmdpay;
		public pageObjectModel(WebDriver driver) 
		{
			super();
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
	    public void clickOnGetSubscription() 
	    {
	    	cmdgetsub.click();
			
		}
	    public void clickOnSelectICONIC() 
	    {
	    	cmdICONIC.click();
	    	
	    }
	    public void clickOnPlan() 
	    {
	    	cmdplan.click();
	    }
	    public void clickOnPay() 
	    {
	    	cmdpay.click();
	    }

	}

}
