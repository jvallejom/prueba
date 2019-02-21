package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://vivaair.com/co")
public class VivarAirHome extends PageObject {
	
	public static final Target LISTA_ORIGEN = Target.the("campo de ciudad de origen")
			.located(By.id("select2-results-20"));
	
	public static final Target CAMPO_ORIGEN = Target.the("campo de ciudad de origen")
			.located(By.id("select2-chosen-20"));
	
	public static final Target LISTA_DESTINO = Target.the("campo de ciudad de destino")
			.located(By.id("select2-results-21"));
	
	public static final Target CAMPO_DESTINO = Target.the("campo de ciudad de destino")
			.located(By.id("select2-chosen-21"));
	
	public static final Target FECHA_IDA = Target.the("campo de fecha ida")
			.located(By.id("DepartureDateForDisplay"));
	
	public static final Target FECHA_REGRESO = Target.the("campo de fecha regreso")
			.located(By.id("ReturnDateForDisplay"));
		
	public static final Target LISTA_MONEDA = Target.the("campo de ciudad de destino")
	.located(By.id("select2-results-15"));

	public static final Target CAMPO_MONEDA = Target.the("campo de ciudad de destino")
	.located(By.id("select2-chosen-15"));
	
	public static final Target LISTA_ADULTO = Target.the("campo de numero de adultos")
			.located(By.id("select2-results-22"));

	public static final Target CAMPO_ADULTO = Target.the("campo de numero de adulto")
			.located(By.id("select2-chosen-22"));
	
	public static final Target LISTA_NINOS = Target.the("campo de numero de niños")
			.located(By.id("select2-results-23"));

	public static final Target CAMPO_NINOS = Target.the("campo de numero de niños")
			.located(By.id("select2-chosen-23"));
	
	public static final Target LISTA_INFANTES = Target.the("campo de numero de infantes")
			.located(By.id("select2-results-25"));

	public static final Target CAMPO_INFANTES = Target.the("campo de numero de infantes")
			.located(By.id("select2-chosen-25"));
	
	public static final Target RADIO_PRECIO_MES = Target.the("radio para precios del mes")
			.located(By.id("CalenderSearchWrapper"));
		
	public static final Target BOTON_RESERVAR = Target.the("boton para realizar la reserva")
			.located(By.id("continueLink"));
	
	public static final Target RADIO_IDA_REGRESO = Target.the("click para ida y regreso")
	.located(By.id("rbRoundtrip"));
	
	
	
	
	
	
	
}