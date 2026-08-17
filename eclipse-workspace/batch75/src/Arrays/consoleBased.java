
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class consoleBased {

	public static void main(string[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int size=sc.nextInt();
		int[]number=new int[size];
		
		System.out.println("enter a elements:");
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		
		System.out.println("-----even number-------");
		for(int n=0;n<size;n++) {
			if(number[n]%2==0) {
				System.out.println(number[n]);
			}
			
		}
		
	
	}

}
