package gmailTest.pageclasses;

import gmailTest.utils.ObjectRepository;
import gmailTest.wrappers.*;

public class ComposePage extends Genericwrappers {
	
	public void invokeappclass() {
		invokeapp();
	}

	public void verifyCompose(String locatorXpath, String textValue) {		
		VerifyTextByXpath(ObjectRepository.composeXpath, textValue);
	}
	
}
