import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syakir
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		// Jerald
		ArrayList<UserAccount> accountList = new ArrayList<UserAccount>();
		// Fatheen
		ArrayList<Package> packageList = new ArrayList<Package>();
		LocalDate dateNow = LocalDate.now();
		LocalTime timeNow = LocalTime.now();

		// if using when customer use a different format
		// DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy
		// HH:mm:ss");
		// String formattedDate = timeNow.format(formatter1);

		// Syakir
		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));
		// Jerald: Adding a customer to the user account list
		accountList.add(new UserAccount("Joe", "Customer", "joe@email.com", "Joe123"));
		// Fatheen
		packageList.add(new Package("WTCS", "For Rain", "14/03/2020", "10/04/2020", "42.20"));

		// Jerald
		Helper.line(80, "-");
		System.out.println("RENOVATION ACE");
		Helper.line(80, "-");

		int maxAttempts = 0;

		while (maxAttempts < 3) {
			String emailLogin = Helper.readString("Email > ");
			String pwLogin = Helper.readString("Password > ");
			for (int i = 0; i < accountList.size(); i++) {
				if (emailLogin.equals(accountList.get(i).getEmail())
						&& pwLogin.equals(accountList.get(i).getPassword())) {
					menu();
					int option = Helper.readInt("Enter an option > ");

					// Syakir
					while (option != 6) {

						if (option == 1) {
							UserAccount(accountList);
						} else if (option == 2) {

						} else if (option == 3) {
							// Syakir
							Appointment(appointmentList);

						} else if (option == 4) {
							// Fatheen
							ManagePackage(packageList);

						} else if (option == 5) {

						} else {
							System.out.println("Invalid option");
						}
						menu();
						option = Helper.readInt("Enter an option > ");
					}
					System.out.println("Thank you for using RenovationAce program!");
					break;
				} else {
					System.out.println("Incorrect email/password.");
					maxAttempts++;
				}
			}
		}
		System.out.println("BLOCK");

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
	// Syakir
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	// Syakir
	public static Appointment inputAppointment() {
		String name = Helper.readString("Enter name: ");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("M/d/yyyy");
		String inputDate = Helper.readString("Enter date in (M/d/yyyy) format : ");
		LocalDate date = LocalDate.parse(inputDate, formatter1);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		String inputTime = Helper.readString("Enter time in (HH:mm) format : ");
		LocalTime time = LocalTime.parse(inputTime, formatter2);
		String designerName = Helper.readString("Enter designer name: ");
		String address = Helper.readString("Enter address");

		Appointment appt = new Appointment(name, date, time, designerName, address);

		return appt;

	}

	// Syakir
	public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment appt) {

		appointmentList.add(appt);
		System.out.println("Appointment added");

	} // Syakir

	public static void Appointment(ArrayList<Appointment> appointmentList) {
		C206_CaseStudy.setHeader(
				"APPOINTMENT LIST\n1. Add appointment\n2. View appointment\n3. Delete appointment\n4. Search appointment by name, designer name, appoint-date\n5. "
						+ "Update appointment with appointment date and time\n6. Back to main menu");
		int option = Helper.readInt("Enter an option > ");

		while (option != 6) {

			if (option == 1) {
				System.out.println("ADD APPOINTMENT");

				// C206_CaseStudy.addAppointment(appointmentList, appt);
				String name = Helper.readString("Enter name: ");

				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
				String inputDate = Helper.readString("Enter date in (MM-dd-yyyy) format : ");
				LocalDate date = LocalDate.parse(inputDate, formatter1);

				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
				String inputTime = Helper.readString("Enter time in (HH:mm) format : ");
				LocalTime time = LocalTime.parse(inputTime, formatter2);

				String designerName = Helper.readString("Enter designer name: ");
				String address = Helper.readString("Enter address: ");

				Appointment appt = new Appointment(name, date, time, designerName, address);
				appointmentList.add(appt);
				System.out.println("Appointment added successfully");

			} else if (option == 2) {

				System.out.println("VIEW ALL APPOINTMENT");
				Helper.line(80, "-");

				for (int i = 0; i < appointmentList.size(); i++) {
					appointmentList.get(i).showApptDetails();
					System.out.println();

				}

			} else if (option == 3) {
				System.out.println("DELETE APPOINTMENT");
				Helper.line(80, "-");
				String delAppt = Helper.readString("Enter customer name:");
				boolean isDeleted = false;

				for (int i = 0; i < appointmentList.size(); i++) {
					if (isDeleted == false && delAppt.equalsIgnoreCase(appointmentList.get(i).getCustomerName())) {
						appointmentList.remove(i);
						isDeleted = true;
					}
				}
				if (isDeleted == true) {
					Helper.line(80, "-");
					System.out.println(
							String.format("Appointment details of %s has been successfully deleted.", delAppt));
				} else {
					System.out.println(String.format("%s has not yet booked an appointment", delAppt));
				}

				// Sprint 2
			} else if (option == 4) {
				System.out.println("SEARCH APPOINTMENT");
				String searchType = Helper.readString("Search appointment by? (Name/Designer Name/Appoint-Date");

				if (searchType.equalsIgnoreCase("Name")) {
					String nameSearch = Helper.readString("Enter name: ");

					for (int i = 0; i < appointmentList.size(); i++) {

						if (nameSearch.equalsIgnoreCase(appointmentList.get(i).getCustomerName())) {
							appointmentList.get(i).showApptDetails();
						}
					}
				} else if (searchType.equalsIgnoreCase("Designer Name")) {
					String designerSearch = Helper.readString("Enter Designer name :");

					for (int i = 0; i < appointmentList.size(); i++) {

						if (designerSearch.equalsIgnoreCase(appointmentList.get(i).getDesignerName())) {
							appointmentList.get(i).showApptDetails();
						}
					}

				} else if (searchType.equalsIgnoreCase("Appoint-Date")) {
					DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
					String inputDate = Helper.readString("Enter date in (MM-dd-yyyy) format : ");
					LocalDate date = LocalDate.parse(inputDate, formatter1);

					for (int i = 0; i < appointmentList.size(); i++) {

						if (date.equals(appointmentList.get(i).getAppointmentDate())) {
							appointmentList.get(i).showApptDetails();
						}
					}

				}

				// Sprint 2
			} else if (option == 5) {
				System.out.println("UPDATE APPOINTMENT WITH APPOINT-DATE AND TIME");

				String retrieveAppt = Helper.readString("Enter Name: ");

				for (int i = 0; i < appointmentList.size(); i++) {

					if (retrieveAppt.equalsIgnoreCase(appointmentList.get(i).getCustomerName())) {
						System.out.println("Your Appointment Date is: " + appointmentList.get(i).getAppointmentDate());

						DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

						// Get today's date
						LocalDate today = LocalDate.now();
						String dateNow = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

						// long daysBetween = ChronoUnit.DAYS.between(dateUpdate, today);

						if (today.isBefore(appointmentList.get(i).getAppointmentDate())) {
							// Get date to update
							String inputDate = Helper.readString("Enter date to update (MM-dd-yyyy) format : ");
							LocalDate dateUpdate = LocalDate.parse(inputDate, formatter1);

							// Get time to update
							DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
							String inputTime = Helper.readString("Enter time of new Appointment (HH:mm) format : ");
							LocalTime time = LocalTime.parse(inputTime, formatter2);

							appointmentList.get(i).setAppointmentDate(dateUpdate);
							appointmentList.get(i).setAppointmentTime(time);

							System.out.println("Appointment successfully updated.");

						} else {

							System.out.println("Please enter a date before the Appointment!");
							break;
						}
					}
				}
			} else {
				System.out.println("'Invalid option");
				option = Helper.readInt("Enter an option > ");
			}
			System.out.println(
					"APPOINTMENT LIST \n1. Add appointment \n2.View appointment \n3. Delete appointment\n4. Back to menu");
			option = Helper.readInt("Enter an option > ");

		}
	}

