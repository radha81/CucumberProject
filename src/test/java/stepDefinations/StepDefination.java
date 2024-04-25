package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDefination {
WebDriver driver;	

@Given("^user navigate browser$")
public void startBrowser() throws Throwable {
  driver =FunctionLibrary.startBrowser();
}

@When("^user launch url \"([^\"]*)\" in a browser$")
public void openUrl(String Url) throws Throwable {
   FunctionLibrary.openUrl(Url);
}

@When("^user wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitForUsername(String LocatorType,String LocatorValue) throws Throwable {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^User enter username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void Enterusername(String LocatorType,String LocatorValue, String TestData) throws Throwable {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}

@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void Enterpass(String LocatorType,String LocatorValue, String TestData) throws Throwable {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
}

@When("^user click login button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickloginBtn(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^user wait for supplier link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitForSupplierlink(String LocatorType,String LocatorValue) throws Throwable {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10"); 
}

@When("^user click supplier link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickSupplier(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^user wait for Add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitforAddicon(String LocatorType,String LocatorValue) throws Throwable {
  FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");  
}

@When("^user click add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickAddIcon(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^user wait for supplier number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitForSupplierNum(String LocatorType,String LocatorValue) throws Throwable {
   FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10"); 
}

@When("^user capture supplier number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void captureSupplierNum(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.capturesup(LocatorType, LocatorValue);
}

@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void FillSupplierForm(String TestData, String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData); 
}

@When("^Click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickAddBtn(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitForConfirmOk(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^click Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void ClickconfirmOk(String LocatorType,String LocatorValue) throws Throwable {
   FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitForAlertOk(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^Click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickAlertOk(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Validate supplier table$")
public void validate_supplier_table() throws Throwable {
    FunctionLibrary.supplierTable();
}

@When("^Click Logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickLogoutlink(String LocatorType,String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^close browser$")
public void close_browser() throws Throwable {
   FunctionLibrary.closeBrowser();
}


}
