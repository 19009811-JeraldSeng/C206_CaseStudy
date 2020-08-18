import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syakir
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		LocalDate dateNow = LocalDate.now();
		LocalDateTime timeNow = LocalDateTime.now();

		// if using when customer use a different format
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = timeNow.format(formatter1);

		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));

		int option = 0;

		//Syakir
		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items

			} else if (option == 2) {
				// Add a new item

			} else if (option == 3) {
				// Loan item

			} else if (option == 4) {

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}
	//Syakir
	public static void menu() {
		C206_CaseStudy.setHeader("RENOVATION ACE");
		System.out.println("1. TEST1");
		System.out.println("2. TEST2");
		System.out.println("3. TEST3");
		System.out.println("4. TEST4");
		System.out.println("5. TEST5");
		Helper.line(80, "-");

	}

	/**
	 * @param string
	 */
	private static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");

	}

}
