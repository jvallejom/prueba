package co.com.retouno.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.retouno.screenplay.model.RegistroAutomationDemo;
import co.com.retouno.screenplay.questions.Registro;
import co.com.retouno.screenplay.tasks.Diligenciar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroUsuarioStepDefinitions {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que carlos quiere accede a la pagina$")
	public void queCarlosQuiereAccedeALaPagina() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaAutomation());
	}


	@Cuando("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPagina(List <RegistroAutomationDemo> registroAutomatioDemo) throws Exception {
		carlos.attemptsTo(Diligenciar.ElFormulario(registroAutomatioDemo));
	}

	@Entonces("^el verificar que la pantalla carga con texto (.*)$")
	public void elVerificarQueLaPantallaCargaConTextoDoubleClickOnEditIconToEDITTheTableRow(String texto) throws Exception {

		  carlos.should(seeThat(Registro.FueExitoso(), equalTo(texto)));
	}

}
