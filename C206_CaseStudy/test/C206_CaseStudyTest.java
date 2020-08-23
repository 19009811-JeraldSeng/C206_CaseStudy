import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Appointment apt1;
	private Appointment apt2;
	private UserAccount ua1;
	private UserAccount ua2;
	private ArrayList<UserAccount> accountList;

	private ArrayList<Appointment> appointmentList;

	@Before
	public void setUp() throws Exception {

		apt1 = new Appointment("Jason", "18-8-2020", "11.59", "Jerome", "Woodlands");
		ua1 = new UserAccount("Joe", "Customer", "joe@email.com", "Joe123");
		ua2 = new UserAccount("Sal", "Designer", "sal@email.com", "Sal123");
		accountList = new ArrayList<UserAccount>();
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	// Jerald
	@Test
	public void addUserAccountTest() {
		// check that accountList is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid UserAccount arraylist to add to", accountList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
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

	@Test
	public void retrieveAllUsersTest() {
		// Test if accountList is not null but empty -boundary
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

		// test if the expected output string same as the list of camcorders retrieved
		// from the SourceCentre
		allUsers = C206_CaseStudy.retrieveAllUsers(accountList);
		testOutput = String.format("%-10s%-15s%-15s%s\n", "Joe", "Customer", "joe@email.com", "new");
		testOutput += String.format("%-10s%-15s%-15s%s\n", "Sal", "Designer", "sal@email.com", "new");

		assertEquals("Test that ViewAllUsers list has the above test outputs", testOutput, allUsers);
	}

	@After
	public void tearDown() throws Exception {
	}

}
