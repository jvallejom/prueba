package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class VivaAirReserva extends PageObject {
	
	public static final Target MENSAJE_ESPERA = Target.the("mensaje de espera")
			.located(By.id("monthContinue"));
					
	public static final Target TABLA_IDA = Target.the("tabla de pasajes de ida")
			.located(By.id("jMonthCalendarOut"));
	
	public static final Target TABLA_REGRESO = Target.the("tabla de pasajes de regreso")
			.located(By.id("jMonthCalendarIn"));
	
	public static final Target BOTON_CONTINUAR = Target.the("boton para continuar con la reserva")
			.located(By.id("monthContinue"));
	
	public static final Target BOTON_IDA = Target.the("boton para continuar con la reserva ida")
			.located(By.xpath("//*[@id=\"divAvailabilityOut\"]/div[1]/div[1]/div[2]/label[1]/div/div[1]/div[3]/div"));
	
	public static final Target BOTON_REGRESO = Target.the("boton para continuar con la reserva regreso")
			.located(By.xpath("//*[@id=\"divAvailabilityIn\"]/div[1]/div[1]/div[2]/label[1]/div/div[1]/div[3]/div"));
	
	public static final Target BOTON_ACEPTO = Target.the("boton para continuar")
			.located(By.xpath("//*[@id=\"fancyConfirm\"]/div[4]/a/span"));
	
	
}
