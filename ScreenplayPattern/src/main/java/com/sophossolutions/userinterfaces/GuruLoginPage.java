package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GuruLoginPage {

	public static final Target USER = Target.the("user name").locatedBy("name:uid");
	public static final Target PASSWORD = Target.the("password ").locatedBy("name:password");
	public static final Target BTN_LOGIN = Target.the("button login").locatedBy("name:btnLogin");
	
}
