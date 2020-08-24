import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	// Syakir
	private Appointment apt1;
	private Appointment apt2;
	private ArrayList<Appointment> appointmentList;

	// Jerald
	private UserAccount ua1;
	private UserAccount ua2;
	private ArrayList<UserAccount> accountList;

	@Before
	public void setUp() throws Exception {

		apt1 = new Appointment("Jason", "18-8-2020", "11.59", "Jerome", "Woodlands");
		apt2 = new Appointment("Jack", "20-8-2020", "15:30", "Emily", "Jurong");
		ua1 = new UserAccount("Joe", "Customer", "joe@email.com", "Joe123");
		ua2 = new UserAccount("Sal", "Designer", "sal@email.com", "Sal123");
		accountList = new ArrayList<UserAccount>();
		appointmentList = new ArrayList<Appointment>();
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	// Jerald
	@Test
	public void regUserAccountTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Check if there is valid UserAccount arraylist to add to", accountList);
		// Given a valid list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.RegisterAccount(accountList, ua1);
		assertEquals("Check that UserAccount arraylist size is 1", 1, accountList.size());
		assertSame("Check that UserAccount is registered", ua1, accountList.get(0));

		// Add another UserAccount and test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.RegisterAccount(accountList, ua2);
		assertEquals("Check that UserAccount arraylist size is 2", 2, accountList.size());
		assertSame("Check that UserAccount is registered", ua2, accountList.get(1));
	}

	// Jerald
	@Test
	public void addUserAccountTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Check if there is valid UserAccount arraylist to add to", accountList);
		// Given a valid list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.AddUserAccount(accountList, ua1);
		assertEquals("Check that UserAccount arraylist size is 1", 1, accountList.size());
		assertSame("Check that UserAccount is added", ua1, accountList.get(0));

		// Add another UserAccount and test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.AddUserAccount(accountList, ua2);
		assertEquals("Check that UserAccount arraylist size is 2", 2, accountList.size());
		assertSame("Check that UserAccount is added", ua2, accountList.get(1));
	}

	// Jerald
	@Test
	public void retrieveAllUsersTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Test if there is valid UserAccount arraylist to retrieve item", accountList);

		// test if the list of UserAccount retrieved from the C206_CaseStudy is empty -
		// boundary
		String allUsers = C206_CaseStudy.retrieveAllUsers(accountList);
		String testOutput = "";
		assertEquals("Check that ViewAllUsers is empty", testOutput, allUsers);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.AddUserAccount(accountList, ua1);
		C206_CaseStudy.AddUserAccount(accountList, ua2);
		assertEquals("Test that UserAccount arraylist size is 2", 2, accountList.size());

		// test if the expected output string same as the list of UserAccounts retrieved
		// from the C206_CaseStudy
		allUsers = C206_CaseStudy.retrieveAllUsers(accountList);
		testOutput = String.format("%-10s%-15s%-15s%s\n", "Joe", "Customer", "joe@email.com", "new");
		testOutput += String.format("%-10s%-15s%-15s%s\n", "Sal", "Designer", "sal@email.com", "new");

		assertEquals("Test that ViewAllUsers list has the above test outputs", testOutput, allUsers);
	}

	// Jerald
	@Test
	public void deleteUserTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Test if there is valid UserAccount arraylist to retrieve item", accountList);
		C206_CaseStudy.AddUserAccount(accountList, ua1);
		// Check if the size of accountList decrements by 1 after deleting a user
		C206_CaseStudy.DeleteUser(accountList, "Joe");
		assertEquals("Check if User has been deleted properly", 0, accountList.size());
	}

	// Jerald
	@Test
	public void searchByStatusTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Test if there is valid UserAccount arraylist to retrieve item", accountList);
		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.AddUserAccount(accountList, ua1);
		C206_CaseStudy.AddUserAccount(accountList, ua2);
		assertEquals("Test that UserAccount arraylist size is 2", 2, accountList.size());
		// set ua1 status to confirm
		ua1.setStatus("confirmed");
		// test if the expected output string same as the list of UserAccounts retrieved
		// from the C206_CaseStudy
		String newUsers = String.format("%-10s%-15s%-15s%s\n", "Sal", "Designer", "sal@email.com", "new");
		String confirmedUsers = String.format("%-10s%-15s%-15s%s\n", "Joe", "Customer", "joe@email.com", "confirmed");
		String newOutput = C206_CaseStudy.retrieveNewUsers(accountList);
		String confirmedOutput = C206_CaseStudy.retrieveConfirmedUsers(accountList);

		assertEquals("Test that newUsers list has the newOutput", newOutput, newUsers);
		assertEquals("Test that confirmedUsers list has the confirmedOutput", confirmedOutput, confirmedUsers);

	}
	
	// Jerald
	@Test
	public void updateUserTest() {
		// check that accountList is valid, so that can add a new item - boundary
		assertNotNull("Test if there is valid UserAccount arraylist to retrieve item", accountList);
		// Given a valid list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.AddUserAccount(accountList, ua1);
		// Update user
		C206_CaseStudy.UpdateUser(accountList, "Joe", "Joey", "Joey123");
		// test if the expected output string same as the list of UserAccounts retrieved
		// from the C206_CaseStudy
		String updtOutput = String.format("%-10s%-15s", ua1.getName(), ua1.getPassword());
		String expectedUpdtOutput = String.format("%-10s%-15s", "Joey", "Joey123");

		assertEquals("Test that updtOutput has the expectedUpdtOutput", updtOutput, expectedUpdtOutput);
		
	}
	
	// Syakir
	@Test
	public void addAppointmentTest() {
		// check that appointmentList is null, so can add appointment
		assertNotNull("Check that there is no current appointment to add", appointmentList);

		// After adding appointment, check that it has been added
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		assertEquals("Check that the ArrayList size is 1", 1, appointmentList.size());
		assertSame("Check that the appointment has successfully been added", apt1, appointmentList.get(0));

		// Add another appointment and test the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, apt2);
		assertEquals("Check that Appointment arraylist size is 2", 2, appointmentList.size());
		assertSame("Check that Appointment has successfully been added", apt2, appointmentList.get(1));

	}

	// Syakir
	@Test
	public void viewAppointmentTest() {
		// Test if appointmentList has been added before
		assertNotNull("Test if there is valid Appointment arraylist to retrieve", appointmentList);

		// Test if the list of Appointment retrieved from the C206_CaseStudy is empty
		String allAppt = C206_CaseStudy.viewAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Check that viewing of appintmentment is empty", testOutput, allAppt);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		C206_CaseStudy.addAppointment(appointmentList, apt2);
		assertEquals("Test that the Appointment arraylist size is 2", 2, appointmentList.size());
//
//		// test if the expected output same as the list if appointment retrieved
//		allAppt = C206_CaseStudy.viewAllAppointment(appointmentList);
//		testOutput = String.format("%-10s %-15s %-15s %-15s %15s\n", "Jason", "18-8-2020", "11.59", "Jerome",
//				"Woodlands");
//		testOutput += String.format("%-10s %-15s %-15s %-15s %15s\n", "Jack", "20-8-2020", "15:30", "Emily", "Jurong");
//
//		assertEquals("Test that the Appointment output has the above test outputs", testOutput, allAppt);

	}

	// Syakir
	@Test
	public void deleteAppointmentTest() {
		// Test if appointmentList has been added before
		assertNotNull("Test if there is valid Appointment arraylist to retrieve", appointmentList);

		// Test if list of Appointment retrieved is not empty after adding
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		assertEquals("Test that the Appointment arraylist size is 2", 1, appointmentList.size());

		// Test if appointmentList decreases in number after deletion
		C206_CaseStudy.deleteAppointment(appointmentList);
		assertEquals("Check if User has been deleted properly", 0, appointmentList.size());

	}

	// Syakir
	@Test
	public void searchAppointmentTest() {

		// check that appointmentList is valid, so that can add a new appointment
		assertNotNull("Test if there is valid Appointment arraylist to retrieve item", appointmentList);
		// Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		C206_CaseStudy.addAppointment(appointmentList, apt2);
		assertEquals("Test that Appointment arraylist size is 2", 2, appointmentList.size());

		// test if the expected output string same as the list of Appointment retrieved

		String newAppt = String.format("%-10s %-15s %-15s %-15s %15s\n", "Jason", "18-8-2020", "11.59", "Jerome",
				"Woodlands");
		String newOutput = C206_CaseStudy.viewAllAppointment(appointmentList);

		assertEquals("Test that Appointment list has the newOutput", newOutput, newAppt);

	}

	public void updateAppointmentTest() {
		// check that appointmentList is valid, so that can update
		assertNotNull("Test if there is valid Appointment arraylist to update item", appointmentList);
		// Given a valid list, after adding 1 item, the size of the list is 1
		// The appointment just added is as same as the first item of the list
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		// Update appointment
		C206_CaseStudy.updateAppointment(appointmentList);
		// test if the expected output string same as the list of Appointment retrieved
		String newOutput = String.format("%-10s%-15s", apt1.getCustomerName(), apt1.getDesignerName());
		String expectedOutput = String.format("%-10s%-15s", "Jason", "Jerome");

		assertEquals("Test that updtOutput has the expectedUpdtOutput", newOutput, expectedOutput);

	}

	@After
	public void tearDown() throws Exception {
		apt1 = null;
		apt2 = null;
		ua1 = null;
		ua2 = null;
		accountList = null;
		appointmentList = null;
	}
}