package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirReserva2 extends PageObject {
	
	public static final Target CAMPO_NOMBRE_ADULTO = Target.the("campo nombre adulto")
			.located(By.xpath("//input[@id='Adults[0].FirstName']"));
	
	public static final Target CAMPO_APELLIDO_ADULTO = Target.the("campo apellido adulto")
			.located(By.xpath("//input[@id='Adults[0].LastName']"));
	
	public static final Target LISTA_GENERO_ADULTO = Target.the("campo genero")
			.located(By.id("select2-results-35"));
	
	public static final Target CAMPO_GENERO_ADULTO = Target.the("campo genero")
			.located(By.id("select2-chosen-35"));

	public static final Target CAMPO_DOCUMENTO_ADULTO = Target.the("campo documento adulto")
			.located(By.xpath("//input[@id='Adults[0].IdentificationNumber']"));
	
	public static final Target CAMPO_CORREO_ADULTO = Target.the("campo correo adulto")
			.located(By.xpath("//*[@id=\"Passengers[0].email\"]"));
	
	public static final Target CAMPO_CORREO2_ADULTO = Target.the("campo cofirma correo adulto")
			.located(By.xpath("//*[@id=\"Passengers[0].repeatemail\"]"));
	
	public static final Target CAMPO_CELULAR_ADULTO = Target.the("campo cel adulto")
			.located(By.xpath("//*[@id=\"Passengers0_mobile\"]"));
		
	public static final Target CAMPO_NOMBRE_NIÑO1 = Target.the("campo nombre NIÑO1")
			.located(By.xpath("//*[@id=\"Children[1].FirstName\"]"));
	
	public static final Target CAMPO_APELLIDO_NIÑO1 = Target.the("campo apellido NIÑO1")
			.located(By.xpath("//*[@id=\"Children[1].LastName\"]"));
	
	public static final Target LISTA_GENERO_NIÑO1 = Target.the("campo genero")
			.located(By.id("select2-results-36"));
	
	public static final Target CAMPO_GENERO_NIÑO1 = Target.the("campo genero")
			.located(By.id("s2id_Children[1].gender"));
	
	public static final Target FECHA_NACIMIENTO_NIÑO1 = Target.the("campo fecha")
			.located(By.xpath("//*[@id=\"Passengers_1__NativeDateOfBirth\"]"));
	
	public static final Target CAMPO_DOCUMENTO_NIÑO1 = Target.the("campo documento NIÑO1")
			.located(By.xpath("//*[@id=\"Children[1].IdentificationNumber\"]"));
	
	
	public static final Target CAMPO_NOMBRE_NIÑO2 = Target.the("campo nombre NIÑO2")
			.located(By.xpath("//input[@id='Children[2].FirstName']"));
	
	public static final Target CAMPO_APELLIDO_NIÑO2 = Target.the("campo apellido NIÑO2")
			.located(By.xpath("//*[@id=\"Children[2].LastName\"]"));

	
	public static final Target LISTA_GENERO_NIÑO2 = Target.the("campo genero")
			.located(By.id("select2-results-37"));
	
	public static final Target CAMPO_GENERO_NIÑO2 = Target.the("campo genero")
			.located(By.id("s2id_Children[2].gender"));
	
	public static final Target FECHA_NACIMIENTO_NIÑO2 = Target.the("campo fecha")
			.located(By.xpath("//input[@id='Passengers_2__NativeDateOfBirth']"));
	
	public static final Target CAMPO_DOCUMENTO_NIÑO2 = Target.the("campo documento NIÑO2")
			.located(By.xpath("//input[@id='Children[2].IdentificationNumber']"));
	
	public static final Target CAMPO_NOMBRE_INFANTE = Target.the("campo nombre INFANTE")
			.located(By.xpath("//input[@id='Infants[3].FirstName']"));
	
	public static final Target CAMPO_APELLIDO_INFANTE = Target.the("campo apellido INFANTE")
			.located(By.xpath("//input[@id='Infants[3].LastName']"));

	public static final Target FECHA_NACIMIENTO_INFANTE = Target.the("campo fecha nacimiento infante")
			.located(By.xpath("//input[@id='Passengers_3__NativeDateOfBirth']"));
	
	public static final Target BOTON_CONTINUAR = Target.the("boton continuar")
			.located(By.xpath("//a[@id='btnContinuePassengerDetails']"));

	
	public static final Target LISTA_VIAJANDO_CON = Target.the("lista viajando con")
			.located(By.id("select2-results-34"));
	
	public static final Target CAMPO_VIAJANDO_CON = Target.the("campo viajando con")
			.located(By.id("select2-chosen-34"));
	
	
	
	
	
	

}
