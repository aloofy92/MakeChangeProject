package makechange;

import java.util.Scanner;

public class CashRegister {


	public static void main(String[] args) {

		    Scanner kb = new Scanner(System.in);
		    
		  
		   
		    int changeDollars = 0;
		    int changeCents;
		    int count = 0;
		    int countTwentyDollars = 0;
		    int countTenDollars = 0;
		    int countFiveDollars = 0;
		    int countOneDollars = 0;
		    int countQuarters = 0;
		    int countDimes = 0;
		    int countNickels = 0;
		    int countPennies = 0;
		  
		  
		    
			System.out.println("Enter the price of the item ");
			int price = (int)(kb.nextDouble() * 100);

			System.out.println("Please enter amount tendered ");
			int amountTendered = (int)(kb.nextDouble() * 100);

			
			int totalChange = (int) (amountTendered - price);
			System.out.println("Change total is $ " + totalChange);
			

			
			if(totalChange < 0) {
				System.out.println("Error: Not enough funds");
		  } else if (totalChange == 0) {
			  System.out.println("Error: paid with exact change");
		 
		  }
		  else {
			  
		  while (totalChange > 0) {
			  
				if (count > 0) {
					count = changeDollars/ 20;
				    System.out.println("Your change is " + count + " $20 Dollar bills");
				    changeDollars %= 20;
				}
				if (count > 0) {
					count = changeDollars/ 10;
					System.out.println("Your change is " + count + " $10 Dollar bills");
					changeDollars %= 10;
				}
				if (count > 0) {
					count = changeDollars/ 5;
					System.out.println("Your change is " + count + " $5 Dollar bills");
					changeDollars %= 5;
				}
				if (count > 0) {
					count = countOneDollars/ 1;
					System.out.println("Your change is " + count + " $1 Dollar bills");
					countOneDollars %= 1;
				}
		  }
		  
			
				
				changeCents = (int) ((totalChange + 0.005) - totalChange);
				changeCents *= 100;
				
				
				if (count > 0) {
					count = changeCents / 25;
					System.out.println("Your change is " + count + " Quarters");
					changeCents %= 20;
				}
				if (count > 0) {
					count = changeCents / 10;
					System.out.println("Your change is " + count + "Dimes");
					changeCents %= 10;
				}
				if (count > 0) {
					count = changeCents /  5;
					System.out.println("Your change is " + count + " Nickels");
					changeCents %= 5;
				}
				if (count > 0) {
					count = changeCents / 1;
					System.out.println("Your change is " + count + " Pennies");
					changeCents %= 1;
				}
				
				
				}
				
				while(true);
			}
	}

			
//		if( totalChange % (20 * 100) >=0) {
//		countTwentyDollars = (int)(totalChange / (20 * 100));
//		totalChange = totalChange - (countTwentyDollars * 20 * 100);
//		System.out.println("Change is " + count + "20 dollar bills");
		
//		  }
		  
//		if( totalChange % (10 * 100) >=0) {
//			countTenDollars = (int)(totalChange / (10 * 100));
//			totalChange = totalChange - (countTenDollars * 10 * 100);
//			System.out.println("Change is " + count + "10 dollar bills");
			
//		}
		
//		if( totalChange % (5 * 100) >=0) {
//		    countFiveDollars = (int)(totalChange / (5 * 100));
//			totalChange = totalChange - (countFiveDollars * 20 * 100);
//			System.out.println("Change is " + count + "5 dollar bills");
				
//		}
//		if( totalChange % (1 * 100) >=0) {
//		    countOneDollars = (int)(totalChange / (1 * 100));
//			totalChange = totalChange - (countOneDollars * 20 * 100);
//			System.out.println("Change is " + count + "1 dollar bills");
//		}
			
//		if( totalChange % 25 >= 0) {
//			countQuarters = (int)(totalChange / 25);
//			totalChange = totalChange - (countQuarters * 25);
//			System.out.println("Change is " + count + "Quarters");
//		}
				
//		if( totalChange % 10 >= 0) {
//			countDimes = (int)(totalChange / (10 / 25));
//			totalChange = totalChange - (countDimes * 10 * 100);
//			System.out.println("Change is " + count + "Dimes");
//		}	
//		if( totalChange % 5 >= 0) {
//			countNickels = (int)(totalChange / (5 * 100));
//			totalChange = totalChange - (countNickels * 5 * 100);
//			System.out.println("Change is " + count + "Nickels");
			
//		}
		
//		if( totalChange % 1 >= 0) {
//			countNickels = (int)(totalChange / (5 * 100));
//			totalChange = totalChange - (countNickels * 5 * 100);
//			System.out.println("Change is " + count + "Nickels");

	
//	}
	
		

		
	
