package co.com.retouno.screenplay.interactions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarDiaCalendario implements Interaction {
	
	private Target tabla;
   	
	public SeleccionarDiaCalendario(Target tabla) {
		super();
		this.tabla = tabla;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		 double menor = 500.00;
         int indice= 0;

 
		List<WebElement> spanes= tabla.resolveFor(actor).findElements(By.xpath("//td[@class='DateBox']/div/div[2]/div[2]/span[@class='hidden-xs']"));

		
		for(int i=0; i<spanes.size();i++) {
			
				 String dato = spanes.get(i).getText();
				 dato = dato.replace("USD ", "");
		 
				 double dnum = Double.parseDouble(dato);
				 System.out.println(dnum);
				 
				  if (dnum <= menor) {
	                    menor = dnum;
	                    indice = i;
	                   
	                }
			 
			 i++;
		}
		
		 spanes.get(indice).click();

	}
		
	public static SeleccionarDiaCalendario Desdetabla(Target tabla) {
        return new SeleccionarDiaCalendario(tabla);
	}
	
}

