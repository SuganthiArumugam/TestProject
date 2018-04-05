package gmailTest.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import gmailTest.pageclasses.*; 

public class Login {

	Signin signin;
	@Test
	@Parameters({"username","password","text"})
	public void enteremail(String username, String password, String text) throws InterruptedException {
		signin=new Signin();
		signin.invokeapp();
		signin.username(username);
		signin.clickNext();
		Thread.sleep(10000);
		signin.pwd(password);
		Thread.sleep(100);
		signin.clickSignin();
		Thread.sleep(10000);
		signin.verifyCompose(text);
	}
//	
//public static void main (String args[])
//{
//	Login mainLogin = new Login();
//	mainLogin.enteremail("TestAutomat123@gmail.com","testpwd123","COMPOSE");
//	}"TestAutomat123@gmail.com""testpwd123""COMPOSE"
}