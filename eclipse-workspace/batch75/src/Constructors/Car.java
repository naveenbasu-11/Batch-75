package Constructors;


// how to use parameterized constructor
public class Car {
	String carName;                
	int carPrice;
	String color;
	
	Car(){
		System.out.println("no arg consrtuctor");
	}
	Car(String carName,int carPrice,String color){
		this.carName=carName;
		this.carPrice=carPrice;
		this.color=color;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.carName="audi";
		c1.carPrice=15000000;
		c1.color="Black";
		c1.show();
		System.out.println("---------------------------------");
		Car c2=new Car("mercedes",1000000,"white");
		c2.show();
	
	}
		
		
		void show() {
		System.out.println("Car Name:"+carName);
		System.out.println("Car Price:"+carPrice);
		System.out.println("Car Color:"+color);
	}

}
