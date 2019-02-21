package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirMensajeServicios extends PageObject  {
	
	public static final Target MENSAJE_FINAL = Target.the(" mensaje de servicios adicionales")
			.located(By.xpath("//*[@id=\"extras\"]/div[3]/span[2]"));

}
