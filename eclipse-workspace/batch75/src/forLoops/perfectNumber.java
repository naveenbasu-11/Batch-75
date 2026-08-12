package forLoops;
import java.util.Scanner;

public class perfectNumber {
	static int sum=0;
	static void factor(int n) {
		for(int i=1;i<=100;i++) {
			
		}
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			System.out.println(i);	
			
			}
		}
		if(sum==n) {
			System.out.println("perfect Number");
		}else {
			System.out.println("Not a perfect Number");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter a number:");
		int n=sc.nextInt();
		factor(n);
}
}
