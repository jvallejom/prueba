#language: es
#Author: jvallejom@choucairtesting.com



Característica: Automation Demo Site
	Como usuario 
	Quiero realizar el registro en la pagina 
	A traves del diligenciamento del formulario	
	
	@pruebaRegistro1
	Escenario: Realiza el registro desde la pagina
	Dado que carlos quiere accede a la pagina
	Cuando el realiza el registro en la pagina
	|	first_name	|	last_name	|	address	|mail	|	phone	|	genre	|	hobbies	|	languages	|	skills	|	country	|	select_country	|	date_birth_year	|	date_birth_month	|	date_birth_day|	password	|	confirm_password	|
	|	Casasdavbrlos | Osfasdasddfchoa	| carsrasdcbnasdgsgrra20 | facvbsghoa@correo.com	|	9818530639	|	Masculino	| Movies 	|	Arabic	|	Java	|	Colombia	|	Japan	|	1993	|	January	|	10	|		Abcd123456@	|	Abcd123456@	|
	Entonces el verificar que la pantalla carga con texto - Double Click on Edit Icon to EDIT the Table Row.