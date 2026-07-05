package exams;

	public class exam2 {
		
		
		int empAnnualBonus;
		void calculate() {
			int empId=101;
			String EmpName="krishna";
			int empSalary=5000;
			int HireDate=2026;
			int empAnnualBonus=10;
			
			System.out.println("Employee id:"+empId);
			System.out.println("Employee Name:"+EmpName);
			System.out.println("Employee Salary:"+empSalary);
			System.out.println("Employee Hire Date:02-july-"+HireDate);
			exam2 v=new exam2();
			System.out.println(v.empAnnualBonus+"Employee Annual Bonus:10%");
			
			int AnnualSalary=5000*12;
			System.out.println("Annual Salary:"+AnnualSalary);
			
			double Amount=60000;
			double percentage=10;
			double result=(Amount * percentage)/100;
			System.out.println("Emloyee Annual Bonus:"+result);
			System.out.println("Total salary:"+(Amount+result));
			
			
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			exam2 v=new exam2();
			v.calculate();
		
		}

	}



