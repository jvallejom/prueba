package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in")
public class AutomationHomePage extends PageObject{
	
	public static final Target BOTON_REGISTRO = Target.the("Boton para acceder a la pantalla de registro")
			.located(By.xpath("//button[contains(text(),'Skip Sign In')]"));
	

}
