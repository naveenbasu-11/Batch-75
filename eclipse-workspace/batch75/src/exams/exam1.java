package exams;

public class exam1 {
	static String companyName="GOOGLE";
	int empId;
	String empName;
	int EmpSalary;
	
	
	public static void main(String[]args) {
		
		System.out.println("Company Name:"+companyName);
		System.out.println("   ");
		exam1 v=new exam1();
		v.empId=101;
		v.empName="Naveen";
		v.EmpSalary=80000;
		System.out.println("Employee ID:"+v.empId);
		System.out.println("Employee Name:"+v.empName);
		System.out.println("Employee Salary:"+v.EmpSalary);
		System.out.println("----------------------");
		exam1 n=new exam1();
		n.empId=102;
		n.empName="saketh";
		n.EmpSalary=70000;
		System.out.println("Employee Id:"+n.empId);
		System.out.println("Employee Name:"+n.empName);
		System.out.println("Employee Salary:"+n.EmpSalary);
		System.out.println("..");		
		
	}

}
