package twoDArrays;

import java.util.Scanner;

public class empDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[][] emp=new String[2][4];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("enter a employees details"+(i+1));
			
			System.out.println("enter empId:");
			emp[i][0]=sc.nextLine();
			
			System.out.println("enter empName:");
			emp[i][1]=sc.nextLine();
			
			System.out.println("enter empSalary:");
			emp[i][2]=sc.nextLine();
			
			System.out.println("enter empAge:");
			emp[i][3]=sc.nextLine();
		}
		System.out.println("---Employee Details---");
		System.out.println("EmpId\tEmpname\tEmpSal\tEmpAge");
		for(String[] row:emp) {
			for(String e:row) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}

}
