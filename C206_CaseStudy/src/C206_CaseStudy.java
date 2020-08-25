import java.util.ArrayList;
import java.util.Arrays;
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
		// Neo Wen Zong
		ArrayList<ManageQuotations> manageQuotationsList = new ArrayList<ManageQuotations>();
		ArrayList<RequestForQuote> requestForQuoteList = new ArrayList<RequestForQuote>();

		// if using when customer use a different format
		// DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy
		// HH:mm:ss");
		// String formattedDate = timeNow.format(formatter1);

		// Syakir
		appointmentList.add(new Appointment("Jason", dateNow, timeNow, "Jerome", "Woodlands"));
		// Jerald: Adding a customer to the user account list
		accountList.add(new UserAccount("Joe", "Admin", "joe@email.com", "Joe123"));
		accountList.add(new UserAccount("Sal", "Customer", "sal@email.com", "Sal123"));
		accountList.add(new UserAccount("Karen", "Designer", "karen@email.com", "Karen123"));
		// Fatheen
		packageList.add(new Package("WTCS", "For Rain", "14/03/2020", "10/04/2020", "42.20"));
		// Wen Zong
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String testStringDate = "28-08-2020";
		LocalDate testDate = LocalDate.parse(testStringDate, formatter2);
		requestForQuoteList.addAll(Arrays.asList(
				new RequestForQuote("R1", "HDB", 100, "test", 0, "test@email.com", 10000, testDate, "Whole house", 4, 2,
						"nil", "Not urgent"),
				new RequestForQuote("R2", "HDB", 100, "test", 0, "test@email.com", 1000, testDate, "Room", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R3", "HDB", 100, "test", 0, "test@email.com", 1000, testDate, "Kitchen", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R4", "HDB", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R5", "Private", 100, "test", 0, "test@email.com", 1000, testDate, "Whole house", 4,
						2, "Gangnam style", "Not urgent"),
				new RequestForQuote("R6", "Private", 100, "test", 0, "test@email.com", 1000, testDate, "Room", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R7", "Private", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R8", "Private", 100, "test", 0, "test@email.com", 1000, testDate, "Kitchen", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R9", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Whole house", 4,
						2, "Gangnam style", "Not urgent"),
				new RequestForQuote("R10", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Room", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R11", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Kitchen", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R12", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R13", "Landed", 100, "test", 1, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R14", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R15", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R16", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam-gu style", "Not urgent"),
				new RequestForQuote("R17", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam district style", "Not urgent"),
				new RequestForQuote("R18", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Kangnam style", "Not urgent"),
				new RequestForQuote("R19", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"South of the River style", "Not urgent"),
				new RequestForQuote("R20", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Kangnam style", "Not urgent"),
				new RequestForQuote("R21", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R22", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R23", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R24", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R25", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R26", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R27", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R28", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R29", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent"),
				new RequestForQuote("R30", "Landed", 100, "test", 0, "test@email.com", 1000, testDate, "Toilet", 4, 2,
						"Gangnam style", "Not urgent")));

		manageQuotationsList.addAll(Arrays.asList(
				new ManageQuotations("R1", "Q1", "Whole house", "Tiles", 400, "Ali", testDate),
				new ManageQuotations("R1", "Q2", "Whole house", "Flooring", 40, "Gabriel Peter Liangco Banal",
						testDate),
				new ManageQuotations("R1", "Q3", "Whole house", "Windows", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R1", "Q4", "Whole house", "Doors", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R1", "Q5", "Whole house", "Ceiling", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R1", "Q6", "Kitchen", "Tiles", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R2", "Q7", "Kitchen", "Flooring", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R1", "Q8", "Kitchen", "Windows", 100, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R2", "Q9", "Kitchen", "Ceiling", 400, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R2", "Q10", "Kitchen", "Doors", 100, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R2", "Q11", "Living room", "Tiles", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R2", "Q13", "Living room", "Windows", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R2", "Q12", "Living room", "Flooring", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R2", "Q14", "Living room", "Doors", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R3", "Q15", "Living room", "Ceiling", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R3", "Q16", "Bedroom", "Tiles", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R3", "Q17", "Bedroom", "Ceiling", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R3", "Q18", "Bedroom", "Windows", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R3", "Q19", "Bedroom", "Flooring", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R3", "Q20", "Bedroom", "Doors", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R3", "Q21", "Storeroom", "Tiles", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q22", "Storeroom", "Ceiling", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q23", "Storeroom", "Flooring", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q24", "Storeroom", "Windows", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q25", "Storeroom", "Doors", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q26", "Toilet", "Tiles", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R4", "Q27", "Toilet", "Flooring", 40, "Aprille Anne Angeles Cambronero",
						testDate),
				new ManageQuotations("R4", "Q28", "Toilet", "Windows", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R5", "Q29", "Toilet", "Ceiling", 40, "Aprille Anne Angeles Cambronero", testDate),
				new ManageQuotations("R5", "Q30", "Toilet", "Doors", 40, "Aprille Anne Angeles Cambronero", testDate)));

		// Jerald
		Helper.line(80, "-");
		System.out.println("RENOVATION ACE");
		Helper.line(80, "-");
		int maxAttempts = 0;

		int login = Helper.readInt("Log in as:\n1. Customer\n2. Admin/Designer\n>");
		if (login == 1) {
			while (maxAttempts < 3) {
				String emailLogin = Helper.readString("Email > ");
				String pwLogin = Helper.readString("Password > ");
				for (int i = 0; i < accountList.size(); i++) {
					if (emailLogin.equals(accountList.get(i).getEmail())
							&& pwLogin.equals(accountList.get(i).getPassword())
							&& accountList.get(i).getRole().equals("Customer")) {
						customerMenu();
						int option = Helper.readInt("Enter an option > ");
						while (option != 4) {

							if (option == 1) {
								UserAccount ua = inputUser();
								RegisterAccount(accountList, ua);
							} else if (option == 2) {
								addARequestForQuote(requestForQuoteList);
							} else if (option == 3) {

							} else {
								System.out.println("Invalid option");
							}
							customerMenu();
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
		} else if (login == 2) {

			while (maxAttempts < 3) {
				String emailLogin = Helper.readString("Email > ");
				String pwLogin = Helper.readString("Password > ");
				for (int i = 0; i < accountList.size(); i++) {
					if (emailLogin.equals(accountList.get(i).getEmail())
							&& pwLogin.equals(accountList.get(i).getPassword())
							&& accountList.get(i).getRole().equals("Admin")
							|| accountList.get(i).getRole().equals("Designer")) {
						adminMenu();
						int option = Helper.readInt("Enter an option > ");

						// Syakir
						while (option != 6) {

							if (option == 1) {
								// Jerald
								UserAccount(accountList);
							} else if (option == 2) {
								// Wen Zong
								manageQuotation(manageQuotationsList, requestForQuoteList);
							} else if (option == 3) {
								// Syakir
								Appointment(appointmentList);

							} else if (option == 4) {
								// Fatheen
								ManagePackage(packageList);

							} else if (option == 5) {
								viewAllRequest(requestForQuoteList);
							} else {
								System.out.println("Invalid option");
							}
							adminMenu();
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

		} else {
			System.out.println("Invalid option");
			login = Helper.readInt("Log in as:\\n1. Customer\\n2. Admin/Designer");
		}

	}

	// Syakir
	public static void adminMenu() {
		C206_CaseStudy.setHeader("RENOVATION ACE");
		System.out.println("1. User Account");
		System.out.println("2. Quotations");
		System.out.println("3. Appointment");
		System.out.println("4. Package");
		System.out.println("5. Request for Quotation");
		System.out.println("6. Exit");
		Helper.line(80, "-");

	}

	// Jerald
	public static void customerMenu() {
		C206_CaseStudy.setHeader("RENOVATION ACE");
		System.out.println("1. Registration");
		System.out.println("2. Request for quotation");
		System.out.println("3. Manage appointment");
		System.out.println("4. Exit");
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

	public static String viewAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";
		for (int i = 0; i < appointmentList.size(); i++) {
			output += appointmentList.get(i).showApptDetails();

		}
		return output;
	}

	public static void deleteAppointment(ArrayList<Appointment> appointmentList) {
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
			System.out.println(String.format("Appointment details of %s has been successfully deleted.", delAppt));
		} else {
			System.out.println(String.format("%s has not yet booked an appointment", delAppt));
		}

	}

	public static void searchAppointment(ArrayList<Appointment> appointmentList) {
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

	}

	public static void updateAppointment(ArrayList<Appointment> appointmentList) {

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
				String delUser = inputName();
				DeleteUser(accountList, delUser);
			} else if (option == 4) {
				int status = inputNumber();
				SearchByStatus(accountList, status);
			} else if (option == 5) {
				String updtUser = inputUpdateUser();
				String updtName = inputUpdateName();
				String updtPass = inputUpdatePass();
				UpdateUser(accountList, updtUser, updtName, updtPass);
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

	public static void RegisterAccount(ArrayList<UserAccount> accountList, UserAccount ua) {
		System.out.println("REGISTER USER ACCOUNT");
		Helper.line(80, "-");

		accountList.add(ua);
		System.out.println("Successfully registered!");
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
		String output = String.format("%-10s%-15s%-15s%s\n", "Name", "Role", "Email", "Status");
		output += retrieveAllUsers(accountList);
		System.out.println(output);
	}

	public static String inputName() {
		String delUser = Helper.readString("Enter name to delete > ");
		return delUser;
	}

	public static void DeleteUser(ArrayList<UserAccount> accountList, String delUser) {
		System.out.println("DELETE USER BY NAME");
		Helper.line(80, "-");

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

	public static int inputNumber() {
		System.out.println("Status:\n1. New\n2. Confirmed");
		int status = Helper.readInt("Enter status number > ");
		return status;
	}

	public static String retrieveNewUsers(ArrayList<UserAccount> accountList) {
		String output = "";
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getStatus().equals("new")) {
				output += String.format("%s\n", accountList.get(i).viewUser());
			}

		}
		return output;
	}

	public static String retrieveConfirmedUsers(ArrayList<UserAccount> accountList) {
		String output = "";
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getStatus().equals("confirmed")) {
				output += String.format("%s\n", accountList.get(i).viewUser());
			}

		}
		return output;
	}

	public static void SearchByStatus(ArrayList<UserAccount> accountList, int status) {
		System.out.println("SEARCH CUSTOMERS LIST BY THEIR STATUS");
		Helper.line(80, "-");

		if (status == 1) {
			System.out.println("NEW USERS:");
			String output = String.format("%-10s%-15s%-15s%s", "Name", "Role", "Email", "Status");
			output += retrieveNewUsers(accountList);
			System.out.println(output);

		} else if (status == 2) {
			System.out.println("CONFIRMED USERS:");
			String output = String.format("%-10s%-15s%-15s%s", "Name", "Role", "Email", "Status");
			output += retrieveConfirmedUsers(accountList);
			System.out.println(output);

		} else {
			System.out.println("'Invalid option");
			inputNumber();

		}
	}

	public static String inputUpdateUser() {
		String updtUser = Helper.readString("Enter name to update > ");
		return updtUser;
	}

	public static String inputUpdateName() {
		String updtName = Helper.readString("Enter updated name > ");
		return updtName;
	}

	public static String inputUpdatePass() {
		String updtPass = Helper.readString("Enter updated password > ");
		return updtPass;
	}

	public static void UpdateUser(ArrayList<UserAccount> accountList, String updtUser, String updtName,
			String updtPass) {
		System.out.println("UPDATE USER BY NAME");
		Helper.line(80, "-");

		boolean isUpdated = false;
		for (int i = 0; i < accountList.size(); i++) {
			if (isUpdated == false && updtUser.equalsIgnoreCase(accountList.get(i).getName())) {

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

	public static void viewAllRequest(ArrayList<RequestForQuote> requestForQuoteList) {
		String out = String.format("%s  %s  %s  %s  %s  %-40s  %s    %s  %s  %s  %s  %-8s  %s\n", "REQUEST ID",
				"PROPERTY TYPE", "AREA SIZE", "REQUEST NAME", "CONTACT", "EMAIL", "BUDGET", "TARGET COMPLETION DATE",
				"RENOVATION TYPE", "NUMBER OF ROOMS TO RENOVATE", "NUMBER OF TOILETS TO RENOVATE", "RENOVATION STYLE",
				"URGENT");

		for (RequestForQuote request : requestForQuoteList) {
			out += String.format("%-11s %-14s %-10s %-13s %-8s %-41s $%-8s %-23s %-16s %-28s %-30s %-25s %s\n",
					request.getRequestID(), request.getPropertyType(), request.getAreaSize(), request.getRequestName(),
					request.getContact(), request.getEmail(), request.getBudget(), request.getTargetCompletionDate(),
					request.getRenovationType(), request.getNumRooms(), request.getNumToilets(),
					request.getRenovationStyle(), request.getUrgency());
		}
		System.out.println(out);
	}

	public static void addARequestForQuote(ArrayList<RequestForQuote> requestForQuotesList) {
		String propertyType = Helper.readString("Enter a property type (HDB, Private or Landed): ");

		if (propertyType.equalsIgnoreCase("hdb") || propertyType.equalsIgnoreCase("private")
				|| propertyType.equalsIgnoreCase("landed")) {
			double areaSize = Helper.readDouble("Area size (metre square):");

			if (areaSize < 1) {
				System.out.println("Invalid size.");
			} else {
				String requestName = Helper.readString("Enter request name: ");
				int contact = Helper.readInt("Enter contact: ");

				if (contact < 0) {
					System.out.println("Invalid contact.");
				} else {
					String email = Helper.readString("Enter email: ");
					double budget = Helper.readDouble("Enter your budget: ");
					String targetCompletionDateString = Helper
							.readString("Enter target completion date (dd-MM-yyyy): ");
					DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					LocalDate targetCompletionDate = LocalDate.parse(targetCompletionDateString, formatter1);
					String renovationType = Helper
							.readString("Enter a renovation type (Whole house, room, kitchen or toilet): ");

					if (renovationType.equalsIgnoreCase("whole house") || renovationType.equalsIgnoreCase("room")
							|| renovationType.equalsIgnoreCase("kitchen")
							|| renovationType.equalsIgnoreCase("toilet")) {
						int numRooms = Helper.readInt("Enter number of rooms to renovate: ");

						if (numRooms < 0) {
							System.out.println("Invalid number.");
						} else {
							int numToilets = Helper.readInt("Enter number of toilets to renovate: ");

							if (numToilets < 0) {
								System.out.println("Invalid number.");
							} else {
								String renovationStyle = Helper
										.readString("Enter a renovation style (type nil if you don't want): ");
								LocalDate now = LocalDate.now();
								String isUrgent = "Not urgent";
								LocalDate afterThreeMonths = now.plusMonths(3);
								if (targetCompletionDate.isBefore(afterThreeMonths)) {
									isUrgent = "Urgent";
								}

								requestForQuotesList.add(new RequestForQuote(
										("r" + (requestForQuotesList.size() + 1)).toUpperCase(), propertyType, areaSize,
										requestName, contact, email, budget, targetCompletionDate, renovationType,
										numRooms, numToilets, renovationStyle, isUrgent));
								System.out.println("Successfully added.\n");
							}
						}

					} else {
						System.out.println("Invalid type.");
					}
				}
			}
		} else {
			System.out.println("Invalid type.");
		}
	}

	private static void manageQuotation(ArrayList<ManageQuotations> manageQuotationsList,
			ArrayList<RequestForQuote> requestForQuoteList) {
		int opt = Helper.readInt(
				"1: Update a quotation\n2: Add a quotation\n3: View all quotations\n4: Delete a quotation\n5: Search a quotation by designer name\n6: Search a quotation by renovation category\n0: Exit\nEnter an option: ");

		while (opt != 0) {
			if (opt == 1) {
				updateQuotation(manageQuotationsList, requestForQuoteList);
			} else if (opt == 2) {
				addAQuotation(manageQuotationsList, requestForQuoteList);
			} else if (opt == 3) {
				viewAllQuotations(manageQuotationsList);
			} else if (opt == 4) {
				deleteAQuotation(manageQuotationsList);
			} else if (opt == 5) {
				searchQuotationByName(manageQuotationsList);
			} else if (opt == 6) {
				searchQuotationByRenovationCategory(manageQuotationsList);
			} else {
				System.out.println("Invalid option.");
			}

			opt = Helper.readInt(
					"1: Update a quotation\n2: Add a quotation\n3: View all quotations\n4: Delete a quotation\n5: Search a quotation by designer name\n6: Search a quotation by renovation category\n0: Exit\nEnter an option: ");
		}
	}

	private static void updateQuotation(ArrayList<ManageQuotations> manageQuotationList,
			ArrayList<RequestForQuote> requestForQuoteList) {
		if (manageQuotationList != null && requestForQuoteList != null) {
			String requestID = Helper.readString("Enter a request ID: ");
			String output = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID", "QUOTATION ID",
					"RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME", "EARLIEST START DATE",
					"TOTAL QUOTATION AMOUNT");
			boolean found = false;
			String[] quotationIDArray = new String[7];
			int arrayIndex = 0;

			for (RequestForQuote request : requestForQuoteList) {
				if (request.getRequestID().equalsIgnoreCase(requestID)) {
					request.displayAll();
					System.out.println();
					found = true;

					for (int i = 0; i < manageQuotationList.size(); i++) {
						if (request.getRequestID().equalsIgnoreCase(manageQuotationList.get(i).getRequestID())) {
							output += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n",
									manageQuotationList.get(i).getRequestID(),
									manageQuotationList.get(i).getQuotationID(),
									manageQuotationList.get(i).getRenoCat(), manageQuotationList.get(i).getRenoItem(),
									manageQuotationList.get(i).getDesignerName(),
									manageQuotationList.get(i).getStartDate(), manageQuotationList.get(i).getPrice());

							if (manageQuotationList.get(i) != null) {
								quotationIDArray[arrayIndex] = manageQuotationList.get(i).getQuotationID();
								arrayIndex++;
							}
						}
					}

					System.out.println(output);

					String quotationID = Helper.readString("Enter a quotation ID: ");

					boolean found2 = false;
					for (int j = 0; j < quotationIDArray.length; j++) {
						if (quotationIDArray[j].equalsIgnoreCase(quotationID)) {
							found2 = true;
							ManageQuotations foundMQ = null;

							for (int i = 0; i < manageQuotationList.size(); i++) {
								if (manageQuotationList.get(i).getQuotationID().equalsIgnoreCase(quotationID)) {
									foundMQ = manageQuotationList.get(i);
									break;
								}
							}

							int renoCatID = Helper.readInt(
									"1: Whole house\n2: Living room\n3: Bedroom\n4: Kitchen\n5: Storeroom\n6: Toilet\nEnter a number: ");
							double totalQuotationAmount = 0;
							String renoCat = "";
							int renoItemID = 0;

							if (foundMQ.getRenoItem().equalsIgnoreCase("tiles")) {
								renoItemID = 1;
							} else if (foundMQ.getRenoItem().equalsIgnoreCase("flooring")) {
								renoItemID = 2;
							} else if (foundMQ.getRenoItem().equalsIgnoreCase("ceiling")) {
								renoItemID = 3;
							} else if (foundMQ.getRenoItem().equalsIgnoreCase("windows")) {
								renoItemID = 4;
							} else if (foundMQ.getRenoItem().equalsIgnoreCase("doors")) {
								renoItemID = 5;
							}

							switch (renoItemID) {
							case 1:// "Tiles";
								totalQuotationAmount = 45;
								switch (renoCatID) {
								case 1:
									renoCat = "Whole house";
									totalQuotationAmount *= 1.5;
									break;
								case 2:
									renoCat = "Living room";
									break;
								case 3:
									renoCat = "Bedroom";
									totalQuotationAmount *= 1.2;
									break;
								case 4:
									renoCat = "Kitchen";
									totalQuotationAmount *= 1.2;
									break;
								case 5:
									renoCat = "Storeroom";
									totalQuotationAmount *= 0.9;
									break;
								case 6:
									renoCat = "Toilet";
									totalQuotationAmount *= 0.9;
									break;
								default:
									break;
								}
								break;
							case 3:// "Ceiling";
								totalQuotationAmount = 45;
								switch (renoCatID) {
								case 1:
									renoCat = "Whole house";
									totalQuotationAmount *= 1.5;
									break;
								case 2:
									renoCat = "Living room";
									break;
								case 3:
									renoCat = "Bedroom";
									totalQuotationAmount *= 1.2;
									break;
								case 4:
									renoCat = "Kitchen";
									totalQuotationAmount *= 1.2;
									break;
								case 5:
									renoCat = "Storeroom";
									totalQuotationAmount *= 1.2;
									break;
								case 6:
									renoCat = "Toilet";
									totalQuotationAmount *= 0.9;
									break;
								default:
									break;
								}
								break;
							case 2:// "Flooring";
								totalQuotationAmount = 50;
								switch (renoCatID) {
								case 1:
									renoCat = "Whole house";
									totalQuotationAmount *= 1.5;
									break;
								case 2:
									renoCat = "Living room";
									break;
								case 3:
									renoCat = "Bedroom";
									totalQuotationAmount *= 1.2;
									break;
								case 4:
									renoCat = "Kitchen";
									totalQuotationAmount *= 1.2;
									break;
								case 5:
									renoCat = "Storeroom";
									totalQuotationAmount *= 0.9;
									break;
								case 6:
									renoCat = "Toilet";
									totalQuotationAmount *= 0.9;
									break;
								default:
									break;
								}
								break;
							case 4:// "Windows";
								totalQuotationAmount = 30;
								switch (renoCatID) {
								case 1:
									renoCat = "Whole house";
									totalQuotationAmount *= 1.5;
									break;
								case 2:
									renoCat = "Living room";
									break;
								case 3:
									renoCat = "Bedroom";
									totalQuotationAmount *= 1.2;
									break;
								case 4:
									renoCat = "Kitchen";
									totalQuotationAmount *= 1.2;
									break;
								case 5:
									renoCat = "Storeroom";
									totalQuotationAmount *= 0.9;
									break;
								case 6:
									renoCat = "Toilet";
									totalQuotationAmount *= 0.9;
									break;
								default:
									break;
								}
								break;
							case 5:// "Doors";
								totalQuotationAmount = 20;
								switch (renoCatID) {
								case 1:
									renoCat = "Whole house";
									totalQuotationAmount *= 1.5;
									break;
								case 2:
									renoCat = "Living room";
									break;
								case 3:
									renoCat = "Bedroom";
									totalQuotationAmount *= 1.2;
									break;
								case 4:
									renoCat = "Kitchen";
									totalQuotationAmount *= 1.2;
									break;
								case 5:
									renoCat = "Storeroom";
									totalQuotationAmount *= 0.9;
									break;
								case 6:
									renoCat = "Toilet";
									totalQuotationAmount *= 0.9;
									break;
								default:
									break;
								}
								break;
							default:
								totalQuotationAmount = totalQuotationAmount;
								break;
							}

							foundMQ.setRenoCat(renoCat);
							foundMQ.setPrice(totalQuotationAmount);
							String result = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID",
									"QUOTATION ID", "RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME",
									"EARLIEST START DATE", "TOTAL QUOTATION AMOUNT");
							result += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n",
									foundMQ.getRequestID(), foundMQ.getQuotationID(), foundMQ.getRenoCat(),
									foundMQ.getRenoItem(), foundMQ.getDesignerName(), foundMQ.getStartDate(),
									foundMQ.getPrice());

							System.out.println("Updated successfully.\n\n" + result);
						}
					}

					if (found2 == false) {
						System.out.println("No such quotation ID for this request");
					}
					break;
				}
			}

			if (found == false) {
				System.out.println("No such request ID.");
			}
		} else {
			System.out.println("There are either no request IDs or quotation IDs.");
		}
	}

	private static void addAQuotation(ArrayList<ManageQuotations> manageQuotationList,
			ArrayList<RequestForQuote> requestForQuoteList) {
		if (requestForQuoteList != null) {
			String requestID = Helper.readString("Enter a request ID: ");
			String output = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID", "QUOTATION ID",
					"RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME", "EARLIEST START DATE",
					"TOTAL QUOTATION AMOUNT");
			int numOfQuotes = 0;

			for (RequestForQuote request : requestForQuoteList) {
				if (requestID.equalsIgnoreCase(request.getRequestID())) {
					request.displayAll();
					System.out.println();

					for (ManageQuotations quotations : manageQuotationList) {
						if (quotations.getRequestID().equalsIgnoreCase(requestID)) {
							output += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n",
									quotations.getRequestID(), quotations.getQuotationID(), quotations.getRenoCat(),
									quotations.getRenoItem(), quotations.getDesignerName(), quotations.getStartDate(),
									quotations.getPrice());

							numOfQuotes++;
						}
					}

					System.out.println(output);

					if (numOfQuotes < 7) {
						int renoCatID = Helper.readInt(
								"1: Whole house\n2: Living room\n3: Bedroom\n4: Kitchen\n5: Storeroom\n6: Toilet\nEnter a number: ");
						String renoCat = "";
						int renoItemID = Helper.readInt(
								"1: Tiles ($45 x 1.5 for whole house, x 1.2 for bedroom and kitchen, x 0.9 for storeroom and toilet)\n2: Flooring ($50 x 1.5 for whole house, x 1.2 for bedroom and kitchen, x 0.9 for storeroom and toilet)\n3: Ceiling($45 x 1.5 for whole house, x 1.2 for bedroom and kitchen, x 0.9 for storeroom and toilet)\n4: Windows($30 x 1.5 for whole house, x 1.2 for bedroom and kitchen, x 0.9 for storeroom and toilet)\n5: Doors ($20 x 1.5 for whole house, x 1.2 for bedroom and kitchen, x 0.9 for storeroom and toilet)\nEnter a number: ");
						String renoItem = "";
						String designerName = Helper.readString("Designer name: ");
						String earliestStartDateString = Helper.readString("Earliest start date (yyyy-MM-dd): ");
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						LocalDate earliestStartDate = LocalDate.parse(earliestStartDateString, dtf);
						double totalQuotationAmount = 0;

						switch (renoItemID) {
						case 1:
							renoItem = "Tiles";
							totalQuotationAmount = 45;
							switch (renoCatID) {
							case 1:
								renoCat = "Whole house";
								totalQuotationAmount *= 1.5;
								break;
							case 2:
								renoCat = "Living room";
								break;
							case 3:
								renoCat = "Bedroom";
								totalQuotationAmount *= 1.2;
								break;
							case 4:
								renoCat = "Kitchen";
								totalQuotationAmount *= 1.2;
								break;
							case 5:
								renoCat = "Storeroom";
								totalQuotationAmount *= 0.9;
								break;
							case 6:
								renoCat = "Toilet";
								totalQuotationAmount *= 0.9;
								break;
							default:
								break;
							}
							break;
						case 3:
							renoItem = "Ceiling";
							totalQuotationAmount = 45;
							switch (renoCatID) {
							case 1:
								renoCat = "Whole house";
								totalQuotationAmount *= 1.5;
								break;
							case 2:
								renoCat = "Living room";
								break;
							case 3:
								renoCat = "Bedroom";
								totalQuotationAmount *= 1.2;
								break;
							case 4:
								renoCat = "Kitchen";
								totalQuotationAmount *= 1.2;
								break;
							case 5:
								renoCat = "Storeroom";
								totalQuotationAmount *= 1.2;
								break;
							case 6:
								renoCat = "Toilet";
								totalQuotationAmount *= 0.9;
								break;
							default:
								break;
							}
							break;
						case 2:
							renoItem = "Flooring";
							totalQuotationAmount = 50;
							switch (renoCatID) {
							case 1:
								renoCat = "Whole house";
								totalQuotationAmount *= 1.5;
								break;
							case 2:
								renoCat = "Living room";
								break;
							case 3:
								renoCat = "Bedroom";
								totalQuotationAmount *= 1.2;
								break;
							case 4:
								renoCat = "Kitchen";
								totalQuotationAmount *= 1.2;
								break;
							case 5:
								renoCat = "Storeroom";
								totalQuotationAmount *= 0.9;
								break;
							case 6:
								renoCat = "Toilet";
								totalQuotationAmount *= 0.9;
								break;
							default:
								break;
							}
							break;
						case 4:
							renoItem = "Windows";
							totalQuotationAmount = 30;
							switch (renoCatID) {
							case 1:
								renoCat = "Whole house";
								totalQuotationAmount *= 1.5;
								break;
							case 2:
								renoCat = "Living room";
								break;
							case 3:
								renoCat = "Bedroom";
								totalQuotationAmount *= 1.2;
								break;
							case 4:
								renoCat = "Kitchen";
								totalQuotationAmount *= 1.2;
								break;
							case 5:
								renoCat = "Storeroom";
								totalQuotationAmount *= 0.9;
								break;
							case 6:
								renoCat = "Toilet";
								totalQuotationAmount *= 0.9;
								break;
							default:
								break;
							}
							break;
						case 5:
							renoItem = "Doors";
							totalQuotationAmount = 20;
							switch (renoCatID) {
							case 1:
								renoCat = "Whole house";
								totalQuotationAmount *= 1.5;
								break;
							case 2:
								renoCat = "Living room";
								break;
							case 3:
								renoCat = "Bedroom";
								totalQuotationAmount *= 1.2;
								break;
							case 4:
								renoCat = "Kitchen";
								totalQuotationAmount *= 1.2;
								break;
							case 5:
								renoCat = "Storeroom";
								totalQuotationAmount *= 0.9;
								break;
							case 6:
								renoCat = "Toilet";
								totalQuotationAmount *= 0.9;
								break;
							default:
								break;
							}
							break;
						default:
							totalQuotationAmount = totalQuotationAmount;
							break;
						}
						manageQuotationList.add(
								new ManageQuotations(requestID.toUpperCase(), "Q" + (manageQuotationList.size() + 1),
										renoCat, renoItem, totalQuotationAmount, designerName, earliestStartDate));
						System.out.println("Quotation added successfully.\n");

					} else {
						System.out.println(
								"The request can't have anymore quotations, the maximum number of quotations is 7.");
					}

					break;
				} else {
					System.out.println("No such request ID.");
				}
			}

		} else {
			System.out.println("There are no requests for quotation");
		}
	}

	public static void viewAllQuotations(ArrayList<ManageQuotations> manageQuotationList) {
		String output = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID", "QUOTATION ID",
				"RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME", "EARLIEST START DATE",
				"TOTAL QUOTATION AMOUNT");

		for (ManageQuotations quotations : manageQuotationList) {
			output += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n", quotations.getRequestID(),
					quotations.getQuotationID(), quotations.getRenoCat(), quotations.getRenoItem(),
					quotations.getDesignerName(), quotations.getStartDate(), quotations.getPrice());
		}

		System.out.println(output);
	}

	public static void deleteAQuotation(ArrayList<ManageQuotations> manageQuotationList) {
		String quotationID = Helper.readString("Enter a quotation ID: ");
		boolean found = false;

		for (int i = 0; i < manageQuotationList.size(); i++) {
			if (manageQuotationList.get(i).getQuotationID().equalsIgnoreCase(quotationID)) {
				found = true;

				manageQuotationList.remove(i);
				System.out.println("Quotation deleted.\n");
				break;
			}
		}

		if (found == false) {
			System.out.println("No such quotation ID.");
		}

	}

	public static void searchQuotationByName(ArrayList<ManageQuotations> manageQuotationList) {
		String name = Helper.readString("Enter a designer name: ");
		boolean found = false;
		String output = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID", "QUOTATION ID",
				"RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME", "EARLIEST START DATE",
				"TOTAL QUOTATION AMOUNT");

		for (int i = 0; i < manageQuotationList.size(); i++) {
			if (manageQuotationList.get(i).getDesignerName().equalsIgnoreCase(name)) {
				found = true;
				output += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n",
						manageQuotationList.get(i).getRequestID(), manageQuotationList.get(i).getQuotationID(),
						manageQuotationList.get(i).getRenoCat(), manageQuotationList.get(i).getRenoItem(),
						manageQuotationList.get(i).getDesignerName(), manageQuotationList.get(i).getStartDate(),
						manageQuotationList.get(i).getPrice());

			}
		}

		System.out.println(output);
		if (found == false) {
			System.out.println("No such designer.");
		}
	}

	public static void searchQuotationByRenovationCategory(ArrayList<ManageQuotations> manageQuotationList) {
		String renoCat = Helper.readString("Enter a renovation category: ");
		boolean found = false;
		String output = String.format("%s | %s | %s | %s | %-40s | %s | %s\n", "REQUEST ID", "QUOTATION ID",
				"RENOVATION CATEGORY", "RENOVATION ITEM", "DESIGNER NAME", "EARLIEST START DATE",
				"TOTAL QUOTATION AMOUNT");

		for (int i = 0; i < manageQuotationList.size(); i++) {
			if (manageQuotationList.get(i).getRenoCat().equalsIgnoreCase(renoCat)) {
				found = true;
				output += String.format("%-12s %-14s %-21s %-17s %-42s %-21s $%.2f\n",
						manageQuotationList.get(i).getRequestID(), manageQuotationList.get(i).getQuotationID(),
						manageQuotationList.get(i).getRenoCat(), manageQuotationList.get(i).getRenoItem(),
						manageQuotationList.get(i).getDesignerName(), manageQuotationList.get(i).getStartDate(),
						manageQuotationList.get(i).getPrice());

			}
		}

		System.out.println(output);
		if (found == false) {
			System.out.println("No such category in the list.");
		}
	}

}
