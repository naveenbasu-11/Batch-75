package nestedif;
import java.util.Scanner;
public class marriageProfile {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---------MATRIMONIAL APPLICATION---------");
		System.out.println("enter your name:");
		String name=sc.nextLine();
		
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		
		System.out.println("enter your assests:");
		double assests=sc.nextDouble();
		
		System.out.println("enter your education:");
		String education=sc.nextLine();
		
		System.out.println("enter your job:");
		String job=sc.nextLine();
		
		System.out.println("Health status(fit/unfit):");
		String health=sc.nextLine();
		
		System.out.println("do you smoke or drink(yes/no):");
		String habbits=sc.nextLine();
		
		System.out.println("family status(good/average)");
		String family=sc.nextLine();
		
		String result;
		
		if(assests>=50000000 && salary>=1500000 &&
				age>=22 && age<=29 &&
				health.equalsIgnoreCase("fit") &&
				habbits.equalsIgnoreCase("no") &&
				family.equalsIgnoreCase("good")) {
			
			result="MATCH FOUND";
		}else {
			result="NOT ELIGIBLE";
		}
		
		System.out.println();
		System.out.println("-------MATRIMONIAL REPORT-------");
				System.out.println("Name:"+name);
				System.out.println("age:"+age);
				System.out.println("salary:"+salary);
				System.out.println("Assests:"+assests);
				System.out.println("education:"+education);
				System.out.println("job:"+job);
				System.out.println("Health:"+health);
				System.out.println("Habbits:"+habbits);
				System.out.println("Family:"+family);
				System.out.println("Results:"+result);
	}
}
