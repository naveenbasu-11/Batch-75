package batch75;
import java.util.Scanner;
public class salarySlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		salarySlip sal=new salarySlip();
		
		System.out.println("enter employee Name:");
		String employeeName=sc.nextLine();
		
		System.out.println("enter basic Salary:");
		double basicSalary=sc.nextDouble();
		 sal.SalarySlip(employeeName, basicSalary);
		
		
	}
	void SalarySlip(String employeeName,double basicSalary) {
		double hra=basicSalary*20/100;
		double Da=basicSalary*10/100;
		double GrossSalary=basicSalary+hra+Da;
		System.out.println("Employee Name:"+employeeName);
		System.out.println("employee Salary:"+basicSalary);
		System.out.println("Hra()20%:"+hra);
		System.out.println("Da(10%):"+Da);
		System.out.println("Gross Salary:"+GrossSalary);
		
	}

}
