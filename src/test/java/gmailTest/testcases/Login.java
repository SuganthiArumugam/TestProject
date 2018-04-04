package gmailTest.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import gmailTest.pageclasses.*; 


public class Login extends Signin {
	@Test
	@Parameters({"username","password","text"})
	public void enteremail(String username, String password, String text) throws InterruptedException {
		invokeapp();
		username(username);
		clickNext();
		Thread.sleep(10000);
		pwd(password);
		Thread.sleep(100);
		clickSignin();
		Thread.sleep(10000);
		verifyCompose(text);
	}
//	
//public static void main (String args[])
//{
//	Login mainLogin = new Login();
//	mainLogin.enteremail("TestAutomat123@gmail.com","testpwd123","COMPOSE");
//	}"TestAutomat123@gmail.com""testpwd123""COMPOSE"
}