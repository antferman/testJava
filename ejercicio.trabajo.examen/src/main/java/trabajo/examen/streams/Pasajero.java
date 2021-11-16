package trabajo.examen.streams;

public class Pasajero {
	
	private Integer id;
	private String name;
	private String surname;
	private String dni;
	private Integer age;
	private String phone;



	public Pasajero() {
		
	}

	public Pasajero(Integer id, String name, String surname, String dni, Integer age, String phone) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.age = age;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}







	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", name=" + name + ", surname=" + surname + ", dni=" + dni + ", age=" + age
				+ ", phone=" + phone + "]";
	}

}
