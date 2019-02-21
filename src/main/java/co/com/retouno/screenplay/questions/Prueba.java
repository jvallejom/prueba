package co.com.retouno.screenplay.questions;

import co.com.retouno.screenplay.userinterface.VivaAirMensajeServicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Prueba implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(VivaAirMensajeServicios.MENSAJE_FINAL).viewedBy(actor).asString();
	}

	public static Prueba FueExitosa() {
		// TODO Auto-generated method stub
		return new Prueba();
	}

}
