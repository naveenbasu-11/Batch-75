package switchcases;

import java.util.Scanner;

public class movie {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.silver ticket-200");
		System.out.println("2.gold ticket-300");
		System.out.println("3.platinum-500");
		System.out.println("4.Exit");
		System.out.println("-------------------------");
		
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		
		
		if(choice==4) {
			System.out.println("thank you.. visit again");
		}else {
			System.out.println("enter your age:");
			int age=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				int silverprice=200;
				if(age>=50) {
					silverprice=silverprice-(silverprice*10/100);
				}
					System.out.println("silver price:"+silverprice);
					break;
				
			case 2:
				int goldprice=300;
				if(age>=60) {
					goldprice=goldprice-(goldprice*10/100);
				}
					System.out.println("Gold price:"+goldprice);
					break;
				
			case 3:
				int platinumprice=500;
				if(age>=60) {
					platinumprice=platinumprice-(platinumprice*10/100);
				}
					System.out.println("platinum price:"+platinumprice);
					break;
				
				default:
					System.out.println("Invalid Ticket type..");
			}
			
		
		}
	}
	
}
