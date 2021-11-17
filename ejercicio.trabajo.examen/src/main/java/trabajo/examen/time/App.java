package trabajo.examen.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(2021, 11, 17);
		LocalTime fecha2 = LocalTime.of(12, 20,25);
		String fecha3 = "17/11/2021";
		LocalDateTime fecha4 = LocalDateTime.of(fecha, fecha2);
		ejercicio1Time(fecha);
		ejercicio2Time(fecha2);
		ejercicio3Time(fecha3);
		ejercicio4Time(fecha4);
		ejercicio5Extra(fecha4);
		
	}

	private static void ejercicio5Extra(LocalDateTime fecha4) {
		// Zonahoraria
		
		ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZonedDateTime zdt = ZonedDateTime.of(fecha4, madrid);
		System.out.println("Madrid: " + zdt);
		
		
	}

	private static void ejercicio4Time(LocalDateTime fecha4) {
		LocalDate fecha = LocalDate.of(fecha4.getYear(), fecha4.getMonthValue(), fecha4.getDayOfMonth());
		System.out.println("Hora: " + fecha4.getHour() + " Fecha: " + fecha.toString());
	}

	private static void ejercicio2Time(LocalTime fecha2) {
		System.out.println("Hora: "+ fecha2.getHour() + " minutos: "+ fecha2.getMinute() + " nanosegundos: "+ fecha2.getNano());
		
	}

	private static void ejercicio1Time(LocalDate fecha) {
		
		System.out.println("Hoy es el día "+ fecha.getDayOfYear() + " del año "+ fecha.getYear() + " del mes "+ fecha.getMonth());
	}
	
	private static void ejercicio3Time(String fecha) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaFormateada = null;
		 try {
			 fechaFormateada = simpleDateFormat.parse(fecha);
			 System.out.println("Fecha formateada:  " + fechaFormateada);
			 
		 }catch (ParseException e) {
			 e.printStackTrace();
		 }
	}

	
}
