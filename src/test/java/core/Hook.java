package core;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
  
     // login
  @FindBy(xpath = externalxpath.OrangeHRMXpath.username)
  public static WebElement username;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Password)
  public static WebElement Password;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.loginbtn)
  public static WebElement loginbtn; 

  @FindBy(xpath = externalxpath.OrangeHRMXpath.message_actual)
  public static WebElement message_actual; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.clickonprofile)
  public static WebElement clickonprofile; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.logoutbtn)
  public static WebElement logoutbtn; 
  
  //----------- //addEmployee---------------------//
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.PIMmenu)
  public static WebElement PIMmenu; 
  @FindBy(xpath = externalxpath.OrangeHRMXpath.addemployee)
  public static WebElement addemployee;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Firstname)
  public static WebElement Firstname; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Lastname)
  public static WebElement Lastname; 
  
  //---------------searchEmployeeById------------------//
  @FindBy(xpath = externalxpath.OrangeHRMXpath.emplylistrow)
  public static List<WebElement> emplylistrow;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.msgActualempy)
  public static WebElement msgActualempy;
  @FindBy(xpath = externalxpath.OrangeHRMXpath.EmpID)
  public static WebElement EmpID; 
  
	//searchEmployeeNyName-----------------//
  @FindBy(xpath = externalxpath.OrangeHRMXpath.clickprofileicon)
  public static WebElement clickprofileicon; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.saveemployeebtn)
  public static WebElement saveemployeebtn; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Personal_Details)
  public static WebElement Personal_Details; 
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Emplist)
  public static WebElement Emplist;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.name)
  public static WebElement name;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.searchbtn)
  public static WebElement searchbtn;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.element)
  public static List<WebElement> element;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.clickdeleteicon)
  public static WebElement clickdeleteicon;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.clickdelbtn)
  public static WebElement clickdelbtn;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.getmessge)
  public static WebElement getmessge;
////---------------------Leave section------------------//
  @FindBy(linkText = externalxpath.OrangeHRMXpath.Leavemenu)
  public static WebElement Leavemenu;
  
  @FindBy(linkText = externalxpath.OrangeHRMXpath.Applybtntext)
  public static WebElement Applybtntext;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.clickleavedropdn1)
  public static WebElement clickleavedropdn1;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.selectdddata)
  public static WebElement selectdddata;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.fromdate)
  public static WebElement fromdate;
  
//  @FindBy(xpath = externalxpath.OrangeHRMXpath.Todate)
//  public static WebElement Todate;
  
  @FindBy(tagName = externalxpath.OrangeHRMXpath.Comment)
  public static WebElement Comment;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.Applyleavebtn)
  public static WebElement Applyleavebtn;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.empidtext)
  public static WebElement empidtext;
  
  @FindBy(xpath = externalxpath.OrangeHRMXpath.totalLinksElements)
  public static List<WebElement> totalLinksElements;
 
  @FindBy(xpath = externalxpath.OrangeHRMXpath.emp_list)
  public static List<WebElement> emp_list;
 
}
