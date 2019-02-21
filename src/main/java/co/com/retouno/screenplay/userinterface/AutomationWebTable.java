package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationWebTable extends PageObject {

	public static final Target LABEL_CONFIRMACION = Target.the("Mensaje para cofirmar texto Web table")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
	
			
}
