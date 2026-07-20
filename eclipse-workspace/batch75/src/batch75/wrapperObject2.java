package batch75;

public class wrapperObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int to Integer (converting primitive to Wrapper Object)
		// Auto Boxing
		int a=10;
		Integer WeightObj=Integer.valueOf(a);
		System.out.println("primitive data:"+a);
		System.out.println("wrapper data:"+WeightObj);
		
		//Auto unBoxing
	// Integer to int (converting wrapper Object to primitive)
		Integer b=20;
		int value=b;
		System.out.println("wrapper data:"+b);
		System.out.println("primitive data:"+value);
		
		
		System.out.println("----------------------------");
	// String to int,double and float
		String name="123"; 
		
		//int
		System.out.println("numeric String:"+name);
		int num=Integer.parseInt(name);
		System.out.println("int value:"+num);
		
		//double
		double db=Double.parseDouble(name);
		System.out.println("double value:"+db);
		
		//float
		float f=Float.parseFloat(name);
		System.out.println("float value:"+f);
		
		
	}

}
