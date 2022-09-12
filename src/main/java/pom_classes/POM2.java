package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
	//declaration
@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement ctnbtn;

//initialization
public POM2(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//utilization
public void enterpin(String userpin) {
	pin.sendKeys("171992");
	
}
public void clickctnbtn() {
	ctnbtn.click();
}
}
