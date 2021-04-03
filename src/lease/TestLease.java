package lease;

import java.util.Scanner;

public class TestLease {

	public static void main(String[] args) {
		
		Lease lease1 = new Lease();
		Lease lease2 = new Lease();
		Lease lease3 = new Lease();
		Lease lease4 = new Lease();
		
	     lease1 = getData();
	     lease2 = getData();
	     lease3 = getData();
	    
	   
	     showValues(lease1);
	     lease1.addPetFee();
	     showValues(lease1);
	     
	     showValues(lease2);
	     
	     showValues(lease3);
	    
	     
	     showValues(lease4);


	}
	
	public static  Lease getData() {
		
		Lease rent = new Lease();
		
	       Scanner scanner = new Scanner(System.in);
	       
	       System.out.println("Please enter your name:");
	       String name = scanner.nextLine();
	       rent.setTenantName(name);
	       
	       System.out.println("Please enter your apartment number:");
	       int aptNumber = scanner.nextInt();
	       rent.setApartment(aptNumber);
	       
	       System.out.println("Please enter your monthly rent amount:");
	       double rentMoney = scanner.nextDouble();
	       rent.setRentAmount(rentMoney);

	       System.out.println("Please enter the term of your lease in months:");
	       int months = scanner.nextInt();
	       rent.setLeaseDurration(months);
	       
	       System.out.println(" ");
	       scanner.nextLine();
	       
	       return rent;
	   }
	
	   public static void showValues(Lease lease)
	   {
	      System.out.println("Your lease results: ");
	      
	      System.out.println("Name      : " + lease.getTenantName());
	      System.out.println("partment : " + lease.getApartment());
	      System.out.println("Rent      : " + lease.getRentAmount());
	      System.out.println("Term      : " + lease.getLeaseDurration());
	   }
	

}
