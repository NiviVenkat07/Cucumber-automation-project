package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	
	

	public WebDriver driver;
	
	@FindBy(xpath="(//a[normalize-space()='Dresses'])[2]")
	private WebElement dress;
	
	 @FindBy(xpath="(//img[@class='replace-2x'])[3]")
		private WebElement Summer_dress;

		@FindBy(xpath="(//a[@class='product-name'])[5]")
		private WebElement Pname;
		
		@FindBy(xpath="//i[@class='icon-plus']")
		private WebElement Quantity_btn;
		
		@FindBy(id="group_1")
		private WebElement size_btn;
				
		@FindBy(name="Blue")
		private WebElement blue;
		
		@FindBy(name="Submit")
		private WebElement Submit_btn;
			
	
	public Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
}
  public WebElement getClick() {
		return dress;

} 
	
	    public WebElement getSummer_dress() {
			return Summer_dress;
}
		public WebElement getPname() {
			return Pname;
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
