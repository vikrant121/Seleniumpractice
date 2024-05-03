package externalxpath;


public class OrangeHRMXpath
{

	 // login
		public static final String username = "//*[@name='username']";
		public static final String Password = "//*[@name='password']";
		public static final String loginbtn = "//button[@type='submit']";
		public static final String message_actual = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']";
		public static final String clickonprofile = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
     	public static final String logoutbtn = "//a[text()='Logout']";
	   //addEmployee
     	public static final String PIMmenu = "//span[text()='PIM']";
		public static final String addemployee = "//a[text()='Add Employee']";
		public static final String Firstname = "//input[@placeholder='First Name']";
		public static final String Lastname = "//input[@name='lastName']";
		//------------------------searchEmployeeById----------------------
		
		public static final String empidtext = "(//input[@class='oxd-input oxd-input--active'])[2]";
		public static final String emplylistrow = "(//div[@role='row'])";
		public static final String msgActualempy = "((//div[@role='row'])[2]/div[@role='cell'])[2]";
		public static final String EmpID = "(//*[@class='oxd-input oxd-input--active'])[2]";
		//searchEmployeeNyName		
		public static final String clickprofileicon = "//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']";
		public static final String saveemployeebtn = "//button[normalize-space()='Save']";
		public static final String  Personal_Details= "//h6[normalize-space()='Personal Details']";
		public static final String  Emplist= "//a[normalize-space()='Employee List']";
		public static final String  name= "(//input[@placeholder='Type for hints...'])[1]";
		public static final String  searchbtn= "//button[normalize-space()='Search']";
		public static final String element = "//span[@class='oxd-text oxd-text--span']";
	//deleteEmployee
		public static final String clickdeleteicon = "//i[@class='oxd-icon bi-trash']";
		public static final String clickdelbtn = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
		public static final String getmessge = "(//span[@class='oxd-text oxd-text--span'])[1]";
		
////---------------------Leave section--------------------------------------		
		public static final String Leavemenu = "Leave";
		public static final String Applybtntext = "Apply";
		public static final String clickleavedropdn1 = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']";
		public static final String selectdddata = "//*[contains(text(),'CAN')]";
		public static final String fromdate = "//div[@class='oxd-date-input']/input";
		//public static final String Todate = "(//*[@class='oxd-input oxd-input--active'])[2]";
		public static final String Comment = "textarea";
		public static final String Applyleavebtn = "//button[@type='submit']";


////-----------------------ListEmployees---------------------------//
		public static final String totalLinksElements = "//ul[@class='oxd-pagination__ul']/li";
		public static final String emp_list  = "//div[@class='oxd-table-card']/div /div[4]";
		
		
}
