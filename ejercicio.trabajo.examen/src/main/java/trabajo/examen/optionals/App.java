package trabajo.examen.optionals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static PasajeroSearch pasajeroSearch;
	
	public static void main(String[] args) {
		
		Pasajero pasajero1 = new Pasajero(1, "Nadia", "Apellido1", "DNI1", 20 , "123456789");
		Pasajero pasajero2 = new Pasajero(2, "Antonio", "Apellido2", "DNI2", 10 , "123456789");
		Pasajero pasajero3 = new Pasajero(3, "Miguel", "Apellido3", "DNI3", 30 , "123456789");
		Pasajero pasajero4 = new Pasajero(4, "Pedro", "Apellido4", "DNI4", 40 , "123456789");
		Pasajero pasajero5 = new Pasajero(5, "Jose", "Apellido5", "DNI5", 22 , "123456789");
		Pasajero pasajero6 = new Pasajero(6, "Alba", "Apellido6", "DNI6", 23 , "123456789");
		Pasajero pasajero7 = new Pasajero(7, "Luis", "Apellido7", "DNI7", 24 , "123456789");
		Pasajero pasajero8 = new Pasajero(8, "Juan", "Apellido8", "DNI8", 25 , "123456789");
		Pasajero pasajero9 = new Pasajero(9, "Pepe", "Apellido9", "DNI9", 31 , "123456789");
		Pasajero pasajero10 = new Pasajero(10, "Elena", "Apellido10", "DNI10", 50 , "123456789");
		Pasajero pasajero11 = new Pasajero(11, "Alejandro", "Apellido11", "DNI11", 60 , "123456789");
		Pasajero pasajero12 = new Pasajero(12, "Javier", "Apellido12", "DNI12", 8 , "123456789");
		Pasajero pasajero13 = new Pasajero(13, "Daniel", "Apellido13", "DNI13", 12 , "123456789");
		Pasajero pasajero14 = new Pasajero(14, "FCAs", "fcas", "DNI14", 15 , "123456789");
		Pasajero pasajero15 = new Pasajero(15, "INDRA", "Indra", "DNI15", 17 , "123456789");
		
		Billete b1 = new Billete(1,25.0, pasajero1);
		Billete b2 = new Billete(2,25.0, pasajero2);
		Billete b3 = new Billete(3,10.0, pasajero3);
		Billete b4 = new Billete(4,42.0, pasajero4);
		Billete b5 = new Billete(5,34.0, pasajero5);
		Billete b6 = new Billete(6,120.0, pasajero6);
		Billete b7 = new Billete(7,234.0, pasajero7);
		Billete b8 = new Billete(8,50.0, pasajero8);
		Billete b9 = new Billete(9,55.0, pasajero9);
		Billete b10 = new Billete(10,45.0, pasajero10);
		Billete b11 = new Billete(11,55.0, pasajero11);
		Billete b12 = new Billete(12,73.0, pasajero12);
		Billete b13 = new Billete(13,32.0, pasajero13);
		Billete b14 = new Billete(14,60.0, pasajero14);
		Billete b15 = new Billete(15,62.0, pasajero15);
		
		List<Billete> billetes1 = new ArrayList<Billete>();
		billetes1.add(b1);
		billetes1.add(b2);
		billetes1.add(b3);
		billetes1.add(b4);
		
		List<Billete> billetes2 = new ArrayList<Billete>();
		billetes2.add(b5);
		billetes2.add(b6);
		billetes2.add(b7);
		billetes2.add(b8);
		
		List<Billete> billetes3 = new ArrayList<Billete>();
		billetes3.add(b9);
		billetes3.add(b10);
		billetes3.add(b11);
		
		List<Billete> billetes4 = new ArrayList<Billete>();
		billetes4.add(b12);
		
		List<Billete> billetes5 = new ArrayList<Billete>();
		billetes5.add(b13);
		billetes5.add(b14);
		
		List<Billete> billetes6 = new ArrayList<Billete>();
		billetes6.add(b15);
		
		Aeropuerto aeropuerto1 = new Aeropuerto(1, "ciudad1", "nombre1");
		Aeropuerto aeropuerto2 = new Aeropuerto(1, "ciudad2", "nombre2");
		Aeropuerto aeropuerto3 = new Aeropuerto(1, "ciudad3", "nombre3");
		
        Vuelo v1 = new Vuelo(1, "123456A", aeropuerto1, aeropuerto2,LocalDate.of(2022, 5, 28), 125,billetes1);
        Vuelo v2 = new Vuelo(2,"654321Q", aeropuerto1, aeropuerto2,LocalDate.of(2022, 3, 21), 70,billetes2);
        Vuelo v3 = new Vuelo(3,"192837J", aeropuerto1, aeropuerto3,LocalDate.of(2022, 9, 19), 90,billetes3);
        Vuelo v4 = new Vuelo(4,"101010P", aeropuerto2, aeropuerto1,LocalDate.of(2022, 10, 15), 100, billetes4);
        Vuelo v5 = new Vuelo(5,"103212P", aeropuerto3, aeropuerto1,LocalDate.of(2021, 12, 3), 156, billetes5);
        Vuelo v6 = new Vuelo(6,"990021I", aeropuerto3, aeropuerto2,LocalDate.of(2022, 1, 10), 80, billetes6);
        
        List<Vuelo> vuelos = new ArrayList<Vuelo>();
        vuelos.add(v1);
        vuelos.add(v2);
        vuelos.add(v3);
        vuelos.add(v4);
        vuelos.add(v5);
        vuelos.add(v6);
       
        pasajeroSearch = new PasajeroSearch();
        
        ejercicioOptionals2(billetes1);
        ejercicioOptionals3();

	}
	
	public static void ejercicioOptionals1() {
		Optional <Pasajero> pasajero = pasajeroSearch.searchOptional(1);
		Optional<Pasajero> optionalPasajero = pasajeroSearch.searchOptional(2);
		if(optionalPasajero.isPresent()) {
		Optional<Pasajero> optPasajero = optionalPasajero.get().getName();
		if(pasajero.isPresent()) {
			Optional<Pasajero> optPasajero = optionalPasajero.get().getName();
		if(optBillete.isPresent()) {
		System.out.println(optBillete.get().getPrecio());
		}
		}
		}
		}
    private static void ejercicioOptionals3() {
    	Optional <Pasajero> pasajero = pasajeroSearch.searchOptional(1);
    	
    	if (pasajero.isPresent()) {
    		System.out.println(pasajero.get().getName());
    	}else {
    		System.out.println("pasajero no está");
    	}
    }
	private static void ejercicioOptionals2(List<Billete> billete) {
        Stream<Billete> billeteStream = billete.stream();
        
        Comparator<Billete> comparaMin = new Comparator<Billete>() {
            public int compare(Billete billete1, Billete billete2) {
                return billete1.getPrecio().intValue() - billete2.getPrecio().intValue();
            }
        };
        
        Optional<Billete> billeteMin = billeteStream.min(comparaMin);
         if(billeteMin.isPresent()) {
             System.out.println("Billete más barato: " + billeteMin.get().getId());
         }
        
    }


}
