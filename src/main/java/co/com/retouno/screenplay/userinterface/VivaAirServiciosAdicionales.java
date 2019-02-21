package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class VivaAirServiciosAdicionales extends PageObject{

	
	public static final Target CAMPO_CABINA_ADULTO = Target.the("campo equipaje cabina adulto ")
			.located(By.xpath("//div[@id='s2id_autogen86']"));
				
	public static final Target LISTA_CABINA_ADULTO = Target.the("lista equipaje cabina adulto")
			.located(By.id("select2-results-87"));
	
	public static final Target CAMPO_CABINA_NINO1 = Target.the("campo equipaje cabina  niño 1")
			.located(By.id("s2id_autogen92"));
			
	public static final Target LISTA_CABINA_NINO1 = Target.the("lista equipaje cabina adulto")
			.located(By.id("select2-results-93"));
	
	public static final Target CAMPO_CABINA_NINO2 = Target.the("campo equipaje cabina niño 2")
			.located(By.id("s2id_autogen98"));
			
	public static final Target LISTA_CABINA_NINO2 = Target.the("lista equipaje cabina niño 2")
			.located(By.id("select2-results-99"));
	
	
	
	public static final Target CAMPO_BODEGA_ADULTO = Target.the("campo equipaje BODEGA adulto ")
			.located(By.id("s2id_autogen104"));
			
	public static final Target LISTA_BODEGA_ADULTO = Target.the("lista equipaje BODEGA adulto")
			.located(By.id("select2-results-105"));
	
	public static final Target CAMPO_BODEGA_NINO1 = Target.the("campo equipaje BODEGA  niño 1")
			.located(By.id("s2id_autogen110"));
			
	public static final Target LISTA_BODEGA_NINO1 = Target.the("lista equipaje BODEGA adulto")
			.located(By.id("select2-results-111"));
	
	public static final Target CAMPO_BODEGA_NINO2 = Target.the("campo equipaje BODEGA niño 2")
			.located(By.id("s2id_autogen116"));
			
	public static final Target LISTA_BODEGA_NINO2 = Target.the("lista equipaje BODEGA niño 2")
			.located(By.id("select2-results-117"));
	
	
	public static final Target CAMPO_CHECK_ADULTO = Target.the("campo CHECK adulto ")
			.located(By.id("s2id_autogen122"));
			
	public static final Target LISTA_CHECK_ADULTO = Target.the("lista CHECK adulto")
			.located(By.id("select2-results-123"));
	
	public static final Target CAMPO_CHECK_NINO1 = Target.the("campo  CHECK  niño 1")
			.located(By.id("s2id_autogen128"));
			
	public static final Target LISTA_CHECK_NINO1 = Target.the("lista  CHECK adulto")
			.located(By.id("select2-results-129"));
	
	public static final Target CAMPO_CHECK_NINO2 = Target.the("campo  CHECK niño 2")
			.located(By.id("s2id_autogen134"));
			
	public static final Target LISTA_CHECK_NINO2 = Target.the("lista  CHECK niño 2")
			.located(By.id("select2-results-135"));
	
	
	
	public static final Target CAMPO_FILA_RAPIDA = Target.the("campo fila rapida ")
			.located(By.id("s2id_autogen140"));
			
	public static final Target LISTA_FILA_RAPIDA = Target.the("lista fila rapida")
			.located(By.id("select2-results-141"));

	
	
	public static final Target CAMPO_TRANQUILO = Target.the("campo tranquilo ")
			.located(By.id("s2id_autogen146"));
			
	public static final Target LISTA_TRANQUILO = Target.the("lista tranquilo")
			.located(By.id("select2-results-147"));
	
	public static final Target CHECK_PROGRAMA_SEGURO = Target.the("check programa seguro")
			.located(By.id("travel-insurance-checkbox-5961"));
	
	public static final Target BOTON_CONTINUAR_ADICIONALES = Target.the("boton continuar servicios adicionales")
			.located(By.id("extrasContinue"));
	
	
	
	public static final Target BOTON_CONTINUAR_GRACIAS = Target.the("boton continuar servicios adicionales")
			.located(By.xpath("//a[@title='No, dejaré que el sistema me asigne un asiento sin costo.']"));
	
	

}
