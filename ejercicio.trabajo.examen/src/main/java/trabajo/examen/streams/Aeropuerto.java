package trabajo.examen.streams;

import java.util.List;

public class Aeropuerto {

	private Integer id;
	private String ciudad;
	private String name;
	
	public Aeropuerto() {
		
	}

	
	public Aeropuerto(Integer id, String ciudad, String name) {
		this.id = id;
		this.ciudad = ciudad;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Aeropuerto [id=" + id + ", ciudad=" + ciudad + ", name=" + name + "]";
	}
	
	
}
