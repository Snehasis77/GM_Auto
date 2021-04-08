package com.gm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gm.testCases.BaseClass;

public class GenericFilters {
WebDriver ldriver;
	
	public GenericFilters(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);}
	
	@FindBy(id = "subjectCategoryId")
	public WebElement SubjectcategoryDwn;

	public String a = "Harim";

	@FindBy(id = "stateIdID")
	public WebElement StateDwn;

	@FindBy(id = "languageIdID")
	public WebElement LanguageDwn;
	
	public void SubjectFilter(String Scategory) {
		
		SubjectcategoryDwn.click();
		SubjectcategoryDwn.sendKeys(Scategory);
		
	}

	public void Subjct() {
		SubjectcategoryDwn.click();
	}

	public WebElement getSubjectcategoryDwn() {
		return SubjectcategoryDwn;
	}

	public void setSubjectcategoryDwn(WebElement subjectcategoryDwn) {
		SubjectcategoryDwn = subjectcategoryDwn;
	}

	public WebElement getStateDwn() {
		return StateDwn;
	}

	public void setStateDwn(WebElement stateDwn) {
		StateDwn = stateDwn;
	}

	public WebElement getLanguageDwn() {
		return LanguageDwn;
	}

	public void setLanguageDwn(WebElement languageDwn) {
		LanguageDwn = languageDwn;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public GenericFilters(WebElement subjectcategoryDwn, String a, WebElement stateDwn, WebElement languageDwn) {
		super();
		SubjectcategoryDwn = subjectcategoryDwn;
		this.a = a;
		StateDwn = stateDwn;
		LanguageDwn = languageDwn;
	}

}
