package com.NAMTG.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NAMTG.utilities.Driver_Utils;

public class LogInPage {
	public LogInPage() {
		PageFactory.initElements(Driver_Utils.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"testimonials\"]/div/div/div/div[2]/a")
	public WebElement login;

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@name='submit']")
	public WebElement signin;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/ul/li[9]/a/span")
	public WebElement logOut;

}
