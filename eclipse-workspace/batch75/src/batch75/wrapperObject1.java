package batch75;

public class wrapperObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type
		int a=10;
		//Auto boxing
		Integer ageObj=Integer.valueOf(a);
		//auto unBoxing
		int b=ageObj.intValue();
		System.out.println("primitive data:"+a);
		System.out.println("wrapper object:"+ageObj);
		System.out.println("un boxing:"+b);
	}

}
