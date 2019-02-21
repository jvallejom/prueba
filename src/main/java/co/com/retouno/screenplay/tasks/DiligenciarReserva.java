package co.com.retouno.screenplay.tasks;

import java.util.List;

import co.com.retouno.screenplay.interactions.Wait_5;
import co.com.retouno.screenplay.interactions.SeleccionarDiaCalendario;
import co.com.retouno.screenplay.interactions.SeleccionarLista;
import co.com.retouno.screenplay.model.ReservaVueloDatos;
import co.com.retouno.screenplay.userinterface.VivaAirReserva;
import co.com.retouno.screenplay.userinterface.VivarAirHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class DiligenciarReserva implements Task{ 
	
	private List <ReservaVueloDatos> listaReservaDatos;
	 
	

	public DiligenciarReserva(List<ReservaVueloDatos> listaReservaDatos) {
		super();
		this.listaReservaDatos = listaReservaDatos;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivarAirHome.CAMPO_ORIGEN),
				SeleccionarLista.Desde(VivarAirHome.LISTA_ORIGEN, listaReservaDatos.get(0).getOrigen()),
				Click.on(VivarAirHome.CAMPO_DESTINO),
				SeleccionarLista.Desde(VivarAirHome.LISTA_DESTINO, listaReservaDatos.get(0).getDestino()),
				Enter.theValue(listaReservaDatos.get(0).getFecha_regreso()).into(VivarAirHome.FECHA_REGRESO),
				Enter.theValue(listaReservaDatos.get(0).getFecha_ida()).into(VivarAirHome.FECHA_IDA),
				Click.on(VivarAirHome.CAMPO_MONEDA),
				SeleccionarLista.Desde(VivarAirHome.LISTA_MONEDA, listaReservaDatos.get(0).getMoneda()),
				Click.on(VivarAirHome.CAMPO_ADULTO),
				SeleccionarLista.Desde(VivarAirHome.LISTA_ADULTO, listaReservaDatos.get(0).getNumero_adultos()),
				Click.on(VivarAirHome.CAMPO_NINOS),
				SeleccionarLista.Desde(VivarAirHome.LISTA_NINOS, listaReservaDatos.get(0).getNumero_ninos()),
				Click.on(VivarAirHome.CAMPO_INFANTES),
				SeleccionarLista.Desde(VivarAirHome.LISTA_INFANTES, listaReservaDatos.get(0).getNumero_infantes()),
				Click.on(VivarAirHome.RADIO_PRECIO_MES),
				Click.on(VivarAirHome.BOTON_RESERVAR),
				WaitUntil.the(VivaAirReserva.MENSAJE_ESPERA,isVisible()).forNoMoreThan(10).seconds(),
				SeleccionarDiaCalendario.Desdetabla(VivaAirReserva.TABLA_IDA),
				SeleccionarDiaCalendario.Desdetabla(VivaAirReserva.TABLA_REGRESO),
				Click.on(VivaAirReserva.BOTON_CONTINUAR),
				Wait_5.aMoment(),
				Click.on(VivaAirReserva.BOTON_IDA),
				Click.on(VivaAirReserva.BOTON_REGRESO),
				Wait_5.aMoment(),
				Click.on(VivaAirReserva.BOTON_ACEPTO)
				
				);
	}

	public static DiligenciarReserva DelVuelo(List<ReservaVueloDatos> reservaVueloDatos) {
		
		return Tasks.instrumented(DiligenciarReserva.class, reservaVueloDatos);
	}

}
