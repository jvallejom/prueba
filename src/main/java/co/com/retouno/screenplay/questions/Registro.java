package co.com.retouno.screenplay.questions;

import co.com.retouno.screenplay.userinterface.AutomationWebTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Registro implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AutomationWebTable.LABEL_CONFIRMACION).viewedBy(actor).asString();
	}
	


public static Registro FueExitoso() {

	return new Registro();
}

	

}
