package encapsulation;

 class employee {
	private int empid;
	private String ename;
	private double salary;
	
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public int getEmpid() {
		return empid;	
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setSalary(double salary) {
		
		if(salary>150000) {
			this.salary=salary;
		}
	}
	public double getSalary() {
		return salary;
	}
	 
}