//	// Fatheen
//	public String code;
//	public String description;
//	public LocalDate startDate;
//	public LocalDate endDate;
//	public double amount;

	public static void ManagePackage(ArrayList<Package> packageList) {
		Helper.line(90, "-");
		System.out.println("PACKAGE \n1. Add Package \n2.View Package \n3. Delete package\n4. Back to menu");
		Helper.line(90, "-");
		int option = Helper.readInt("Enter an option > ");

		while (option != 4) {
			if (option == 1) {
				Helper.line(80, "-");
				System.out.println("Add Package");
				Helper.line(80, "-");
				String code = Helper.readString("Enter package code > ");
				String desc = Helper.readString("Enter packagedescription > ");
				String start = Helper.readString("Enter start date in (DD/MM/YYYY) > ");
				String end = Helper.readString("Enter end date in (DD/MM/YYYY) > ");
				String amount = Helper.readString("Enter price > ");

				packageList.add(new Package(code, desc, start, end, amount));
				System.out.println("Package added successfully");
			} else if (option == 2) {
				System.out.println("VIEW ALL USERS");
				Helper.line(80, "-");
				String output = String.format("%-5S %-15S %-10S %-10S %-10S \n", "CODE", "DESC", "START", "END",
						"AMOUNT");
				for (int i = 0; i < packageList.size(); i++) {
					output += String.format("%-5S %-15S %-10S %-10S %-10S", packageList.get(i).getCode(),
							packageList.get(i).getDescription(), packageList.get(i).getStartDate(),
							packageList.get(i).getEndDate(), packageList.get(i).getAmount());
				}
				System.out.println(output);
			} else if (option == 3) {
				System.out.println("DELETE PACKAGE BY CODE");
				Helper.line(80, "-");
				String delPack = Helper.readString("Enter package code to delete > ");
				boolean isDeleted = false;
				for (int i = 0; i < packageList.size(); i++) {
					if (isDeleted == false && delPack.equalsIgnoreCase(packageList.get(i).getCode())) {
						packageList.remove(i);
						isDeleted = true;
					}
				}
				if (isDeleted == true) {
					System.out.println(
							String.format("Package and details of %s has been successfully deleted!", delPack));
				} else {
					System.out.println(String.format("%s is not registered to the system", delPack));
				}
			} else {
				System.out.println("Invalid option");
				break;
			}
			System.out.println("PACKAGE \n1. Add Package \n2.View Package \n3. Delete package\n4. Back to menu");
			option = Helper.readInt("Enter an option > ");
		}
	}

