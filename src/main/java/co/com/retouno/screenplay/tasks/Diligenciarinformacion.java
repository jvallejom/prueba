package co.com.retouno.screenplay.tasks;

import java.util.List;

import co.com.retouno.screenplay.interactions.SeleccionarLista;
import co.com.retouno.screenplay.interactions.Wait_5;
import co.com.retouno.screenplay.model.ReservaInformacionVueloDatos;
import co.com.retouno.screenplay.userinterface.VivaAirReserva2;
import co.com.retouno.screenplay.userinterface.VivaAirServiciosAdicionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.actions.Enter;

public class Diligenciarinformacion implements Task {
	
	private List <ReservaInformacionVueloDatos> listaReservaInformacion;

	public Diligenciarinformacion(List<ReservaInformacionVueloDatos> listaReservaInformacion) {
		super();
		this.listaReservaInformacion = listaReservaInformacion;
	}
 
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( Enter.theValue(listaReservaInformacion.get(0).getNombre_adulto()).into(VivaAirReserva2.CAMPO_NOMBRE_ADULTO),
				Enter.theValue(listaReservaInformacion.get(0).getApellido_adulto()).into(VivaAirReserva2.CAMPO_APELLIDO_ADULTO),
				Click.on(VivaAirReserva2.CAMPO_GENERO_ADULTO),
				SeleccionarLista.Desde(VivaAirReserva2.LISTA_GENERO_ADULTO, listaReservaInformacion.get(0).getGenero_adulto()),
				
				
				
				Enter.theValue(listaReservaInformacion.get(0).getDocumento_adulto()).into(VivaAirReserva2.CAMPO_DOCUMENTO_ADULTO),
				Enter.theValue(listaReservaInformacion.get(0).getCorreo()).into(VivaAirReserva2.CAMPO_CORREO_ADULTO),
				Enter.theValue(listaReservaInformacion.get(0).getCorreo()).into(VivaAirReserva2.CAMPO_CORREO2_ADULTO),
				Enter.theValue(listaReservaInformacion.get(0).getCelular()).into(VivaAirReserva2.CAMPO_CELULAR_ADULTO),
				
				Enter.theValue(listaReservaInformacion.get(0).getNombre_nino1()).into(VivaAirReserva2.CAMPO_NOMBRE_NIÑO1),
				Enter.theValue(listaReservaInformacion.get(0).getApellidos_nino1()).into(VivaAirReserva2.CAMPO_APELLIDO_NIÑO1),
				Type.theValue(listaReservaInformacion.get(0).getNacimiento_nino1()).into(VivaAirReserva2.FECHA_NACIMIENTO_NIÑO1),
				//Wait_5.aMoment(),
				Click.on(VivaAirReserva2.CAMPO_GENERO_NIÑO1),
				SeleccionarLista.Desde(VivaAirReserva2.LISTA_GENERO_NIÑO1, listaReservaInformacion.get(0).getGenero_nino1()),
				Enter.theValue(listaReservaInformacion.get(0).getDocumento_nino1()).into(VivaAirReserva2.CAMPO_DOCUMENTO_NIÑO1),
				Enter.theValue(listaReservaInformacion.get(0).getNombre_nino2()).into(VivaAirReserva2.CAMPO_NOMBRE_NIÑO2),
				Enter.theValue(listaReservaInformacion.get(0).getApellidos_nino2()).into(VivaAirReserva2.CAMPO_APELLIDO_NIÑO2),
				Type.theValue(listaReservaInformacion.get(0).getNacimiento_nino2()).into(VivaAirReserva2.FECHA_NACIMIENTO_NIÑO2),
				//Wait_5.aMoment(),
				Click.on(VivaAirReserva2.CAMPO_GENERO_NIÑO2),
				SeleccionarLista.Desde(VivaAirReserva2.LISTA_GENERO_NIÑO2, listaReservaInformacion.get(0).getGenero_nino2()),
				Enter.theValue(listaReservaInformacion.get(0).getDocumento_nino2()).into(VivaAirReserva2.CAMPO_DOCUMENTO_NIÑO2),
				Enter.theValue(listaReservaInformacion.get(0).getNombre_infante()).into(VivaAirReserva2.CAMPO_NOMBRE_INFANTE),
				Enter.theValue(listaReservaInformacion.get(0).getApellido_infante()).into(VivaAirReserva2.CAMPO_APELLIDO_INFANTE),
				Type.theValue(listaReservaInformacion.get(0).getNacimiento_infante()).into(VivaAirReserva2.FECHA_NACIMIENTO_INFANTE),
				Wait_5.aMoment(),
				Click.on(VivaAirReserva2.BOTON_CONTINUAR),
				Wait_5.aMoment(),				
				Click.on(VivaAirServiciosAdicionales.CAMPO_CABINA_ADULTO),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CABINA_ADULTO, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_CABINA_NINO1),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CABINA_NINO1, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_CABINA_NINO2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CABINA_NINO2, "No gracias."),
				
				Click.on(VivaAirServiciosAdicionales.CAMPO_BODEGA_ADULTO),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_BODEGA_ADULTO, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_BODEGA_NINO1),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_BODEGA_NINO1, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_BODEGA_NINO2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_BODEGA_NINO2, "No gracias."),
				
				Click.on(VivaAirServiciosAdicionales.CAMPO_CHECK_ADULTO),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CHECK_ADULTO, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_CHECK_NINO1),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CHECK_NINO1, "No gracias."),
				Click.on(VivaAirServiciosAdicionales.CAMPO_CHECK_NINO2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_CHECK_NINO2, "No gracias."),
				
				Click.on(VivaAirServiciosAdicionales.CAMPO_FILA_RAPIDA),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_FILA_RAPIDA, "No gracias."),
				
				Click.on(VivaAirServiciosAdicionales.CAMPO_TRANQUILO),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_TRANQUILO, "No gracias."),
				
				Click.on(VivaAirServiciosAdicionales.CHECK_PROGRAMA_SEGURO),
				
				Click.on(VivaAirServiciosAdicionales.BOTON_CONTINUAR_ADICIONALES),
				Wait_5.aMoment(),
				Click.on(VivaAirServiciosAdicionales.BOTON_CONTINUAR_GRACIAS)
					
				);
		
		
	}

	public static Diligenciarinformacion DelVuelo(List<ReservaInformacionVueloDatos> reservaInformacionVueloDatos) {
		return Tasks.instrumented(Diligenciarinformacion.class,reservaInformacionVueloDatos);
	}

}
