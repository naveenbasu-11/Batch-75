package switchcases;

import java.util.Scanner;

public class course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-------course fees-------");
		
		System.out.println("1.java--30000");
		System.out.println("2.python--25000");
		System.out.println("3.Data Analytics--20000");
		System.out.println("-------------------");
		
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		
		System.out.println("enter B.tech percentage..?");
		int percentage=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			int java=30000;
			if(percentage>=90) {
				java=java-(java*10/100);
			}
				System.out.println("java course fee:"+java);
				break;
		case 2:
			int python=25000;
			if(percentage>=90) {
				python=python-(python*10/100);
			}
			System.out.println("pyhton course fee:"+python);
			break;
		case 3:
			int dataAnalytics=20000;
			if(percentage>=90) {
				dataAnalytics=dataAnalytics-(dataAnalytics*10/100);
			}
			System.out.println("Data Analytics fee:"+dataAnalytics);
			break;
			default:
				System.out.println("invalid choice");
		}
	}

}
