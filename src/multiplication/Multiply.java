package multiplication;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  start Number: ");
		int start = input.nextInt();
		
		System.out.println("Enter the end Number: ");  
		int end = input.nextInt();
		
		System.out.println("Enter Multiple: ");
		int multiple = input.nextInt();
		
		System.out.println("***Displaying the "+ multiple + " Times table");
		for(int i = start ; i <=  end;i++)
		{
			System.out.println(multiple + "x"+ i + "= "+ multiple*i );
		}
		
		System.out.println("******************************* ");
		
		
	}

}
