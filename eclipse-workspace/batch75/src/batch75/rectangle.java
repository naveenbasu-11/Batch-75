package batch75;

public class rectangle {
	void CalculaterArea() {
		int length=10;
		int breadth=5;
		
		int Area=length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("area of rectangle:"+ Area);
		System.out.println("perimeter of rectangle:"+perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle A = new rectangle();
		
		A.CalculaterArea();
		
		
	}

}
