package co.com.retouno.screenplay.tasks;

import co.com.retouno.screenplay.userinterface.VivarAirHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbirLaPagina implements Task{
	
	private VivarAirHome vivaAirHome;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(vivaAirHome));
	}

	public static AbirLaPagina VivaAir() {
		return Tasks.instrumented(AbirLaPagina.class);
	}

}
