package batch75;

import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int chances=3;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
	  int v=r.nextInt(10);
	  
	  for(int i=0;i<=chances;i++) {
	  
		System.out.println("enter a number:");
		int u=sc.nextInt();
		
		if(v==u) {
			System.out.println("you own..!");
			break;
		}else if(chances<=2-1) {
			System.out.println("try again..!");
		}else {
			System.out.println("better luck next time");
			 System.out.println(v);
		}
	  }
	 
		
	}

}
