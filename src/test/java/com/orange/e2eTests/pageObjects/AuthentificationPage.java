package com.orange.e2eTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.utils.FileReaderManager;




public class AuthentificationPage {
	WebDriver driver;

	public AuthentificationPage(WebDriver driver) {
		System.out.println("console construteur ");
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
 public void navigate () {
	 FileReaderManager fileReaderMan = new FileReaderManager();
	 System.out.println("testttttttttttttttttttttttttt"+fileReaderMan);
	 driver.get(FileReaderManager.getInstance().getApplicationUrl());
	 System.out.println("test urldsfdsfsdffsfsfsfd"+FileReaderManager.getInstance());
 }
	
	
	
	

}