// Jerald
	public static void UserAccount(ArrayList<UserAccount> accountList) {
		System.out.println(
				"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Search customers list by status\n5. Update user account\n6. Back to menu");

		int option = Helper.readInt("Enter an option > ");
		while (option != 6) {
			if (option == 1) {
				UserAccount ua = inputUser();
				AddUserAccount(accountList, ua);
			} else if (option == 2) {
				ViewAllUsers(accountList);
			} else if (option == 3) {
				DeleteUser(accountList);
			} else if (option == 4) {
				SearchByStatus(accountList);
			} else if (option == 5) {
				UpdateUser(accountList);
			} else {

				System.out.println("'Invalid option");
				option = Helper.readInt("Enter an option > ");
			}
			System.out.println(
					"USER ACCOUNT\n1. Add user account\n2. View all users\n3. Delete user by name\n4. Search customers list by status\n5. Update user account\n6. Back to menu");
			option = Helper.readInt("Enter an option > ");

		}
	}

	public static UserAccount inputUser() {
		String name = Helper.readString("Enter your name > ");
		String role = Helper.readString("Enter your role > ");
		String email = Helper.readString("Enter your email > ");
		String password = Helper.readString("Enter a password > ");

		UserAccount ua = new UserAccount(name, role, email, password);
		return ua;
	}

	public static void AddUserAccount(ArrayList<UserAccount> accountList, UserAccount ua) {
		System.out.println("ADD USER ACCOUNT");
		Helper.line(80, "-");

		accountList.add(ua);
		System.out.println("Successfully added!");
	}

	public static String retrieveAllUsers(ArrayList<UserAccount> accountList) {
		String output = "";
		for (int i = 0; i < accountList.size(); i++) {
			output += String.format("%s\n", accountList.get(i).viewUser());

		}
		return output;
	}

	public static void ViewAllUsers(ArrayList<UserAccount> accountList) {
		System.out.println("VIEW ALL USERS");
		Helper.line(80, "-");
		String output = String.format("%-10s%-15s%-15s%s", "Name", "Role", "Email", "Status");
		output += retrieveAllUsers(accountList);
		System.out.println(output);
	}

	public static void DeleteUser(ArrayList<UserAccount> accountList) {
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
			System.out.println(String.format("Account and details of %s has been successfully deleted!", delUser));
		} else {
			System.out.println(String.format("%s is not registered to the system", delUser));
		}
	}

	public static void SearchByStatus(ArrayList<UserAccount> accountList) {
		System.out.println("SEARCH CUSTOMERS LIST BY THEIR STATUS");
		Helper.line(80, "-");
		System.out.println("Status:\n1. New\n2. Confirmed");
		int status = Helper.readInt("Enter status number > ");
		if (status == 1) {
			System.out.println("NEW USERS:");
			for (int i = 0; i < accountList.size(); i++) {
				if (accountList.get(i).getStatus().equals("new")) {
					accountList.get(i).viewUser();
					System.out.println();
				}
			}
		} else if (status == 2) {

			for (int i = 0; i < accountList.size(); i++) {
				if (accountList.get(i).getStatus().equals("confirmed")) {
					accountList.get(i).viewUser();
					System.out.println();
				}
			}
		} else {
			System.out.println("'Invalid option");
			status = Helper.readInt("Enter status number > ");
		}
	}

	public static void UpdateUser(ArrayList<UserAccount> accountList) {
		System.out.println("UPDATE USER BY NAME");
		Helper.line(80, "-");
		String updtUser = Helper.readString("Enter name to update > ");
		boolean isUpdated = false;
		for (int i = 0; i < accountList.size(); i++) {
			if (isUpdated == false && updtUser.equalsIgnoreCase(accountList.get(i).getName())) {
				String updtName = Helper.readString("Enter updated name > ");
				String updtPass = Helper.readString("Enter updated password > ");
				accountList.get(i).setName(updtName);
				accountList.get(i).setPassword(updtPass);
				isUpdated = true;
			}
		}
		if (isUpdated == true) {
			System.out.println(String.format("Account and details of %s has been successfully updated!", updtUser));
		} else {
			System.out.println(String.format("%s is not registered to the system", updtUser));

		}

	}
}
