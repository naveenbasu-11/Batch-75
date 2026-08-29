package inheritance;

 class student1{
	 int sid;
	 String ename;
	 Address1 address1;
	 
	 public student1(int sid,String ename,Address1 address1) {
		 this.sid=sid;
		 this.ename=ename;
		 this.address1=address1;
	 }
	 
	 public student1(student1 s1) {
		 this.sid=sid;
		 this.ename=ename;
		 this.address1=new Address1(s1.address1);
	 }
 }
  class Address1{
	  String city;
	  
	  public Address1(String  city ) {
		  this.city=city;
	  }
	  public Address1(Address1 address1) {
		this.city=address1.city;
	  }
  }
 

public class deepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address1 address1=new Address1("hyderabad");
		student1 s1=new student1(101,"naveen",address1);
		
		student1 s2=new student1(s1);
		s2.address1.city="guntur";
		
		System.out.println(s1.sid);
		System.out.println(s1.ename);
		System.out.println(s1.address1.city);
		System.out.println("---------------------------");
		System.out.println(s1.sid);
		System.out.println(s1.ename);
		System.out.println(s2.address1.city);
		

	}

}
