#language: es
#Author: jvallejom@choucairtesting.com



Característica: Comprar Tiquetes Aéreos
  	Como persona
		Quiero comprar tiquetes para ir de vacaciones
		A través de la página web de Vivaair.com/co

	
	@pruebaCompra
	Escenario: Realiza la compra del tiquete desde la pagina
	Dado que juan quiere accede a la pagina
	Cuando el reserva el vuelo  con la siguiente datos
|	origen	|	destino	|	numero_adultos	|	numero_ninos	|	numero_infantes	| fecha_ida	|fecha_regreso|moneda|
|	Medellín, José María Córdova (MDE)	|	Bogotá (BOG)	|	1	|	2	|	1	|14/02/2019|18/03/2019|USD|
	Y llena los campos requeridos de informacion
|	nombre_adulto	|	apellido_adulto	|	documento_adulto	|	correo										|	genero_adulto	|	celular			|	nombre_nino1	|	apellidos_nino1	|	nacimiento_nino1	|	genero_nino1	|	documento_nino1	|	nombre_nino2	|	apellidos_nino2	|	nacimiento_nino2	|	genero_nino2	|	documento_nino2	|	nombre_infante	|	apellido_infante	|	nacimiento_infante	|
| 		juan			|					herrera	|		1037698885			| juan.herrera@correo.com 	|	Masculino			|	3201236598	|	camilo				|			herrera			|		06/13/2016			|		Masculino		|		1032645996		|		camila			|		herrera				|	03/09/2016				|		Femenino		|	1035654987			|	ramon						|		fuentes					|	02/05/2018					|
	Entonces el verificar que en pantalla la suma de los servicios adicionales es USD 0.00
			     