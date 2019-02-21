package co.com.retouno.screenplay.model;

public class ReservaVueloDatos {
	
	private String origen;
	private String destino;
	private String numero_adultos;
	private String numero_ninos;
	private String numero_infantes;
	private String fecha_ida;
	private String fecha_regreso;
	private String moneda;
	
	
	
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getFecha_ida() {
		return fecha_ida;
	}
	public void setFecha_ida(String fecha_ida) {
		this.fecha_ida = fecha_ida;
	}
	public String getFecha_regreso() {
		return fecha_regreso; 
	}
	public void setFecha_regreso(String fecha_regreso) {
		this.fecha_regreso = fecha_regreso;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getNumero_adultos() {
		return numero_adultos;
	}
	public void setNumero_adultos(String numero_adultos) {
		this.numero_adultos = numero_adultos;
	}
	public String getNumero_ninos() {
		return numero_ninos;
	}
	public void setNumero_ninos(String numero_ninos) {
		this.numero_ninos = numero_ninos;
	}
	public String getNumero_infantes() {
		return numero_infantes;
	}
	public void setNumero_infantes(String numero_infantes) {
		this.numero_infantes = numero_infantes;
	}
	
}
