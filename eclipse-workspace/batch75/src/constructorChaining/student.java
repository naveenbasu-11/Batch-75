package constructorChaining;

public class student {
	int id;
	String name;
	String course;
	
	student(){
		this(101);
	}
	student(int id){
		this(id,"naveen");
	}
	student(int id,String name){
		this(id,name,"Java");
	}
	student(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	void display() {
		System.out.println("------Student Details----------");
		System.out.println("Student Id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student course:"+course);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		student s1=new student(102,"vasu","python");
		student s2=new student(103,"saketh","data science");
		s.display();
		s1.display();
		s2.display();
	}

}
