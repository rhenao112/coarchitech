package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login implements Task {

	private String user;
	private String password;
	private Target userField;
	private Target passwordField;
	private Target btnLogin;

	public Login(String user, String password, Target userField, Target passwordField, Target btnLogin) {
		this.user = user;
		this.password = password;
		this.userField = userField;
		this.passwordField = passwordField;
		this.btnLogin = btnLogin;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(userField), Enter.theValue(password).into(passwordField),
				Click.on(btnLogin));
	}

	public static Login in(String user, String password, Target userField, Target passwordField, Target btnLogin) {
		return Tasks.instrumented(Login.class, user, password, userField, passwordField, btnLogin);
	}

}
