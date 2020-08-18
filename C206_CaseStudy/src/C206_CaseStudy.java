import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

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

		int option = Helper.readInt("Enter an option > ");
		menu();

		// Syakir
		while (option != 6) {

			if (option == 1) {
				UserAccount(accountList);
			} else if (option == 2) {

			} else if (option == 3) {
				// Syakir
				System.out.println("1. Add an Appointment");
				System.out.println("2. View all Appointment");
				System.out.println("3. Delete and Appointment");

				int apptOption = Helper.readInt("Enter an option > ");

				if (apptOption == 1) {

				}

			} else if (option == 4) {

			} else if (option == 5) {

			} else {
				System.out.println("Invalid option");
			}
			menu();
			option = Helper.readInt("Enter an option > ");
		}
		System.out.println("Thank you for using RenovationAce program!");
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
				System.out.println("ADD USER ACCOUNT");
				Helper.line(80, "-");
				String name = Helper.readString("Enter your name > ");
				String role = Helper.readString("Enter your role > ");
				String email = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter a password > ");

				accountList.add(new UserAccount(name, role, email, password));
				System.out.println("Successfully added!");
			} else if (option == 2) {
				System.out.println("VIEW ALL USERS");
				Helper.line(80, "-");

				for (int i = 0; i < accountList.size(); i++) {
					accountList.get(i).viewUser();
					System.out.println();

				}
			} else if (option == 3) {
				System.out.println("DELETE USER BY NAME");
				Helper.line(80, "-");
				String delUser = Helper.readString("Enter name to delete > ");
				boolean isDeleted = false;
				for (int i = 0; i < accountList.size(); i++) {
					if (isDeleted == false && delUser.equalsIgnoreCase(accountList.get(i).getName())) {
						accountList.remove(i);
						isDeleted = true;
					}
				}
				if (isDeleted == true) {
					System.out.println(
							String.format("Account and details of %s has been successfully deleted!", delUser));
				} else {
					System.out.println(String.format("%s is not registered to the system", delUser));
				}

			} else {
				System.out.println("'Invalid option");
				option = Helper.readInt("Enter an option > ");
			}
			System.out.println(
					"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Back to menu");
			option = Helper.readInt("Enter an option > ");

		}
	}

	// Syakir
	public static Appointment inputAppointment() {

		String name = Helper.readString("Enter name: ");
		Date date = Helper.readDate("Enter date: ");

		return null;

	}

	// Syakir
	private static void Appointment(ArrayList<ArrayList> appointmentList) {
		C206_CaseStudy.setHeader("APPOINTMENT LIST");

	}

}
