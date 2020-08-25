import java.time.LocalDate;

public class ManageQuotations {
	private String requestID;
	private String quotationID;
	private String renoCat;
	private String renoItem;
	private double price;
	private String designerName;
	private LocalDate startDate;

	public ManageQuotations(String requestID, String quotationID, String renoCat, String renoItem, double price,
			String designerName, LocalDate startDate) {
		this.requestID = requestID;
		this.quotationID = quotationID;
		this.renoCat = renoCat;
		this.renoItem = renoItem;
		this.price = price;
		this.designerName = designerName;
		this.startDate = startDate;
	}
	
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	
	public String getRequestID() {
		return requestID;
	}
	
	public void setQuotationID(String quotationID) {
		this.quotationID = quotationID;
	}
	
	public String getQuotationID() {
		return quotationID;
	}
	
	public void setRenoCat(String renoCat) {
		this.renoCat = renoCat;
	}
	
	public String getRenoCat() {
		return renoCat;
	}
	
	public void setRenoItem(String renoItem) {
		this.renoItem = renoItem;
	}
	
	public String getRenoItem() {
		return renoItem;
	}
	
	public void setPrice(double pri) {
		price = pri;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}
	
	public String getDesignerName() {
		return designerName;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void display() {
		System.out.println("Request ID: " + requestID + "\n");
		System.out.println("Quotation ID: " + quotationID + "\n");
		System.out.println("Renovation category: " + renoCat + "\n");
		System.out.println("Renovation item: " + renoItem + "\n");
		System.out.println("Price: " + price + "\n");
		System.out.println("Designer name: " + designerName + "\n");
		System.out.println("Earliest start date: " + startDate + "\n");
	}
}
