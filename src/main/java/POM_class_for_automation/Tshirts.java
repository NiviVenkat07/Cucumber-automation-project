package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirts {

public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirt;
	
	 @FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
		private WebElement shirt;

		@FindBy(xpath="//i[@class='icon-plus']")
		private WebElement Quantity_btn;
		
		@FindBy(id="group_1")
		private WebElement size_btn;
				
		@FindBy(name="Blue")
		private WebElement blue;
		
		@FindBy(name="Submit")
		private WebElement Submit_btn;
			
	
	public Tshirts(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
}
  public WebElement getClick() {
		return Tshirt;

} 
	
	    public WebElement getshirt() {
			return shirt;
}
		
		public WebElement getQuantity_btn() {
			return Quantity_btn;
}
		    public WebElement getSize_btn() {
			return size_btn;
}
		public WebElement getblue() {		
			return blue;
}
		 public WebElement getSubmit_btn() {
				return Submit_btn;
}

	
	
}
