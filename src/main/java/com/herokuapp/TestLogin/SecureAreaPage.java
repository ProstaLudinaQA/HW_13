package com.herokuapp.TestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='flash'] ")
    WebElement homePageHeaderText;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
}
public String getHomePageHeaderText(){
    return homePageHeaderText.getText();

    }
}
