package trabajo.examen.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

	public static void main (String Args[]) {
		ejercicio1Java();
		ejercicio2Java();
		ejercicio3JavaPredicate();
		ejercicio3JavaSupplier();
		ejercicio3JavaFunction();
		ejercicio3JavaConsumer();
	}
	
	public static void ejercicio1Java() {
		String parameter = "Hola Nadia esto es un 10";
		InterfaceEjercicio1 ejercicio1Java = new InterfaceEjercicio1() {
			
			public void passParameter(String parameter) {
				System.out.println("Te saludamos desde el ejercicio 1: "+ parameter);
				
			}
		};
		ejercicio1Java.passParameter(parameter);
		
	}
	
	public static void ejercicio2Java() {
		Integer number = 4;
		InterfaceEjercicio2 ejercicio2Java = new InterfaceEjercicio2() {
			
			@Override
			public String diElNumero(Integer number) {
				// TODO Auto-generated method stub
				return "El número que no nos va  aponer Nadia es el: "+ number;
			}
		};
		System.out.println(ejercicio2Java.diElNumero(number));
	}
	
	public static void ejercicio3JavaPredicate() {
		Predicate<String> stringTelephoneFilter3 = telephone -> telephone.startsWith("7") || telephone.startsWith("6");
		boolean result = stringTelephoneFilter3.test("654987321");
		System.out.println(result);
	}
	
	public static void ejercicio3JavaSupplier() {
		Supplier<Double> doubleSupplier = Math::random;

		Double res = doubleSupplier.get();
		
		System.out.println(res);
	}

	public static void ejercicio3JavaFunction() {
		Function<String, Boolean> search = busqueda -> busqueda.contains("í");
        
        Boolean busquedaCaracter = search.apply("Había huecos");
        System.out.println(busquedaCaracter);
	}
	
	public static void ejercicio3JavaConsumer() {
		Consumer<Integer> consumerInteger = number -> System.out.println("¿Es numero par? " + String.valueOf(Math.floorMod(number, 2) == 0));
		
		consumerInteger.accept(5);
	}
}
