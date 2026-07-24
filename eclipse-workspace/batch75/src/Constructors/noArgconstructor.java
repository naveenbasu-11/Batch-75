package Constructors;

// --------NO ARG CONSTRUCTOR---------
public class noArgconstructor {
	int id;
	String name;
	String college;
	
	noArgconstructor(){
		id=101;
		name="saketh";
		college="CBIT";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noArgconstructor c=new noArgconstructor();
		c.display();
	}
	void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("college Name:"+college);
	}

}
