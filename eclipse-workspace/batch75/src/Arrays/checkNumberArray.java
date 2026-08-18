package Arrays;

import java.util.Scanner;

public class checkNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jersey= {1,99,999,45,33};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a jersey Number:");
		int n=sc.nextInt();
		boolean status=false;
		for(int jer:jersey) {
			if(jer==n) {
				status=true;
				break;
			}
		}
		if(status) {
			System.out.println("this jersey player playing...");
		}else {
			System.out.println("this jersey player not playing.!");
		}
	}

}
