package lease;

public class Lease {
	
	private String tenantName;
	private int apartment;
	private double rentAmount;
	private int leaseDurration;
	
	private static final int petFee = 10;
	
	public Lease() {
		super();
		tenantName = "XXX";
		apartment = 0;
		rentAmount = 1000;
		leaseDurration = 12;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public int getApartment() {
		return apartment;
	}

	public void setApartment(int apartment) {
		this.apartment = apartment;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double sampleRent) {
		this.rentAmount = sampleRent;
	}

	public int getLeaseDurration() {
		return leaseDurration;
	}

	public void setLeaseDurration(int leaseDurration) {
		this.leaseDurration = leaseDurration;
	}
	
	public void addPetFee() {
		rentAmount = rentAmount + petFee;
		explainPetPolicy();
	}
	
	public static void explainPetPolicy() {
		
		 System.out.println("A pet fee of $10 is added to your monthly rent");
	}
	
	
	

}
