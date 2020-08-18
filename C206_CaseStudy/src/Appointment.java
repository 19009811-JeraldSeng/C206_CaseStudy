
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 * 19030130, 18 Aug 2020 11:44:56 am
 */

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 19030130
 *
 */
//Done by Syakir
public class Appointment extends C206_CaseStudy {

	private String customerName;
	private LocalDate appointmentDate;
	private LocalDateTime appointmentTime;
	private String designerName;
	private String address;

	/**
	 * @param customerName
	 * @param appointmentDate
	 * @param timeNow
	 * @param designerName
	 * @param address
	 */
	public Appointment(String customerName, LocalDate appointmentDate, LocalDateTime timeNow, String designerName,
			String address) {
		this.customerName = customerName;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = timeNow;
		this.designerName = designerName;
		this.address = address;
	}

	/**
	 * @param customerName2
	 * @param string
	 * @param string2
	 * @param designerName2
	 * @param address2
	 */
	public Appointment(String customerName2, String string, String string2, String designerName2, String address2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * @param appointmentDate the appointmentDate to set
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	/**
	 * @return the appointmentTime
	 */
	public LocalDateTime getAppointmentTime() {
		return appointmentTime;
	}

	/**
	 * @param appointmentTime the appointmentTime to set
	 */
	public void setAppointmentTime(LocalDateTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	/**
	 * @return the designerName
	 */
	public String getDesignerName() {
		return designerName;
	}

	/**
	 * @param designerName the designerName to set
	 */
	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public void showApptDetails() {

		System.out.println("Date of Appointment: " + appointmentDate);
		System.out.println("Time of Appointment: " + appointmentTime);
		System.out.println("Designer Name: " + designerName);
		System.out.println("Address of Appointment: " + address);
	}
}
