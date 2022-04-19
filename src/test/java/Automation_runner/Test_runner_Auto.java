package Automation_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Base_class_for_all.Base_class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(	
        features = "src\\test\\java\\Automation_feature\\Automation.feature", 
		
		glue ="Step_definition"
							
		)

public class Test_runner_Auto  {

	public static WebDriver driver;
	
    @BeforeClass 
      public static void set_Up()  {
		 
         driver=Base_class.browser_Launch("chrome");
    } 
    
    @AfterClass 
     public static void tear_Down() {
	
     	driver.close();

}
   
}
