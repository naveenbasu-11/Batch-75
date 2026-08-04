package switchcases;

import java.util.Scanner;

public class hosteRent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-----JR luxuary Pg Hostel-----");
		
		System.out.println("1.two sharing");
		System.out.println("2.three sharing");
		System.out.println("3.four sharing");
		System.out.println("4.five sharing");
		System.out.println("enter your choice:");
		int sharing =sc.nextInt();
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		switch(sharing) {
		case 1:
			int twoSharing=10000;
			if(age>=18) {
				System.out.println("two sharing");
				System.out.println("Rent:"+twoSharing);
			}else {
				System.out.println("Not eligible for Hostel");
			}
			break;
		case 2:
			int threeSharing=8500;
			if(age>=18) {
				System.out.println("three Sharing");
				System.out.println("Rent:"+threeSharing);
			}else {
				System.out.println("Not eligible for Hostel");
			}
			break;
		case 3:
			int fourSharing=7500;
			if(age>=18) {
				System.out.println("four sharing");
				System.out.println("Rent:"+fourSharing);
			}else {
				System.out.println("Not eligible for Hostel");
			}
			break;
		case 4:
			int fiveSharing=6000;
			if(age>=18) {
				System.out.println("five Sahring");
				System.out.println("Rent:"+fiveSharing);
			}else {
				System.out.println("Not eligible for Hostel");
			}
			break;
			default:
				System.out.println("Invalid choice");
		}
	}

}
