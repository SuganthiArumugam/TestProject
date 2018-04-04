package gmailTest.wrappers;

public interface wrappers {
	
//	public static String strErrorMessage;
	public void invokeapp();
	public void enterByID(String locatorId,String textValue);
	public void enterByName(String locatorName,String textValue);
	public void clickByXpath(String locatorXpath);
	public boolean VerifyTextByXpath(String locatorXpath, String textValue);	
}
