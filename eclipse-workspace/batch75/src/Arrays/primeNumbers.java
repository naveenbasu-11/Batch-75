package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class primeNumbers {

	public static void main(string[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("enter a elements:");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("----prime numbers----");
		for(int n=0;n<size;n++) {
			boolean prime=true;
			if(num[n]<=1) {
				prime=false;
			}else {
				for(int i=2;i<=num[n]/2;i++) {
					if(num[n]%i==0) {
						prime=false;
						break;
					}
				}
				if(prime)
				System.out.println(num[n]);
			}
		}
		
	}

}
