package com.herokuapp.TestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(name = "user-name")
    WebElement inputUserName;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public Login(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String strUserName) {
        inputUserName.sendKeys(strUserName);
    }
    public void setPassword(String strPassword) {
        inputPassword.sendKeys(strPassword);
    }
    public void clickLogin() {
        loginButton.click();

    }
    public void login(String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();

    }}
