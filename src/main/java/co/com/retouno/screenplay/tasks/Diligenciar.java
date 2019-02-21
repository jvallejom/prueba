package co.com.retouno.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.support.ui.Select;

import co.com.retouno.screenplay.interactions.SeleccionarLista;
import co.com.retouno.screenplay.model.RegistroAutomationDemo;
import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import co.com.retouno.screenplay.userinterface.AutomationRegisterPage;
import cucumber.runtime.io.UTF8OutputStreamWriter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

public class Diligenciar implements Task {
	
	private List<RegistroAutomationDemo> listaDatos;
	
	
	public Diligenciar(List<RegistroAutomationDemo> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}

		
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomationHomePage.BOTON_REGISTRO),
				Enter.theValue(listaDatos.get(0).getFirst_name() ).into(AutomationRegisterPage.CAMPO_NOMBRE));
		

		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getLast_name()).into(AutomationRegisterPage.CAMPO_APELLIDO));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getAddress()).into(AutomationRegisterPage.CAMPO_DIRECCION));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getMail()).into(AutomationRegisterPage.CAMPO_MAIL));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getPhone()).into(AutomationRegisterPage.CAMPO_TELEFONO));
	
		actor.attemptsTo(Check.whether(listaDatos.get(0).getGenre().trim().equals("Masculino")).
				andIfSo(Click.on(AutomationRegisterPage.RADIO_GENEROM)).
				otherwise(Click.on(AutomationRegisterPage.RADIO_GENEROF)));
		
		if (listaDatos.get(0).getHobbies().toString().equals("Cricket")){
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECK_HOBBIES));
		} else if (listaDatos.get(0).getHobbies().toString().equals("Movies")) {
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECK_HOBBIES1));
		} else {
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECK_HOBBIES2));
		}
		
		actor.attemptsTo(Click.on(AutomationRegisterPage.LISTA_LENGUAJE));
        actor.attemptsTo(SeleccionarLista.Desde(AutomationRegisterPage.BUSCAR_LENGUAJE, listaDatos.get(0).getLanguages().trim()));
        actor.attemptsTo(Click.on(AutomationRegisterPage.SALIR_LENGUAJE));
		
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getSkills()).from(AutomationRegisterPage.LISTA_DE_HABILIDADES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getCountry()).from(AutomationRegisterPage.LISTA_DE_PAISES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getSelect_country()).from(AutomationRegisterPage.SELECCIONAR_PAIS));
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getDate_birth_year()).from(AutomationRegisterPage.LISTA_DE_ANOS));
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getDate_birth_month()).from(AutomationRegisterPage.LISTA_DE_MESES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getDate_birth_day()).from(AutomationRegisterPage.LISTA_DE_DIAS));
       
        actor.attemptsTo(Enter.theValue(listaDatos.get(0).getPassword()).into(AutomationRegisterPage.CAMPO_CONTRASENA));
        actor.attemptsTo(Enter.theValue(listaDatos.get(0).getConfirm_password()).into(AutomationRegisterPage.CAMPO_CONFIRMAR_CONTRASENA));
       
        actor.attemptsTo(Click.on(AutomationRegisterPage.BOTON_REGISTRO));
		
		
	}
		
		 
		
		

	public static Diligenciar ElFormulario(List<RegistroAutomationDemo> registroAutomatioDemo) {
		
		return Tasks.instrumented(Diligenciar.class, registroAutomatioDemo); 
	}

}
