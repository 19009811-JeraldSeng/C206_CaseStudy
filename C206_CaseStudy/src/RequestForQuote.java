import java.time.LocalDate;

public class RequestForQuote {
	private String requestID;
	private String propertyType;
	private double areaSize;
	private String requestName;
	private int contact;
	private String eMail;
	private double budget;
	private LocalDate targetCompletionDate;
	private String renovationType;
	private int numRooms;
	private int numToilets;
	private String renovationStyle;
	private String urgency;

	public RequestForQuote(String requestID, String propertyType, double areaSize, String requestName, int contact,
			String eMail, double budget, LocalDate targetCompletionDate, String renovationType, int numRooms,
			int numToilets, String renovationStyle, String urgency) {
		this.requestID = requestID;
		this.propertyType = propertyType;
		this.areaSize = areaSize;
		this.requestName = requestName;
		this.contact = contact;
		this.eMail = eMail;
		this.budget = budget;
		this.targetCompletionDate = targetCompletionDate;
		this.renovationType = renovationType;
		this.numRooms = numRooms;
		this.numToilets = numToilets;
		this.renovationStyle = renovationStyle;
		this.urgency = urgency;
	}

	public String getRequestID() {
		return requestID;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public double getAreaSize() {
		return areaSize;
	}

	public String getRequestName() {
		return requestName;
	}

	public int getContact() {
		return contact;
	}

	public String getEmail() {
		return eMail;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

	public LocalDate getTargetCompletionDate() {
		return targetCompletionDate;
	}

	public void setRenovationType(String renovationType) {
		this.renovationType = renovationType;
	}

	public String getRenovationType() {
		return renovationType;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public int getNumToilets() {
		return numToilets;
	}

	public void setRenovationStyle(String renovationStyle) {
		this.renovationStyle = renovationStyle;
	}
	
	public String getRenovationStyle() {
		return renovationStyle;
	}
	
	public void setUrgency(String urgent) {
		this.urgency = urgent;
	}
	
	public String getUrgency() {
		return urgency;
	}
	
	public void displayAll() {
		System.out.println("Request ID: " + requestID);
		System.out.println("Property type: " + propertyType);
		System.out.println("Area size: " + areaSize);
		System.out.println("Request name: " + requestName);
		System.out.println("Contact: " + contact);
		System.out.println("Email: " + eMail);
		System.out.println("Budget: " + budget);
		System.out.println("Target completion date: " + targetCompletionDate);
		System.out.println("Renovation type: " + renovationType);
		System.out.println("Number of rooms to renovate: " + numRooms);
		System.out.println("Number of toilets to renovate: " + numToilets);
		System.out.println("Renovation style: " + renovationStyle);
		System.out.println("Urgent: " + urgency);
	}
}
