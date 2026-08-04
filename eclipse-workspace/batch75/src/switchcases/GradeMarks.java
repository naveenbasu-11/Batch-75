package switchcases;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks:");
		int marks=sc.nextInt();
		
		switch(marks/10) {
		case 9:
			System.out.println("grade A");
			break;
		case 8:
			System.out.println("grade B");
			break;
		case 7:
			System.out.println("grade C");
			break;
		case 6:
			System.out.println("grade D");
			break;
		case 5:
			System.out.println("grade E");
			break;
			default:
				System.out.println("Fail");
		}
	}

}
