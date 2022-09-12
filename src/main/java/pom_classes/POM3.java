package pom_classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
@FindBy(xpath = "//span[@class='user-id']")private WebElement user;


//initialization
public POM3(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	//utilization
	public String verifyuser() {
		String actID=user.getText();
		return actID;
		
	
	
	}
}

