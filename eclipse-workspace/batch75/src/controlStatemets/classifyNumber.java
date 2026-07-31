package controlStatemets;
import java.util.Scanner;
public class classifyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		if(num>=1) {
			System.out.println("given number= positive");
		}else if(num==0) {
			System.out.println("given number= 0");
		}else {
			System.out.println("given number= negative");
		}
	}

}
