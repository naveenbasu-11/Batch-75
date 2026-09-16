package polymorphism;

// Area of triangle
//area of rectangle
//area of square

  class A{
	  //area of triangle
	  void area(double base,double height) {
		  System.out.println("Area of Triangle:"+0.5 * base * height);
	  }
  
  //area of rectangle
  void area(int length, int breadth) {
	  System.out.println("Area of Reactangle:"+length * breadth);
  }
  void area(int side) {
	  System.out.println("Area of Square:"+side * side);
  }
  }

public class overloadind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.area(6, 8);
		a.area(12, 6);
		a.area(7);

	}

}
