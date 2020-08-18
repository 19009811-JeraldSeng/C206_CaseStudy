import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syakir
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		LocalDate dateNow = LocalDate.now();
		LocalDateTime timeNow = LocalDateTime.now();
		
		//if using when customer use a different format
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = timeNow.format(formatter1);
		
		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));
		
		
	}

}
