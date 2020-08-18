import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syakir
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		LocalDate dateNow = LocalDate.now();
		LocalDateTime timeNow = LocalDateTime.now();

		// Jerald
		ArrayList<UserAccount> accountList = new ArrayList<UserAccount>();

		// if using when customer use a different format
		// DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy
		// HH:mm:ss");
		// String formattedDate = timeNow.format(formatter1);

		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));

		// Jerald
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

	// Jerald
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
				String status = Helper.readString("Enter your status > ");
				accountList.add(new UserAccount(name, role, email, password, status));
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
					if (isDeleted == false && accountList.get(i).getName().equalsIgnoreCase(delUser)) {
						accountList.remove(i);
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
			}
		}
		System.out.println(
				"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Back to menu");
		option = Helper.readInt("Enter an option > ");
	}

}
