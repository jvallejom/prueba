package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationRegisterPage extends PageObject {
	
	public static final Target CAMPO_NOMBRE = Target.the("Campo para ingreso del nombre")
			.located(By.xpath("//input[@placeholder='First Name']"));
	
	public static final Target CAMPO_APELLIDO = Target.the("Campo para ingreso del apellido")
			.located(By.xpath("//input[@placeholder='Last Name']"));
	
	public static final Target CAMPO_DIRECCION = Target.the("Campo para ingreso de direccion")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	
	public static final Target CAMPO_MAIL = Target.the("Campo para ingreso de correo electronico")
			.located(By.xpath("//*[@id=\"eid\"]/input"));
			
	public static final Target CAMPO_TELEFONO = Target.the("Campo para ingreso del telefono")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		
	public static final Target RADIO_GENEROM = Target.the("Campo para seleccionar el genero")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
	
	public static final Target RADIO_GENEROF = Target.the("Campo para seleccionar el genero")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
	
	public static final Target CHECK_HOBBIES = Target.the("Checklist para seleccionar hobbies")
			.located(By.xpath("//*[@id=\"checkbox1\"]"));
	
	public static final Target CHECK_HOBBIES1 = Target.the("Checklist para seleccionar hobbies")
			.located(By.xpath("//*[@id=\"checkbox2\"]"));
	
	public static final Target CHECK_HOBBIES2 = Target.the("Checklist para seleccionar hobbies")
			.located(By.xpath("//*[@id=\"checkbox3\"]"));
	
	public static final Target LISTA_LENGUAJE = Target.the("Lista para seleccionar lenguaje")
			.located(By.id("msdd"));
	
	public static final Target BUSCAR_LENGUAJE = Target.the("Lista para seleccionar lenguaje")
			.located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
	
	
	public static final Target SALIR_LENGUAJE = Target.the("Lista para seleccionar lenguaje")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/label"));
	
	public static final Target LISTA_DE_HABILIDADES = Target.the("Lista para seleccionar habilidades")
            .located(By.id("Skills"));
   
    public static final Target LISTA_DE_PAISES = Target.the("Lista para seleccionar el país")
            .located(By.xpath("//select[@id='countries']"));
   
    public static final Target SELECCIONAR_PAIS = Target.the("Seleccionar el pais")
            .located(By.xpath("//select[@id='country']"));
   
    public static final Target LISTA_DE_ANOS = Target.the("Lista para seleccionar el año")
            .located(By.id("yearbox"));
   
    public static final Target LISTA_DE_MESES = Target.the("Lista para seleccionar el mes")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
   
    public static final Target LISTA_DE_DIAS = Target.the("Lista para seleccionar el día")
            .located(By.id("daybox"));
   
    public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contraseña")
            .located(By.id("firstpassword"));
   
    public static final Target CAMPO_CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar la contraseña")
            .located(By.id("secondpassword"));
   
    public static final Target AREA_DE_TRABAJO = Target.the("Área de trabajo (espacio en blanco")
            .located(By.xpath("//div[@class='container center']//div[contains(@class,'row')]"));
   
    public static final Target BOTON_REGISTRO = Target.the("El botón permite regsitrar el usuario e ingresar a la página")
            .located(By.id("submitbtn"));
	
	
	

}
