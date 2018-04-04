package gmailTest.pageclasses;

import gmailTest.utils.ObjectRepository;
import gmailTest.wrappers.*;

public class Signin extends Genericwrappers {
	
	public void invokeappclass() {
		invokeapp();
	}
	
	public void username(String email) {		
	System.out.println("Username entered");
		enterByID(ObjectRepository.enterGmailIdById, email);
	}
	
	public void clickNext() {		
		clickByXpath(ObjectRepository.clickIdNextBtnByXpath);
	}

	public void pwd(String passwd) {
		System.out.println("password entered");
		enterByName(ObjectRepository.enterPasswordByName, passwd);
	}
	
	public void clickSignin() {		
		clickByXpath(ObjectRepository.clickpwdSigninBtnByXpath);
	}
	public void verifyCompose(String text) {		
		VerifyTextByXpath(ObjectRepository.composeXpath, text);
	}
}
