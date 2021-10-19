package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.userinterfaces.GuruLoginPage.BTN_LOGIN;
import static com.sophossolutions.userinterfaces.GuruLoginPage.PASSWORD;
import static com.sophossolutions.userinterfaces.GuruLoginPage.USER;
import static com.sophossolutions.userinterfaces.GuruHomePage.TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.Login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GuruLoginStepDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} desea navegar a la pagina {string}")
	public void deseaNavegarALaPagina(String actor, String url) {
		theActorCalled(actor).wasAbleTo(Open.url(url));
	}

	@When("ingrensa nombre de usuario {string} y password {string}")
	public void ingrensaNombreDeUsuarioYPassword(String user, String password) {
		theActorInTheSpotlight().attemptsTo(Login.in(user, password, USER, PASSWORD, BTN_LOGIN));
	}

	@Then("valida que se presente el mensaje de bienvenida {string}")
	public void validaQueSePresenteElMensajeDeBienvenida(String text) {
		theActorInTheSpotlight().should(seeThat(TextOf.field(TITLE.of(text)), equalTo(text)));
	}

}
