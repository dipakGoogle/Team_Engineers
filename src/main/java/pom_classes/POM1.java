package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	//declaration
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement pwd;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement login;

//initialization
public POM1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//utilization
public void enterUN(String username) {
	UN.sendKeys("DPG458");
}
public void enterpwd(String password) {
	pwd.sendKeys("Amol@1234");
}
public void clicklogin() {
	login.click();
//click on login button 
}
}
