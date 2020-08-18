import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Appointment apt1;
	private Appointment apt2;
	
	private ArrayList<Appointment> appointmentList;
	
	@Before
	public void setUp() throws Exception {
	
	apt1 = new Appointment("Jason", "18-8-2020", "11.59", "Jerome", "Woodlands");
	
	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
