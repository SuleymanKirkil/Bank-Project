package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(name = "ssn")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@name='ssn']//following-sibling::div")
    public WebElement invalidSsn;
    @FindBy(name = "firstname")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@name='firstname']//following-sibling::div")
    public WebElement invalidFirstName;

    @FindBy(name = "lastname")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='lastname']//following-sibling::div")
    public WebElement invalidLastName;

    @FindBy(name = "address")
    public WebElement addressBox;

    @FindBy(xpath = "//input[@name='address']//following-sibling::div")
    public WebElement invalidAddress;

    @FindBy(name = "mobilephone")
    public WebElement mobilephoneBox;

    @FindBy(xpath = "//input[@name='mobilephone']//following-sibling::div")
    public WebElement invalidMobilephone;

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='username']//following-sibling::div")
    public WebElement invalidUsername;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='email']//following-sibling::div")
    public WebElement invalidEmail;

    @FindBy(name = "firstPassword")
    public WebElement firstPasswordBox;

    @FindBy(xpath = "//input[@name='firstPassword']//following-sibling::div")
    public WebElement invalidfirstPassword;
    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public List<WebElement> listOfNoOfGrayStrengthBar;

    @FindBy(name = "secondPassword")
    public WebElement secondPassword;

    @FindBy(xpath = "//input[@name='secondPassword']//following-sibling::div")
    public WebElement invalidSecondPassword;

    @FindBy(id = "register-submit")
    public WebElement RegisterButton;




}
