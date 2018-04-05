package gmailTest.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Genericwrappers implements wrappers {
	String strErrorMessage;
	WebDriver driver;
	
	public void invokeapp()
	{		
		String exePath = "D:\\SUGANTHI 2018\\chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver", exePath);
	       ChromeOptions chromeOptions = new ChromeOptions();
	       chromeOptions.setBinary("C:\\Users\\sarumugam1866\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
	       driver = new ChromeDriver(chromeOptions);
	       driver.get("https://mail.google.com/");
	       driver.manage().window().maximize();
	}
	


	 public void enterByID(String locatorId,String textValue){
			String strErrorMessage;
			try{
			 	driver.findElement(By.id(locatorId)).clear();
			 	driver.findElement(By.id(locatorId)).sendKeys(textValue); 				
			 	strErrorMessage = "Not able to clear the values";
			 	//System.out.println("Not able to clear the values1");
			 	}
			 catch (Exception e) {
			 	strErrorMessage =  e.getMessage();
			 	System.out.println("str errormsg"+strErrorMessage);
			 	}
		 }

	 public void enterByName(String locatorName,String textValue){
		 String strErrorMessage;
		try{
		 	driver.findElement(By.name(locatorName)).clear();
		 	driver.findElement(By.name(locatorName)).sendKeys(textValue); 				
		 	strErrorMessage = "Not able to clear the values**";	
		 	}
		 catch (Exception e) {
		 	strErrorMessage =  e.getMessage();
			System.out.println(strErrorMessage);
		 	}
		 }



	public void clickByXpath(String locatorXpath) {
		String strErrorMessage;
		try{
		 	driver.findElement(By.xpath(locatorXpath)).click(); 				
		 	strErrorMessage = "Not able to click";	
		 	}
		 catch (Exception e) {
		 	strErrorMessage =  e.getMessage();
		 	}
		 }



	public boolean VerifyTextByXpath(String locatorXpath, String textValue){
		boolean bReturn = false;
			String strErrorMessage;
			try {
				String verifyText = driver.findElement(By.xpath(locatorXpath)).getText();
				if (verifyText.equals(textValue)) {
				bReturn = true;
				System.out.println(verifyText+" text verified");
				
						}
		else{
		strErrorMessage = "The expected text " +"\""+ textValue + "\"" + " Actual text: " + "\""+ verifyText +"\"" + " are not matched";
		 System.out.println(strErrorMessage);
			} 
		}catch(Exception e){
			 strErrorMessage =  e.getMessage();
			 System.out.println(strErrorMessage);
			}
			return bReturn;
				}
}

