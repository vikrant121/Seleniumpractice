package PageObjects;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import core.Hook;

public class OrangeHRM extends Hook {
	
	@Test(priority = 1, enabled=true)
	public void doLoginWithInvalidCredential() throws InterruptedException {
		// find username and enter username "Admin"
		username.sendKeys("Admin");

		// find password and enter invalid password
		Password.sendKeys("admin123q");
		// login button click
		loginbtn.click();

		String message_expected = "Invalid credentials";
		String msgactuaal = message_actual.getText();

		Assert.assertTrue(msgactuaal.contains(message_expected));
		test.log(LogStatus.INFO, "Actual and Expected result are same");
	
	}

	@Test(priority = 3, enabled=true)
	public void loginTestWithValidCredential() {
		// find username and enter username "Admin"
		username.sendKeys("Admin");
		// find password and enter password admin123
		Password.sendKeys("admin123");
		// login button click
		loginbtn.click();

		// Verify if the login was successful by checking the page title
		String pageTitle = driver.getTitle();
		test.log(LogStatus.INFO, pageTitle);

		/*
		 * if (pageTitle.equals("OrangeHRM")) { System.out.println("Login successful!");
		 * } else { System.out.println("Login failed!"); }
		 */

		Assert.assertEquals("OrangeHRM", pageTitle);
		test.log(LogStatus.PASS, "Acutal title passed");
		clickonprofile.click();
		logoutbtn.click();
		test.log(LogStatus.INFO, "Logout button not working");
	}

	public void logIn() {
		// find username and enter username "Admin"
		username.sendKeys("Admin");
		// find password and enter password admin123
		Password.sendKeys("admin123");
		// login button click
		loginbtn.click();
	}
	public void logOut() {
		clickonprofile.click();
		logoutbtn.click();
	}
	
	public String generaterandomName() {
		
		return (RandomStringUtils.randomAlphabetic(5));
	}
	
	public String generateRandomID() {
		return (RandomStringUtils.randomNumeric(3));
	}
	
	@Test(priority=4, enabled=true)
	public void ListEmployees() throws InterruptedException
	{
		logIn();
		//find PIM Menu and click on PIM Menu
		PIMmenu.click();

		//Select Employee List
		Emplist.click();
		Thread.sleep(3000);

		//find total links
//		List<WebElement> totalLinksElements = driver.findElements(By.xpath(""));

		int totalLinks = totalLinksElements.size();

		for (int i=0; i<totalLinks; i++ )//0,1,2,3,
		{

			try
			{
				String currentLinkText = totalLinksElements.get(i).getText();


				int page = Integer.parseInt(currentLinkText);
				System.out.println("Page: " + page);

				totalLinksElements.get(i).click();

				Thread.sleep(2000);

//				List <WebElement> emp_list = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div /div[4]"));

				for(int j=0; j<emp_list.size();j++)
				{
					//print last name of each row 
					String lastName = emp_list.get(j).getText();
					test.log(LogStatus.INFO, lastName);
					System.out.println(lastName);
				}
			}
			catch(Exception e)
			{
				System.out.println("Not a number.");
				test.log(LogStatus.INFO, "Not a number.");
			}
		}

		Thread.sleep(5000);
		logOut();
	}
	@Test(priority=5, enabled=true)
	public void applyLeave() throws InterruptedException
	{
		logIn();

		//click on leave menu
		Leavemenu.click();		
		//click on Apply menu
		Applybtntext.click();
		
		//click on leave type drop down
		clickleavedropdn1.click();
		
		//select CAN-FMLA option from leave type dropdown
		selectdddata.click();
		
		//enter from date
		fromdate.sendKeys("2024-08-04");
		
		
		//enter comment
		Comment.sendKeys("This is my personal leave");
		Thread.sleep(3000);
		
		
		//click on Apply button
		Applyleavebtn.click();
		
		
		Thread.sleep(5000);
		logOut();
		
																												

	}

}