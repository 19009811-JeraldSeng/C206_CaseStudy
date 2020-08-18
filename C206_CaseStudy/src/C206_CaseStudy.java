import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syakir
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		ArrayList<UserAccount> accountList = new ArrayList<UserAccount>();
		LocalDate dateNow = LocalDate.now();
		LocalDateTime timeNow = LocalDateTime.now();

		// if using when customer use a different format
		//DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//String formattedDate = timeNow.format(formatter1);

		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));

		int option = 0;

		//Syakir
		while (option != 6) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

			} else if (option == 2) {

				
			} else if (option == 3) {
				
				
			} else if (option == 4) {

				
			} else if (option == 5) {
			
			} else if (option == 6){
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}
	//Syakir
	public static void menu() {
		C206_CaseStudy.setHeader("RENOVATION ACE");
		System.out.println("1. User Account");
		System.out.println("2. Quotations");
		System.out.println("3. Appointment");
		System.out.println("4. Package");
		System.out.println("5. Request for Quotation");
		System.out.println("6. Exit");
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
	private static void UserAccount(ArrayList<UserAccount>accountList) {
		
	}

}
