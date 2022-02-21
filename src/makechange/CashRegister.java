package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
		    
		    int changeTotal;
		    int changeBills;
		    int count = 0;
		    int countTwentyDollarbills = 0;
		    int countTenDollarbills = 0;
		    int countFiveDollarbills = 0;
		    int countOneDollarbills = 0;
		    
		    int countQuarters = 0;
		    int countDimes = 0;
		    int countNickles = 0;
		    int countPennies = 0;
		  
		  
		    
			System.out.println("Enter the price of the item ");
			double price = (sc.nextDouble() * 100);

			System.out.println("Please enter amount tendered ");
			double amountTendered = (sc.nextDouble() *100);

			double sale = 0;
			int totalChange = (int) (amountTendered - sale);
			System.out.println("Change total is $ " + totalChange);
			
		    int totalChange1 = (int) (amountTendered - price);

			
			if(totalChange < 0) {
				System.out.println("Error: Not enough funds");
		  } else if (totalChange == 0) {
			  System.out.println("Error: paid with exact change");
		  }
	
		
		else {
				
		while (totalChange > 0) {
					  
				 
		
		if (totalChange % (20 * 100) >= 0) {
		    countTwentyDollarbills = (int)(totalChange / (20 * 100));
			System.out.println("Change due" + count + "20 Dollar Bills");
		}
		if (totalChange % (10 * 100) >= 0) {
			countTenDollarbills = (int)(totalChange / (10 * 100));
			System.out.println("Change due" + count + "10 Dollar Bills");
	}
		if (totalChange % (5 * 100) >= 0) {
		    countFiveDollarbills = (int)(totalChange / (5 * 100));
			System.out.println("Change due" + count + "5 Dollar Bills");
	}
		if (totalChange % (1 * 100) >= 0) {
			countOneDollarbills = (int)(totalChange / (1 * 100));
			System.out.println("Change due" + count + "1 Dollar Bills");
	}
	
		if (totalChange % 25 >=0) {
			countQuarters = (int) (totalChange / 25);
			totalChange = totalChange - (countQuarters * 25);
			System.out.println("Change due" + count + "Quarter");
	}
		if (totalChange % 10 >=0) {
			countQuarters = (int) (totalChange / 10);
			totalChange = totalChange - (countQuarters * 10);
			System.out.println("Change due" + count + "Dime");
	}
		if (totalChange % 5 >=0) {
			countQuarters = (int) (totalChange / 5);
			totalChange = totalChange - (countQuarters * 5);
			System.out.println("Change due" + count + "Nickles");
	}
			
		if (totalChange % 1 >=0) {
		   countQuarters = (int) (totalChange / 1);
		   totalChange = totalChange - (countQuarters * 1);
		   System.out.println("Change due" + count + "Pennies");
	}
				 

		
		} }} 
}
	
	
	


//      OR THIS WAY MAYBE???

//		System.out.println("Enter amount");
//		double price = 0;
//		double amountTendered = (int) (price * 100);

//		double TwentyDollarBills = amountTendered / 100;
//		price = amountTendered % 100;
//		System.out.println("Change is " + "20 dollar bills");

//		double tenDollarBills = amountTendered / 100;
//		price = amountTendered % 100;
//		System.out.println("Change is 10 dollar bills");

//		double fiveDollarBills = amountTendered / 100;
//		price = amountTendered % 100;
//		System.out.println("Change is 5 dollar bills");

//		double oneDollarBills = amountTendered % 100;
//		price = amountTendered % 100;
//		System.out.println("Change is 1 dollar bills");
//	}
//	{
//		double price = 0;
//		double changeTotal = 0;
//		double amountTendered = 0;
//		double changeCents = (changeTotal + 0.005) - (double) (changeTotal * 100);

//		double Quarters = amountTendered / 25;
//		amountTendered = amountTendered % 25;
//		System.out.println("Change due is " + "Quarters");

//		double Dimes = amountTendered / 10;
//		amountTendered = amountTendered % 100;
//		System.out.println("Change due is " + "dimes");

//		double Nickles = amountTendered / 5;
//		amountTendered = amountTendered % 5;
//		System.out.println("change due is " + "Nickles");

//		double Pennies = amountTendered / 1;
//		amountTendered = amountTendered % 1;
//		System.out.println("Change due is" + "Pennies");

//	}

// }
