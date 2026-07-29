package ternaryOperators;
import java.util.Scanner;
public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		String result=(num>=0)?"positive":"negative";
		System.out.println("given number is:"+result);
		
	}

}
