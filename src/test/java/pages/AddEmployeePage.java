package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstname;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastname;

    @FindBy(id = "photofile")
    public WebElement photograph;

    @FindBy(id = "chkLogin")
    public WebElement checkbox;

    @FindBy(id = "user_name")
    public WebElement createUsername;

    @FindBy(id = "user_password")
    public WebElement createPassword;

    @FindBy(id = "re_password")
    public WebElement rePassword;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy(id = "employeeId")
    public WebElement employeeId;




    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}