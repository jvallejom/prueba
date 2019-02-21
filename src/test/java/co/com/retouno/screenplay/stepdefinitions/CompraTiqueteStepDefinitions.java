package co.com.retouno.screenplay.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import co.com.retouno.screenplay.model.ReservaInformacionVueloDatos;
import co.com.retouno.screenplay.model.ReservaVueloDatos;
import co.com.retouno.screenplay.questions.Prueba;
import co.com.retouno.screenplay.tasks.AbirLaPagina;
import co.com.retouno.screenplay.tasks.DiligenciarReserva;
import co.com.retouno.screenplay.tasks.Diligenciarinformacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompraTiqueteStepDefinitions {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor juan = Actor.named("Juan");
	
	@Before
	public void configuracionInicial() {
		juan.can(BrowseTheWeb.with(hisBrowser));
	
	}

	@Dado("^que juan quiere accede a la pagina$")
	public void queJuanQuiereAccedeALaPagina() throws Exception {
		juan.wasAbleTo(AbirLaPagina.VivaAir());
	}
  

	@Cuando("^el reserva el vuelo  con la siguiente datos$")
	public void elReservaElVueloConLaSiguienteDatos(List<ReservaVueloDatos> reservaVueloDatos) throws Exception {
		juan.attemptsTo(DiligenciarReserva.DelVuelo(reservaVueloDatos));
	}

	@Cuando("^llena los campos requeridos de informacion$")
	public void llenaLosCamposRequeridosDeInformacion(List<ReservaInformacionVueloDatos> reservaInformacionVueloDatos) throws Exception {
		juan.attemptsTo(Diligenciarinformacion.DelVuelo(reservaInformacionVueloDatos));
	}

	@Entonces("^el verificar que en pantalla la suma de los servicios adicionales es (.*)$")
	public void elVerificarQueEnPantallaLaSumaDeLosServiciosAdicionalesEsUSD(String texto) throws Exception {
	    juan.should(seeThat(Prueba.FueExitosa(),equalTo(texto)));
	}
}
