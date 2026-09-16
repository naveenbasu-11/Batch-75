package Abstraction;

public class AnimalAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Animal world------");
		System.out.println("*********Dog info**********");
		Animal d=new Dog();
		d.sound();
		d.eat();
		d.walk();
		System.out.println("**********Cat info***********");
		Animal c=new cat();
		c.sound();
		c.eat();
		c.walk();
		System.out.println("**********Monkey info***********");
		Animal m=new monkey();
		m.sound();
		m.eat();
		m.walk();
		
	}

}
