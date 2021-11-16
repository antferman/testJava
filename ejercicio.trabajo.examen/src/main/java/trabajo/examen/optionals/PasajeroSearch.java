package trabajo.examen.optionals;

import java.util.Optional;

public class PasajeroSearch {

	
	public Optional<Pasajero>searchOptional(Integer id) {
		
		switch(id) {
		 
		case 1 : return Optional.of(new Pasajero(1, "Nadia", "Apellido1", "DNI1", 20 , "123456789"));
		case 2 : return Optional.of(new Pasajero(2, "Antonio", "Apellido2", "DNI2", 10 , "123456789"));
		case 3 : return Optional.of(new Pasajero(3, "Miguel", "Apellido3", "DNI3", 30 , "123456789"));
		default: return Optional.empty();
		
		}
	}
}
