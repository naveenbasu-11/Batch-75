package inheritance;


class student implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public student(int sid,String sname,Address address) {
		this.sid=sid;
		this.sname=sname;
		this.address=address;
	}

}
  class Address{
	  String city;
	  
	  public Address(String city) {
		  this.city=city;
	  }
  }
public class cloneShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address address=new Address("hyderabad");
		student s1=new student(101, "Naveen", address);
		
		student s2=(student)s1.clone();
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(address.city);
		System.out.println("------------------------");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-------------------------");
		
		s2.sid=102;
		s2.sname="bunny";
		s2.address.city="guntur";
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		
	}

}
