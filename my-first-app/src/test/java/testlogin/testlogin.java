package testlogin;

import Login.Login;
import org.testng.annotations.Test;

public class testlogin extends Login {
//	/ Login already extends base
	
	@Test(priority=1)
	
	public void testInvalidlogin() {
		invalidLogin();
		
	}
	
	@Test(priority=2)
	
	public void testValidLogin() throws Exception {
		validLogin();
	}
	

}
