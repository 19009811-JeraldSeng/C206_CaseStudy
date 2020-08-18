import java.util.*;
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
		// DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy
		// HH:mm:ss");
		// String formattedDate = timeNow.format(formatter1);

		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));

		menu();
		int option = Helper.readInt("Enter an option");

		// Syakir
		while (option != 6) {

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				UserAccount(accountList);
			} else if (option == 2) {

			} else if (option == 3) {

			} else if (option == 4) {

			} else if (option == 5) {

			} else {
				System.out.println("Invalid option");

			}
			menu();
			option = Helper.readInt("Enter an option");
		}
	}

	// Syakir
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

	private static void UserAccount(ArrayList<UserAccount> accountList) {
		System.out.println(
				"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Back to menu");

		int option = Helper.readInt("Enter an option > ");
		while (option != 4) {
			if (option == 1) {

			} else if (option == 2) {

			} else if (option == 3) {

			} else {
				System.out.println("'Invalid option");
			}
		}
		System.out.println(
				"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Back to menu");
		option = Helper.readInt("Enter an option > ");
	}

}
