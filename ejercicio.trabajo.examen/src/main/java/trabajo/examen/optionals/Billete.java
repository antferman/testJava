package trabajo.examen.optionals;

import java.time.LocalDate;

public class Billete {

	private Integer id;
	private Double precio;
	private Pasajero pasajero;
	
	public Billete() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}



	@Override
	public String toString() {
		return "Billete [id=" + id + ", precio=" + precio + ", pasajero=" + pasajero + "]";
	}

	public Billete(Integer id, Double precio, Pasajero pasajero) {
		this.id = id;
		this.precio = precio;
		this.pasajero = pasajero;

	}
	
	
}
