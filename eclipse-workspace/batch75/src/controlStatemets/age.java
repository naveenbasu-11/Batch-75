package controlStatemets;
import java.util.Scanner;
public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		if(age<=12) {
			System.out.println("child");
		}else if(age<=22) {
			System.out.println("teenager");
		}else if(age<=50) {
			System.out.println("adult");
		}else {
			System.out.println("senior citizen");
		}
	}

}
