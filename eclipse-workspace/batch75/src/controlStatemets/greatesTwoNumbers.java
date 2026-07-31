package controlStatemets;
import java.util.Scanner;
public class greatesTwoNumbers {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a+": is the greatest number");
		}else if(b>=a && b>=c) {
			System.out.println(b+" :is the greatest number");
		}else {
			System.out.println(c+" :is the greatest number");
		}
	}

}
