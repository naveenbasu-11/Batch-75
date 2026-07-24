package Constructors;

//DEFAULT CONSTRUCTOR
public class student {
	
	int id;
	String name;
	String college;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.show();
	}
	void show() {
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Student college:"+college);
	}

}
