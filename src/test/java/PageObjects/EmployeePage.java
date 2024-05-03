package PageObjects;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;

public class EmployeePage extends Hook {
 
	
	String name1="";
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
	
	@Test(priority =1, enabled=true)
	public void addEmployee() throws InterruptedException, Exception  
	{
		logIn();
		test.log(LogStatus.INFO, "Login succussfully");
		//   //span[text()='PIM']
		//     //a[text()='Add Employee']

		///    //input[@placeholder='First Name']

		//     //input[@placeholder='Last Name']

		//    //button[normalize-space()='Save']

		//find PIM Menu and click on PIM Menu
		PIMmenu.click();
		//find Add employee and click on Add Employee option
		addemployee.click();
		
		//enter first name
         Firstname.sendKeys("Test234");
         String add = Firstname.getText();
//         this.name1=add;
//         System.out.println(name1);
		//enter last name
         Lastname.sendKeys("kumar");
         
         EmpID.sendKeys(generateRandomID());
       //enter Id
         
          //add image
	     clickprofileicon.click();

	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\Sweet\\OneDrive\\Documents\\orange.exe");
    //click save button
           saveemployeebtn.click();
           test.log(LogStatus.INFO, "Employee Add succussfully");
    		// Verify if the employee is successfully added by checking the employee list personal details
    		String confirmationMessage = Personal_Details.getText();


//    		if (confirmationMessage.contains("Personal Details")) {
//    			System.out.println("Employee added successfully!");
//    		} else {
//    			System.out.println("Failed to add employee!");
//    		}   		
    		Assert.assertEquals("Personal Details", confirmationMessage);
    		test.log(LogStatus.INFO, confirmationMessage);
    		
    		logOut();

           Thread.sleep(5000);
          
}
	
	@Test(priority=2, enabled = true)
	public void searchEmployeeNyName() throws InterruptedException
	{
		logIn();
		
		//find PIM Menu and click on PIM Menu
        PIMmenu.click();
		//Select Employee List
        Emplist.click();
		name.sendKeys("Test234");
		
		//Click the search button.
		searchbtn.click();

		String expected_message = "Record Found";
		String message_actual = element.get(0).getText();
		System.out.println(message_actual);

		
	Assert.assertTrue(message_actual.contains(expected_message));
	test.log(LogStatus.INFO, "Actual and expected message are matched");


		/*for (int i = 0 ; i<element.size(); i++)
	{
		 System.out.println("At index "+ i + "text is :" + element.get(i).getText());  
	}*/

		//	•	Verify that the record is found.
		//	•	Logout the user.
	logOut();
	}
	@Test(priority=3, enabled=true)
	public void deleteEmployee() throws InterruptedException
	{
		logIn();

		//find PIM Menu and click on PIM Menu
		PIMmenu.click();

		//Select Employee List
		Emplist.click();

		//enter employee name
		name.sendKeys("Test234");

		//driver.findElement(By.tagName("input")).get(1).sendKeys("Nesta");


		//Click the search button.
		searchbtn.click();

		///////////////////Delete/////////////////////////

		//click on delete icon of the record
		clickdeleteicon.click();


		//click on yes, delete messaage button
		clickdelbtn.click();

		//check for message "No Record Found"
		 String msg = getmessge.getText();

		Assert.assertEquals(msg, "No Records Found");
		test.log(LogStatus.INFO, "No Records Found");

		Thread.sleep(5000);
		logOut();
	}
	
}
