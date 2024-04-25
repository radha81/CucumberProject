package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SupplierSteps {
	WebDriver driver;

@Given("^launch browser$")
public void launch_browser() throws Throwable {
    driver = FunctionLibrary.startBrowser();
}

@When("^Launch url \"([^\"]*)\" in a browser$")
public void launch_url_in_a_browser(String url) throws Throwable {
    FunctionLibrary.openUrl(url);
}

@When("^Wait For username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_username_with_and(String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\"$")
public void enter_Username_with_and_and(String LocatorType, String LocatorValue,String testData) throws Throwable {
    FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
}

@When("^Enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_password_with_and_and(String LocatorType, String LocatorValue,String testData) throws Throwable {
	 FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
}

@When("^click login button	with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_login_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for supplier link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_supplier_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^click supplier link	 with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_supplier_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^click Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for Supplier Number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Supplier_Number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^capture supplier number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void capture_supplier_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
   FunctionLibrary.capuresupnum(LocatorType, LocatorValue);
}

@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_in_with_and(String testData, String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
}

@When("^Click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Add_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^click Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
}

@When("^Click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^Validate supplier table$")
public void validate_supplier_table() throws Throwable {
    FunctionLibrary.supplierTable();
}

@When("^Click Logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Logout_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
	FunctionLibrary.clickAction(LocatorType, LocatorValue);
}

@When("^close browser$")
public void close_browser() throws Throwable {
   FunctionLibrary.closeBrowser();
}



}
